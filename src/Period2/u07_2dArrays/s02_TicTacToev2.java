package Period2.u07_2dArrays;

public class s02_TicTacToev2 {

    public static void main(String args[]){

        StdDraw.setScale(-0.0, +100.0);
        StdDraw.enableDoubleBuffering();

        /* Initial Values */
        String[][] board = new String[3][3];
        //Two ways of dealing with the default null values that are present in String arrays
        //1. Doing a null check - Check to see if the String is not null before running anything else (short-circuiting)
        //2. Choose a different default value!!! (So that you don't have to worry about handling null!)
        for(int row = 0; row<3; row++){
            for(int col = 0; col<3; col++){
                board[row][col] = "";
            }
        }

        String mostRecentlyPlaced = "";
        String pieceToPlaceNext = "o";

        boolean isMousePressedTracker = false;
        boolean didClickOccur = false;

        double timeElapsed = 0.017; //formerly called "dt". This is number of seconds between each frame of the animation -  0.017 milliseconds is the same as 60fps
        while(true){
            StdDraw.clear();

            /* * * * * * * * * * * *
                Drawing (View)
             * * * * * * * * * * * */

            //Draw Board Grid
            for(int x = 1; x<=5; x+=2){
                for(int y = 1; y<=5; y+=2){
                    StdDraw.square(100*(x/6.0), 100*(y/6.0), 100*(1/6.0) );
                }
            }

            //Draw Board x's and o's
            for(int x = 0; x <= 2; x++){
                for(int y = 0; y <= 2; y++){
                    if(board[x][y].equals("o")){
                        StdDraw.circle(x*33.333333+33.333333*0.5, y*33.333333+33.333333*0.5, 10);
                    }else if(board[x][y].equals("x")){
                        StdDraw.line(x*33.333333+5, y*33.333333+5, x*33.333333+28,y*33.333333+28);
                        StdDraw.line(x*33.333333+5, y*33.333333+28, x*33.333333+28,y*33.333333+5);
                    }
                }
            }

            /* * * * * * * * * * * *
                Game Logic (Model)
             * * * * * * * * * * * */
            if(mostRecentlyPlaced.equals("o")){
                pieceToPlaceNext = "x";
            }else if(mostRecentlyPlaced.equals("x")){
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

            for(int i=0; i<2; i++){
                String player = "o";
                if(i==1){
                    player = "x";
                }
                for(int row = 0; row<3; row++){
                    if(board[row][0].equals(player) && board[row][1].equals(player) && board[row][2].equals(player)){
                        System.out.println(player+" wins!");
                    }
                }
                for(int col = 0; col<3; col++){
                    if(board[0][col].equals(player) && board[1][col].equals(player) && board[2][col].equals(player)){
                        System.out.println(player+" wins!");
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

            if(didClickOccur){
                didClickOccur = false;
                //System.out.println("x:"+ StdDraw.mouseX()+" y:"+ StdDraw.mouseY()); //log
                int xClicked = (int)(StdDraw.mouseX()/33.333333);
                int yClicked = (int)(StdDraw.mouseY()/33.333333);
                //System.out.println("board["+xClicked+"]["+yClicked+"]"); //log
                board[xClicked][yClicked] = pieceToPlaceNext;
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
