package Period1.u07_2dArrays;

public class s02_TicTacToev2 {

    public static void main(String args[]){

        StdDraw.setScale(-0.0, +100.0);
        StdDraw.enableDoubleBuffering();

        /* Initial Values */
        String[][] board = new String[3][3];
        // REMEMBER: String arrays have a default value of null
        //running .equals on a String will throw a NullPointerException Error
        // if that String has a value of null.
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                board[i][j] = "";
            }
        }

        String mostRecentlyPlaced = ""; //We intend to use this to keep track of whether an x or o was placed on the board on the previous turn
        String pieceToPlaceNext = "o";

        boolean isMousePressedTracker = false;
        boolean didClickOccur = false;

        double timeElapsed = 0.017; //formerly called "dt". This is number of seconds between each frame of the animation -  0.017 milliseconds is the same as 60fps
        while(true){
            StdDraw.clear();
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.square(50,50,50);

            /* * * * * * * * * * * *
                Drawing (View)
             * * * * * * * * * * * */

            //Draw Board - Draws Grid
            for(int x=1; x<=5; x+=2){
                for(int y=1; y<=5; y+=2) {
                    StdDraw.square(100 * (x / 6.0), 100 * ( y / 6.0), 100 * (1 / 6.0));
                }
            }
            //Draw the x's and o's
            for(int x=0; x<=2; x++){
                for(int y=0; y<=2; y++){
                    if(board[x][y].equals("o")){ //NULL POINTER EXCEPTION FIX: Replaced all default null values in String array with ""
                        StdDraw.circle(x*33.3333+16.66665, y*33.3333+16.66665,10);
                    }else if(board[x][y].equals("x")){
                        StdDraw.line(x*33.3333+5,y*33.3333+5,x*33.3333+28,y*33.3333+28);
                        StdDraw.line(x*33.3333+5,y*33.3333+28,x*33.3333+28,y*33.3333+5);
                    }
                }
            }

            /* * * * * * * * * * * *
                Game Logic (Model)
             * * * * * * * * * * * */
            if(mostRecentlyPlaced.equals("o")){
                pieceToPlaceNext = "x";
            }
            if(mostRecentlyPlaced.equals("x")){
                pieceToPlaceNext = "o";
            }
            //board[row][column] (8 possible ways to win)
            //board[0][0], board[0][1], board[0][2]
            //board[1][0], board[1][1], board[1][2]
            //board[2][0], board[2][1], board[2][2]

            //board[0][0], board[1][0], board[2][0]
            //board[0][1], board[1][1], board[2][1]
            //board[0][2], board[1][2], board[2][2]

            for(int i = 0; i<2; i++){
                String player = "o";
                if(i==1){
                    player = "x";
                }

                /*
                The first for-loop code block below is equivalent to the code in this comment:

                if(board[0][0].equals(player) && board[0][1].equals(player) && board[0][2].equals(player)){
                    System.out.println(player+ " wins!!");
                }
                if(board[1][0].equals(player) && board[1][1].equals(player) && board[1][2].equals(player)){
                    System.out.println(player+ " wins!!");
                }
                if(board[2][0].equals(player) && board[2][1].equals(player) && board[2][2].equals(player)){
                    System.out.println(player+ " wins!!");
                }
                 */
                for(int row = 0; row < 3; row++){
                    if(board[row][0].equals(player) && board[row][1].equals(player) && board[row][2].equals(player)){
                        System.out.println(player+ " wins!!");
                    }
                }

                for(int col = 0; col < 3; col++){
                    if(board[0][col].equals(player) && board[1][col].equals(player) && board[2][col].equals(player)){
                        System.out.println(player+ " wins!!");
                    }
                }

            }




            /* * * * * * * * * * * *
                User Input (Controller)
             * * * * * * * * * * * */

            if(StdDraw.isMousePressed()){
                System.out.println("click occurring...");
            }

            if(StdDraw.isMousePressed()){
                isMousePressedTracker = true;
            }
            if(!StdDraw.isMousePressed()){
                if(isMousePressedTracker){
                    System.out.println("Click occurred!");
                    didClickOccur = true;
                    isMousePressedTracker = false;
                }
            }

            //Section that runs when clicks occur
            if(didClickOccur){
                didClickOccur = false;

                //System.out.println("x:"+StdDraw.mouseX()+" y:"+StdDraw.mouseY()); //log
                int xClicked = (int)(StdDraw.mouseX()/33.333333);
                int yClicked = (int)(StdDraw.mouseY()/33.333333);
                //System.out.println("board["+xClicked+"]["+yClicked+"]"); //log
                board[xClicked][yClicked] = pieceToPlaceNext; //officially add the piece to the array
                mostRecentlyPlaced = pieceToPlaceNext;
            }

            // 1. Track when click occurs: StdDraw.isMousePressed() - either true or false
            //      -When you click down initially, changes from false => true
            //      -When you click "up" initially, changes from true => false
            //      -You could use these properties to track when a single click has occured
            // 2. If the space is already filled, "ignore" that click.





            StdDraw.show();
            StdDraw.pause((int)(timeElapsed*1000));
        }

    }

}
