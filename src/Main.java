public class Main {
    public static void main(String args[]) {

        StdDraw.setXscale(-0.0, +7);
        StdDraw.setYscale(-0.0, +6);
        StdDraw.enableDoubleBuffering();

        /* Initial Values */
        int[][] board = new int[7][6];
        //Two ways of dealing with the default null values that are present in String arrays
        //1. Doing a null check - Check to see if the String is not null before running anything else (short-circuiting)
        //2. Choose a different default value!!! (So that you don't have to worry about handling null!)


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
                    if (board[x][y] == 2) {
                        StdDraw.setPenColor(StdDraw.BLUE);
                        StdDraw.filledCircle(x + 0.5, y + 0.5, .4);
                    } else if (board[x][y] == 1) {
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


            for (int player = 1; player > 3; player++) {

                for (int col = 0; col < 4; col++) {

                    //Check horizontal win possibilities
                    for (int row = 0; row < 6; row++) {
                        if (board[row][col] == player && board[row][col + 1] == player && board[row][col + 2] == player && board[row][col + 3] == player) {
                            // Start 0,0, then 0+1, 0+2, 0+3, then its going to go through the row value next, so check 1,0, then 1,1, 1,2, 1,3. etc.
                            System.out.println(player + " wins!");
                            System.exit(0);
                        }
                    }
                }

                for (int row = 0; row < 6; row++) {
                    //Check vertical win possibilities
                    for (int col = 0; col < 7; col++) {
                        if (board[row][col] == player && board[row][col + 1] == player && board[row][col + 2] == player && board[row][col + 3] == player) {
                            System.out.println(player + " wins!");
                            System.exit(0);
                        }
                    }
                }
                for (int row = 0; row < 3; row++) {
                    //Check for diagonal possibilities 1
                    for (int col = 0; col < 7; col++) {
                        if ((board[row][col] == player) && (board[row + 1][col] == player) && (board[row + 2][col] == player) && (board[row + 3][col] == player)) {
                            System.out.println(player + " wins!");
                            System.exit(0);
                        }

                    }
                }
                for (int row = 0; row < 3; row++) {
                    //Check for diagonal possibilities 2
                    for (int col = 0; col < 4; col++) {
                        if ((board[row][col] == player) && (board[row + 1][col + 1] == player) && (board[row + 2][col + 2] == player) && (board[row + 3][col + 3] == player)) {
                            System.out.println(player + " wins!");
                            System.exit(0);
                        }
                    }
                }

                for (int row = 0; row < 3; row++) {
                    //Check for diagonal possibilities 3
                    for (int col = 3; col < 4; col++) {
                        if ((board[row][col] == player) && (board[row + 1][col - 1] == player) && (board[row + 2][col - 2] == player) && (board[row + 3][col - 3] == player)) {
                            System.out.println(player + " wins!");
                            System.exit(0);
                        }
                    }
                }
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
                    }

                }
            }

            StdDraw.show();
            StdDraw.pause((int) (timeElapsed * 1000));

        }




    }

}



