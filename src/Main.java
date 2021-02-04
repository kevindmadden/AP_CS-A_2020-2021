import java.awt.*;

public class Main{
    public static void main(String args[]){

        StdDraw.setXscale(-0.0, +7);
        StdDraw.setYscale(-0.0 ,+6 );
        StdDraw.enableDoubleBuffering();

        /* Initial Values */
        int [][] board = new int[7][6];


        for(int row = 0; row < 6; row++){
            for(int col = 0; col < 7; col++){
                board[col][row] = 0;
            }
        }
        int mostRecentlyPlaced = 1;
        if (Math.random()*100>50){
            mostRecentlyPlaced = 2;
        }
        int pieceToPlaceNext = 2;

        boolean isMousePressedTracker = false;
        boolean didClickOccur = false;

        double timeElapsed = 0.017; //formerly called "dt". This is number of seconds between each frame of the animation -  0.017 milliseconds is the same as 60fps
        while(true) {
            StdDraw.clear();

  /*      int [][] board = {
                {1,0,0,0,0,0},
                {0,1,0,0,0,0},
                {0,0,1,0,0,0},
                {0,0,0,1,0,0},
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
                {2,0,0,0,0,1},
         };
*/





            /* Drawing Models
            for (int x = 0; x < 7; x++) {
                for (int y = 0; y < 6; y++) {
                    StdDraw.setPenColor(Color.black);
                    StdDraw.circle(x + 0.5, y + 0.5, 0.5);

                }
            }

            for (int x = 0; x < 7; x++) {
                for (int y = 0; y < 6; y++) {
                    if (board[x][y] == 1) {
                        StdDraw.setPenColor(Color.red);
                        StdDraw.filledCircle(x * 1 + 1 * 0.5, y * 1 + 1 * 0.5, 0.5);
                    } else if (board[x][y] == 2) {
                        StdDraw.setPenColor(Color.blue);
                        StdDraw.filledCircle(x * 1 + 1 * 0.5, y * 1 + 1 * 0.5, 0.5);
                    }
                    //else if(board[y][x]==0){
                    //    StdDraw.circle(x+0.5,y+0.5,0.5);
                    //}

                }
            }
*/

            /*Game Logic*/
            if (mostRecentlyPlaced == 1) {
                pieceToPlaceNext = 2;
            } else if (mostRecentlyPlaced == 2) {
                pieceToPlaceNext = 1;
            }


            /*Controller Input*/

            if (StdDraw.isMousePressed()) {
                isMousePressedTracker = true;
            }
            if (!StdDraw.isMousePressed()) {
                if (isMousePressedTracker) {
                    System.out.println("Click occurred!");
                    didClickOccur = true;
                    isMousePressedTracker = false;
                }
            }

            if (didClickOccur) {
                didClickOccur = false;
                //System.out.println("x:"+ StdDraw.mouseX()+" y:"+ StdDraw.mouseY()); //log
                int xClicked = (int) (StdDraw.mouseX());

                boolean Click = true;
                int dropSlot = dropSlot(board,xClicked);
                if (dropSlot==40){
                    Click = false;
                }
                //System.out.println("board["+xClicked+"]["+yClicked+"]"); //log
                if (Click) {
                    board[xClicked][dropSlot] = pieceToPlaceNext;
                    mostRecentlyPlaced = pieceToPlaceNext;
                }

            }

            draw(board);

            System.out.println(checkForWinner(board));
            int winner = checkForWinner(board);
            if ((winner ==1) || (winner == 2) || (winner ==3) ){
                break;
            }



            StdDraw.pause((int)(timeElapsed*1000));

        }

    }



    public static void draw (int [][]board) {
        for (int x = 0; x < 7; x++) {
            for (int y = 0; y < 6; y++) {
                StdDraw.setPenColor(Color.black);
                StdDraw.circle(x + 0.5, y + 0.5, 0.5);

            }
        }

        for (int x = 0; x < 7; x++) {
            for (int y = 0; y < 6; y++) {
                if (board[x][y] == 1) {
                    StdDraw.setPenColor(Color.red);
                    StdDraw.filledCircle(x * 1 + 1 * 0.5, y * 1 + 1 * 0.5, 0.5);
                } else if (board[x][y] == 2) {
                    StdDraw.setPenColor(Color.blue);
                    StdDraw.filledCircle(x * 1 + 1 * 0.5, y * 1 + 1 * 0.5, 0.5);
                }
                //else if(board[y][x]==0){
                //    StdDraw.circle(x+0.5,y+0.5,0.5);
                //}

            }
        }

        StdDraw.show();
    }

    public static int checkForWinner (int [][]board) {

        boolean isTie = true;

        for(int col = 0; col< 7; col++){
            for (int row =0; row< 6; row++){

                if (board[col][row]==0){
                    isTie = false;
                }
                //vertical
                if ((row+3<6 &&(board[col][row] != 0) && (board[col][row]== board[col][row+1])&& (board[col][row] == board[col][row+2]) && (board[col][row] == board[col][row+3]))){
                    return board[col][row];
                }
                //horizontal
                if ((col+3<7 &&(board[col][row] != 0) && (board[col][row]== board[col+1][row])&& (board[col][row] == board[col+2][row]) && (board[col][row] == board[col+3][row]))){
                    return board[col][row];
                }
                //bottom left to top right
                if ((col+3<7 && row+3<6 && (board[col][row] != 0) && (board[col][row]== board[col+1][row+1])&& (board[col][row] == board[col+2][row+2]) && (board[col][row] == board[col+3][row+3]))){
                    return board[col][row];
                }
                //top left to bottom right
                if ((col+3<7 && row-3>-1 && (board[col][row] != 0) && (board[col][row]== board[col+1][row-1])&& (board[col][row] == board[col+2][row-2]) && (board[col][row] == board[col+3][row-3]))){
                    return board[col][row];
                }

            }

        }
        if (isTie){
            return 3;
        }

       /*
        for (int col = 0; col<7; col++){
            for (int row = 0; row<6; row++){
                if ((col+3<7 &&(board[col][row] != 0) && (board[col][row]== board[col+1][row])&& (board[col][row] == board[col+2][row]) && (board[col][row] == board[col+3][row]))){
                    return board[col][row];
                }
            }
        }


        for (int col = 0; col<7; col++){
            for (int row = 0; row<6; row++){
                if ((col+3<7 && row+3<6 && (board[col][row] != 0) && (board[col][row]== board[col+1][row+1])&& (board[col][row] == board[col+2][row+2]) && (board[col][row] == board[col+3][row+3]))){
                    return board[col][row];
                }
            }
        }

        */


        return 0;
    }


    public static int dropSlot (int[][]board, int x){
        int dropSlot = 0;
        for(int y =0; y<6;y++){
            if (board[x][y] == 0)
                return dropSlot;
            else
                dropSlot++;
        }
        return 40;
    }
}



