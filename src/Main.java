class Main {

    public static int checkForWinner(int[][] board) {

        return 0;

    }

    public static void main(String args[]){


        StdDraw.setXscale(-0.0, +6);
        StdDraw.setYscale(-0.0, +7);
        StdDraw.enableDoubleBuffering();

        int[][] board = new int [6][7]; //row = y = 7, col = x = 6



        int mostRecentlyPlaced = 0;
        int pieceTopPlaceNext = 1;
        boolean isMousePressedTracker = false;
        boolean didClickOccur = false;
        int player = 1;


        double timeElapsed = 0.017;
        while(true){
            StdDraw.clear();


//Draw Board
            for(int x = 0; x < 7; x++) {
                for (int y = 0; y < 6; y++){
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.circle(x + 0.5, y + 0.5, 0.5);
                }
            }

            // DRAW CIRCLE PIECES
            for (int x = 0; x < 7; x++) {
                for (int y = 0; y < 6; y++){
                    if(board[y][x] == 1){
                        StdDraw.setPenColor(StdDraw.YELLOW);
                        StdDraw.filledCircle(x + 0.5, y + 0.5, 0.5);
                    }else if (board[y][x] == 2) {
                        StdDraw.filledCircle(x + 0.5, y + 0.5, 0.5);
                        StdDraw.setPenColor(StdDraw.RED);
                    }
                }

            }



            //MOUSE INPUT
            if(StdDraw.isMousePressed()){
                isMousePressedTracker = true;
            }
            if (!StdDraw.isMousePressed()){
                if (isMousePressedTracker){
                    didClickOccur =  true;
                    isMousePressedTracker = false;
                }
            }
            if(didClickOccur){
                didClickOccur = false;
                System.out.println("It clicked!");

                int xClicked = (int) (StdDraw.mouseX());
                int yClicked = (int) (StdDraw.mouseY());
                for (int m = 0; m < 6; m++) {
                    if (board[m][xClicked] == 0) {
                        board[m][xClicked] = pieceTopPlaceNext;
                        mostRecentlyPlaced = pieceTopPlaceNext;
                        break;
                    }
                }
            }





            StdDraw.show();
            StdDraw.pause((int)(timeElapsed*1000));

        }
    }

}


