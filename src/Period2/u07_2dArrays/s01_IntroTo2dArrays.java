package Period2.u07_2dArrays;

import Period2.u04_IntroToArrays.StdDraw;

public class s01_IntroTo2dArrays {

    public static void main(String args[]){

        StdDraw.setScale(-0.0, +100.0);
        StdDraw.enableDoubleBuffering();

        /* Initial Values */
        String[][] board = new String[3][3];
        //Two ways of dealing with the default null values that are present in String arrays
        //1. Doing a null check - Check to see if the String is not null before running anything else (short-circuiting)
        //2. Choose a different default value!!! (So that you don't have to worry about handling null!)

        String mostRecentlyPlaced = "";

        double timeElapsed = 0.017; //formerly called "dt". This is number of seconds between each frame of the animation -  0.017 milliseconds is the same as 60fps
        while(true){
            StdDraw.clear();

            //Draw Board Grid
            for(int x = 1; x<=5; x+=2){
                for(int y = 1; y<=5; y+=2){
                    StdDraw.square(100*(x/6.0), 100*(y/6.0), 100*(1/6.0) );
                }
            }

            //Draw Board x's and o's
            for(int x = 0; x <= 2; x++){
                for(int y = 0; y <= 2; y++){
                    if(board[x][y]!=null && board[x][y].equals("o")){
                        StdDraw.circle(x*33.333333+33.333333*0.5, y*33.333333+33.333333*0.5, 10);
                    }
                }
            }


            if(StdDraw.isMousePressed()){
                int xClicked = (int) (StdDraw.mouseX()/33.3333333);
                int yClicked = (int) (StdDraw.mouseY()/33.3333333);
                board[xClicked][yClicked] = "o";
            }

            StdDraw.show();
            StdDraw.pause((int)(timeElapsed*1000));
        }

    }

}
