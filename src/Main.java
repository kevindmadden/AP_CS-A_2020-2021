import java.util.Scanner;
public class Main {
    public static void main(String args[]) {

        StdDraw.setXscale(-0.0, +7);
        StdDraw.setYscale(-0.0, +6);
        StdDraw.enableDoubleBuffering();

        /* Initial Values */
        String[][] board = new String[6][7];
        //Two ways of dealing with the default null values that are present in String arrays
        //1. Doing a null check - Check to see if the String is not null before running anything else (short-circuiting)
        //2. Choose a different default value!!! (So that you don't have to worry about handling null!)
        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < 7; col++) {
                board[row][col] = "";
            }
        }

        String mostRecentlyPlaced = "x";
        String pieceToPlaceNext = "o";

        boolean isMousePressedTracker = false;
        boolean didClickOccur = false;

        double timeElapsed = 0.017; //formerly called "dt". This is number of seconds between each frame of the animation -  0.017 milliseconds is the same as 60fps
        while (true) {
            StdDraw.clear();

            // Making the coin drop

            // for (int row = board.length-1; row >= 0; row--){
            //      if(board[row][play] == ' '){
            //         board[row][play] = player;
            //           break;
            //         }
            //    }
            /* * * * * * * * * * * *
                Game Logic (Model)
             * * * * * * * * * * * */
            if (mostRecentlyPlaced.equals("o")) {
                pieceToPlaceNext = "x";
            } else if (mostRecentlyPlaced.equals("x")) {
                pieceToPlaceNext = "o";
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

            for (int i = 0; i < 6; i++) {
                String player = "o";
                if (i == 3) {
                    player = "x";
                }

                //Check 3 horizontal win possibilities
                for (int row = 0; row < 6; row++) {
                    if (board[row][0].equals(player) && board[row][1].equals(player) && board[row][2].equals(player) && board[row][3].equals(player)) {
                        System.out.println(player + " wins!");
                        System.exit(0);
                    }
                }

                //Check 3 vertical win possibilities
                for (int col = 0; col < 7; col++) {
                    if (board[0][col].equals(player) && board[1][col].equals(player) && board[2][col].equals(player) && board[3][col].equals(player)) {
                        System.out.println(player + " wins!");
                        System.exit(0);
                    }
                }

                //Check 2 diagonal possibilities
                if (board[0][0].equals(player) && board[1][1].equals(player) && board[2][2].equals(player) && board[3][3].equals(player)) {
                    System.out.println(player + " wins!");
                    System.exit(0);
                }


                if (board[2][0].equals(player) && board[1][1].equals(player) && board[0][2].equals(player)) {
                    System.out.println(player + " wins!");
                    System.exit(0);
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

                for (int yClicked = 0; yClicked <= 5; yClicked++) {
                    System.out.println("board[" + xClicked + "][" + yClicked + "]"); //log
                    if (board[xClicked][yClicked].equals("")) {
                        board[xClicked][yClicked] = pieceToPlaceNext;
                        mostRecentlyPlaced = pieceToPlaceNext;
                        break;
                    }

                }


                // 1. Track when click occurs: StdDraw.isMousePressed() - either true or false
                //      -When you click down initially, changes from false => true
                //      -When you click "up" initially, changes from true => false
                //      -You could use these properties to track when a single click has occured
                // 2. If the space is already filled, "ignore" that click.

                //System.out.println(checkForWinner(board));
                // int winner = checkForWinner(board);
                // if ((winner == 1) (winner == 3) (winner == 3)){
                //      break;
                //   }


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
                        if (board[y][x].equals("o")) {
                            StdDraw.setPenColor(StdDraw.RED);
                            StdDraw.filledCircle(y + 0.5, x + 0.5, .4);
                        } else if (board[y][x].equals("x")) {
                            StdDraw.setPenColor(StdDraw.BLUE);
                            StdDraw.filledCircle(y + 0.5, x + 0.5, 0.4);
                        }
                    }
                }

                StdDraw.show();
                StdDraw.pause((int) (timeElapsed * 1000));
            }

        }
    }
}