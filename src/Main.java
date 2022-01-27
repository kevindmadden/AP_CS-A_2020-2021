import java.util.Scanner;
public class Main {
    public static void main(String args[]) {

        StdDraw.setXscale(-0.0, +7);
        StdDraw.setYscale(-0.0, +6);
        StdDraw.enableDoubleBuffering();

        /* Initial Values */
        int[][] board = new int[6][7];

        //Two ways of dealing with the default null values that are present in String arrays
        //1. Doing a null check - Check to see if the String is not null before running anything else (short-circuiting)
        //2. Choose a different default value!!! (So that you don't have to worry about handling null!)

        int boss = 0;
        int ross = 1;
        int mostRecentlyPlaced = 0;
        int pieceToPlaceNext = 2;

        boolean isMousePressedTracker = false;
        boolean didClickOccur = false;


        double timeElapsed = 0.017; //formerly called "dt". This is number of seconds between each frame of the animation -  0.017 milliseconds is the same as 60fps
        while (true) {
            StdDraw.clear();

            /* * * * * * * * * * * *
                Drawing (View)
             * * * * * * * * * * * */

            //Draw Board Grid
            for (int x = 0; x < 7; x++) {
                for (int y = 0; y < 6; y++) {
                    StdDraw.square(x + 0.5, y + 0.5, .5);
                }
            }

            //Draw Board x's and o's
            for (int x = 0; x < 7; x++) {
                for (int y = 0; y < 6; y++) {
                    if (board[y][x] == 2) {
                        StdDraw.setPenColor(StdDraw.BLUE);
                        StdDraw.filledCircle(x + 0.5, y + 0.5, .4);
                    } else if (board[y][x] == 1) {

                        StdDraw.setPenColor(StdDraw.RED);
                        StdDraw.filledCircle(x + 0.5, y + 0.5, 0.4);

                    }
                }
            }

            /* * * * * * * * * * * *
                Game Logic (Model)
             * * * * * * * * * * * */
            if (mostRecentlyPlaced == 2) {
                pieceToPlaceNext = 1;
            } else if (mostRecentlyPlaced == 1) {
                pieceToPlaceNext = 2;
            }



            int result = checkForWinner(board);
            if(result==1){
                //print out player 1 won
                //exit the game
                System.out.println("Player One got the dub");
                System.exit(0);
            }else if(result==2){
                //print out player 2 won
                //exit the game
                System.out.println("Player Two got the dub");
                System.exit(0);

            }else if(result==3){
                //print out there's a tie
                //exit the game
                System.out.println("Tie");
                System.exit(0);

            }





            /* * * * * * * * * * * *
                User Input (Controller)
             * * * * * * * * * * * */

            if (StdDraw.isMousePressed()) {
                isMousePressedTracker = true;
            }
            if (!StdDraw.isMousePressed()) {
                if (isMousePressedTracker) {
                    //System.out.println("Click occurred!");
                    didClickOccur = true;
                    isMousePressedTracker = false;
                }
            }




            if (didClickOccur) {
                didClickOccur = false;
                System.out.println("x:" + StdDraw.mouseX() + " y:" + StdDraw.mouseY()); //log

                int xClicked = (int) (StdDraw.mouseX());
                for (int y = 0; y <= 5; y++) {
                    System.out.println("board[" + xClicked + "][" + y + "]"); //log
                    if (board[y][xClicked]== 0) {
                        board[y][xClicked] = pieceToPlaceNext;
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
        for (int player = 1; player < 3; player++) {

            for (int col = 0; col < 5; col++) {

                //Check horizontal win possibilities

                for (int row = 0; row < 5; row++) {
                    if (board[row][col] == player && board[row][col + 1] == player && board[row][col + 2] == player && board[row][col + 3] == player) {
                        // Start 0,0, then 0+1, 0+2, 0+3, then its going to go through the row value next, so check 1,0, then 1,1, 1,2, 1,3. etc.
                        //System.out.println(player + " wins!");
                        //System.exit(0);
                        return player;
                    }
                }
            }

            for (int row = 0; row < 3; row++) {
                //Check vertical win possibilities
                for (int col = 0; col < 7; col++) {
                    if (board[row][col] == player && board[row+1][col] == player && board[row+2][col] == player && board[row+3][col] == player) {
                        //System.out.println(player + " wins!");
                        //System.exit(0);
                        return player;
                    }
                }
            }



            for (int row = 0; row < 3; row++) {
                //Check for diagonal possibilities 1
                for (int col = 0; col < 4; col++) {
                    if ((board[row][col] == player) && (board[row + 1][col] == player) && (board[row + 2][col] == player) && (board[row + 3][col] == player)) {
                        //System.out.println(player + " wins!");
                        //System.exit(0);
                        return player;
                    }

                }
            }

            for (int row = 0; row < 3; row++) {
                //Check for diagonal possibilities 2
                for (int col = 0; col < 3; col++) {
                    if ((board[row][col] == player) && (board[row + 1][col + 1] == player) && (board[row + 2][col + 2] == player) && (board[row + 3][col + 3] == player)) {
                        //System.out.println(player + " wins!");
                        //System.exit(0);
                        return player;
                    }
                }
            }

            for (int row = 0; row < 3; row++) {
                //Check for diagonal possibilities 3
                for (int col = 3; col < 4; col++) {
                    if ((board[row][col] == player) && (board[row + 1][col - 1] == player) && (board[row + 2][col - 2] == player) && (board[row + 3][col - 3] == player)) {
                        //System.out.println(player + " wins!");
                        //System.exit(0);
                        return player;
                    }
                }
            }

        }



        int counter =  0;
        for (int row = 0; row <=5; row++){
            for(int col = 0; col <=6; col++){
                if((board[row][col] > 0)){
                    counter++;



                }
            }
        }
        if(counter == 42){
            System.out.println("Stalemate");
            return 3;
        }


        // You'll need code to check for a tie right here, and return a 3 if there's a tie.
        // Checking every single spot on the board.
        // Have a counter variable that starts at 0.
        // Increment the counter by 1 (counter++) for every time you encounter a 1 or a 2 in a spot on your board.
        // Since the board is 6 by 7, there are 42 total spots. So... if the counter reaches 42, you know there's a tie!

        return 0;
    }


}