import java.awt.*;

public class Main {

    public static int checkForWinner (int[][] board) {


        for (int i = 0; i < 2; i++) {
            int player = 1;
            if (i == 1) {
                player = 2;
            }
            //Check vertical win possibilities
            for (int col = 0; col < 7; col++) {
                for (int z = 0; z < 3; z++) {
                    if (board[col][z] == player && board[col][z + 1] == player && board[col][z + 2] == player && board[col][z + 3] == player) {
                        System.out.println("Player " + player + " wins!");
                        return player;


                    }
                }

            }
            //Check horizontal win possibilities
            for (int row = 0; row < 6; row++) {
                for (int x = 0; x < 4; x++) {
                    if (board[x][row] == player && board[x + 1][row] == player && board[x + 2][row] == player && board[x + 3][row] == player) {
                        System.out.println("Player " + player + " wins!");
                        return player;

                    }
                }

            }
            //Check diagonal possibilities
            for (int diag1 = 0; diag1 < 3; diag1++) {
                for (int diag2 = 0; diag2 < 4; diag2++) {
                    if (board[diag2][diag1] == player && board[diag2 + 1][diag1 + 1] == player && board[diag2 + 2][diag1 + 2] == player && board[diag2 + 3][diag1 + 3] == player) {
                        System.out.println("Player " + player + " wins!");
                        return player;

                    }
                }
            }
            for (int diag3 = 0; diag3 < 3; diag3++) {
                for (int diag4 = 4; diag4 > 0; diag4--) {
                    if (board[diag4][diag3] == player && board[diag4 - 1][diag3 + 1] == player && board[diag4 - 2][diag3 + 2] == player && board[diag4 - 3][diag3 + 3] == player) {
                        System.out.println("Player " + player + " wins!");
                        return player;

                    }
                }
            }

        }
        return 0;
    }



    public static void main(String args[]) {


        boolean leaveForLoopEarly = false;
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (leaveForLoopEarly && i == 5) {
                break;
            }
        }

        StdDraw.setXscale(-0.0, +7);
        StdDraw.setYscale(-0.0, +6);
        StdDraw.enableDoubleBuffering();

        /* Initial Values */
        int[][] board = new int[7][6];
        //Two ways of dealing with the default null values that are present in String arrays
        //1. Doing a null check - Check to see if the String is not null before running anything else (short-circuiting)
        //2. Choose a different defa 6; row++){


        int mostRecentlyPlaced = 0;
        int pieceToPlaceNext = 1;

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
                    StdDraw.square(x + 0.5, y + 0.5, 0.5);
                }
            }

            //Draw Board x's and o's
            for (int x = 0; x < 7; x++) {
                for (int y = 0; y < 6; y++) {
                    if (board[x][y] == 1) {
                        StdDraw.setPenColor(Color.red);
                        StdDraw.filledCircle(x + 0.5, y + 0.5, .4);
                    } else if (board[x][y] == 2) {
                        StdDraw.setPenColor(Color.blue);
                        StdDraw.filledCircle(x + 0.5, y + 0.5, .4);
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

            //3 horizontal rows, 2 diagonals, 3 vertical columns (8 possibly ways to win tic-tac-toe
            //3 possibilities for winning tic-tac-toe (horizontal rows)
            //board[0][0] board[0][1] board[0][2]
            //board[1][0] board[1][1] board[1][2]
            //board[2][0] board[2][1] board[2][2]

            //3 vertical columns
            //board[0][0] board[1][0] board[2][0]
            //board[0][1] board[1][1] board[2][1]
            //board[0][2] board[1][2] board[2][2]

            //2 diagonal
            //board[0][0] board[1][1] board[2][2]
            //board[2][0] board[1][1] board[0][2]



            int result = checkForWinner(board);
            if(result == 1){
                System.out.println("Player 1 wins!");
                System.exit(0);
            }else if(result == 2){
                System.out.println("Player 2 Wins!");
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
                for(int z = 0; z < 6; z++) {
                    System.out.println("board[" + xClicked + "]"); //log
                    if (board[xClicked][z] == 0) {
                        board[xClicked][z] = pieceToPlaceNext;
                        mostRecentlyPlaced = pieceToPlaceNext;
                        break;
                    }
                }







            }




            // 1. Track when click occurs: StdDraw.isMousePressed() - either true or false
            //      -When you click down initially, changes from false => true
            //      -When you click "up" initially, changes from true => false
            //      -You could use these properties to track when a single click has occured
            // 2. If the space is already filled, "ignore" that click.

            StdDraw.show();
            StdDraw.pause((int) (timeElapsed * 1000));
        }

    }



}


