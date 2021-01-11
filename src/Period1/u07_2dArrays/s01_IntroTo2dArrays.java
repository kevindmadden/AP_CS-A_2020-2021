package Period1.u07_2dArrays;

public class s01_IntroTo2dArrays {

    //public static final int NUM_OF_ROWS = 3;
    //public static final int NUM_OF_COLS = 3;


    public static void main(String args[]){

        StdDraw.setScale(-0.0, +100.0);
        StdDraw.enableDoubleBuffering();

        /* Initial Values */
        String[][] board = new String[3][3];

        double timeElapsed = 0.017; //formerly called "dt". This is number of seconds between each frame of the animation -  0.017 milliseconds is the same as 60fps
        while(true){
            StdDraw.clear();
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.square(50,50,50);

            //Draw Board - Draws Grid
            for(int x=1; x<=5; x+=2){
                for(int y=1; y<=5; y+=2) {
                    StdDraw.square(100 * (x / 6.0), 100 * ( y / 6.0), 100 * (1 / 6.0));
                }
            }
            //Draw the x's and o's
            for(int x=0; x<=2; x++){
                for(int y=0; y<=2; y++){
                    if(board[x][y]!=null && board[x][y].equals("o")){ //!!!NULL POINTER EXCEPTION FIX!!! (Address first thing)
                        StdDraw.circle(x*33.3333+16.66665, y*33.3333+16.66665,20);
                    }
                }
            }


            if(StdDraw.isMousePressed()){
                System.out.println("x:"+StdDraw.mouseX()+" y:"+StdDraw.mouseY());
                int xClicked = (int)(StdDraw.mouseX()/33.333333);
                int yClicked = (int)(StdDraw.mouseY()/33.333333);
                System.out.println(xClicked+", "+yClicked);
                board[xClicked][yClicked] = "o";
            }




            StdDraw.show();
            StdDraw.pause((int)(timeElapsed*1000));
        }

    }

}
