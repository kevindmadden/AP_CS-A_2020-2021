import java.awt.*;

public class Main {

    public static void main(String[] args) {

        StdDraw.setCanvasSize(700, 600);

        StdDraw.setXscale(-0.0, +7); //7 columns
        StdDraw.setYscale(-0.0, +6); //6 rows
        StdDraw.enableDoubleBuffering();


        int[][] board = new int[6][7]; //[y][x]

        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < 7; col++) {
                board[row][col] = 0;
            }
        }

        int mostRecentlyPlaced = 0;
        int pieceToPlaceNext = 1;

        boolean isMousePressedTracker = false;
        boolean didClickOccur = false;

        double timeElapsed = 0.017;
        while (true) {
            StdDraw.clear();

        /* * * * * * * * * * * *
            Drawing (View)
         * * * * * * * * * * * */

            //Draw Board Grid
            for (int x = 0; x < 7; x++) {
                for (int y = 0; y < 6; y++) {
                    StdDraw.setPenColor(Color.black);
                    StdDraw.circle(x + 0.5, y + 0.5, .5);
                }
            }


            //Draw Board red and yellow pieces
            for (int x = 0; x < 7; x++) {
                for (int y = 0; y < 6; y++) {
                    if (board[y][x] == 1) {
                        StdDraw.setPenColor(Color.red);
                        StdDraw.filledCircle(x + 0.5, y + 0.5, .5);
                    } else if (board[y][x] == 2) {
                        StdDraw.setPenColor(Color.yellow);
                        StdDraw.filledCircle(x + 0.5, y + 0.5, .5);
                    }
                }
            }


        /* * * * * * * * * * * *
            Game Logic (Model)
         * * * * * * * * * * * */
            if (mostRecentlyPlaced == 1) {
                pieceToPlaceNext = 2;
            } else if (mostRecentlyPlaced == 2) {
                pieceToPlaceNext = 1;
            }

            int result = checkForWinner(board);

            if(result==1){
                System.out.println("Player 1 won!");
                System.exit(0);
            }if (result==2){
                System.out.println("Player 2 won!");
                System.exit(0);
            }if (result==3){
                System.out.println("Tie Game!");
                System.exit(0);
            }
            //Add stuff for other winners/tie.








            /* * * * * * * * * * * *
                User Input (Controller)
             * * * * * * * * * * * */

            if (StdDraw.isMousePressed()) {
                isMousePressedTracker = true;
            }
            if (!StdDraw.isMousePressed()) {
                if (isMousePressedTracker) {
                    didClickOccur = true;
                    isMousePressedTracker = false;
                }
            }

            if (didClickOccur) {
                didClickOccur = false;
                //    System.out.println("x:" + StdDraw.mouseX() + " y:" + StdDraw.mouseY()); //log
                int xClicked = (int) (StdDraw.mouseX());
                int yClicked = (int) (StdDraw.mouseY());
                //    System.out.println("board[" + xClicked + "][" + yClicked + "]"); //log
                for (int j = 0; j < 6; j++) { //piece goes in lowest possible row
                    if (board[j][xClicked] == 0) {
                        board[j][xClicked] = pieceToPlaceNext;
                        mostRecentlyPlaced = pieceToPlaceNext;
                        break;
                    }
                }
            }


            StdDraw.show();
            StdDraw.pause((int) (timeElapsed * 1000));

        }

    }

    public static int checkForWinner (int[][] board){
        for (int i = 0; i < 2; i++) {
            int player = 1;
            if (i == 1) {
                player = 2;
            }


            //horizontal
            for (int col = 0; col <= 3; col++) {
                for (int row = 0; row <= 5; row++) {
                    if ((board[row][col] == player) && (board[row][col + 1] == player) && (board[row][col + 2] == player) && (board[row][col + 3] == player)) {
                        return player;
                    }
                }
            }

            //vertical
            for(int col = 0; col <=6; col++){
                for(int row = 0; row <=5; row++){
                    if((board[row][col] == player) && (board[row+1][col]  == player) && (board[row][col+2] == player) && (board[row][col+3]  == player) ){

                    }
                }
            }


        }

        //Count up the number of occupied spaces on the board (count up how many tokens are currently played.

        //check for tie
        int counter = 0;
        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < 7; col++) {
                if(board[row][col]==1 || board[row][col]==2){                        //if, player 1 has a piece at board[row][col] or player 2 does => increment the counter by 1
                    counter++;
                }if(counter==42){                //check to see if counter==42. If it is, then it's a tie.
                    return 3;
                }
            }
        }

        return 0;
    }

}




















