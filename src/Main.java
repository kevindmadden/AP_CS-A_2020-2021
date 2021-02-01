import java.util.*;

public class Main {

    public static void main(String args[]){

        //Canvas setup
        StdDraw.setCanvasSize(700,600);
        StdDraw.setXscale(-0.0, +7);
        StdDraw.setYscale(-0.0, +6);
        StdDraw.enableDoubleBuffering();

        //Initial Values
        int[][] board = new int[6][7];
        for(int row = 0; row < 6; row++){
            for(int col = 0; col < 7; col++){
                board[row][col] = 0;
            }
        }

        int mostRecentlyPlaced = 0;
        int pieceToPlaceNext;
        if(Math.random() < 0.5){
            pieceToPlaceNext = 1;
        } else {
            pieceToPlaceNext = 2;
        }

        boolean isMousePressedTracker = false;
        boolean didClickOccur = false;

        double timeElapsed = 0.017;

        while(true){
            StdDraw.clear();

            //Draw Board Grid
            StdDraw.setPenColor(100,100,100);
            for(int x = 0; x < 7; x++){
                for(int y = 0; y < 6; y++){
                    StdDraw.square(x+0.5,y+0.5, .5);
                }
            }

            //Draw Board Pieces
            for(int x = 0; x < 7; x++){
                for(int y = 0; y < 6; y++){
                    if(board[x][y] == 1){
                        StdDraw.setPenColor(100,0,0);
                        StdDraw.filledCircle(x+0.5,y+0.5, .4);
                    }else if(board[x][y] == 2){
                        StdDraw.setPenColor(0,0,100);
                        StdDraw.filledCircle(x+0.5,y+0.5, .4);
                    }
                }
            }


            //Game Logic
            if(mostRecentlyPlaced == 1){
                pieceToPlaceNext = 2;
            }else if(mostRecentlyPlaced == 2){
                pieceToPlaceNext = 1;
            }

            //User input
            if(StdDraw.isMousePressed()){
                isMousePressedTracker = true;
            }
            if(!StdDraw.isMousePressed()){
                if(isMousePressedTracker){
                    didClickOccur = true;
                    isMousePressedTracker = false;
                }
            }
            if(didClickOccur){
                didClickOccur = false;
                System.out.println("x:"+ StdDraw.mouseX()+" y:"+ StdDraw.mouseY()); //log
                int xClicked = (int)(StdDraw.mouseX());
                int yClicked = (int)(StdDraw.mouseY());
                System.out.println("board["+xClicked+"]["+yClicked+"]"); //log
                if(board[xClicked][yClicked] == 0){
                    board[xClicked][yClicked] = pieceToPlaceNext;
                    mostRecentlyPlaced = pieceToPlaceNext;
                }
            }

            StdDraw.show();
            StdDraw.pause((int)(timeElapsed*1000));


        }

    }

    //Checking Method
    public static int checkForWinner (int[][] board){
        for(int i=0; i<2; i++) {
            int player = 1;
            if (i == 1) {
                player = 2;
            }
            //Horizontal
            for (int row = 0; row < 6; row++) {
                for (int col = 0; col < 4; col++) {
                    if (board[row][col] == player && board[row][col+1] == player && board[row][col+2] == player && board[row][col+3] == player) {
                        if(player == 1){
                            return 1;
                        } else if (player == 2){
                            return 2;
                        }
                    }
                }

            }
            //Vertical
            for (int col = 0; col < 7; col++) {
                for (int row = 0; row < 4; row++) {
                    if (board[row][col] == player && board[row+1][col] == player && board[row+2][col] == player && board[row+3][col] == player) {
                        if(player == 1){
                            return 1;
                        } else if (player == 2){
                            return 2;
                        }
                    }
                }

            }

            //Diagonal
            for (int col = 0; col < 7; col++) {
                for (int row = 0; row < 6; row++) {
                    if (board[row][col] == player && board[row+1][col+1] == player && board[row+2][col+2] == player && board[row+3][col+3] == player) {
                        if(player == 1){
                            return 1;
                        } else if (player == 2){
                            return 2;
                        }
                    }
                }

            }
        }
        return 0;
    }

}



