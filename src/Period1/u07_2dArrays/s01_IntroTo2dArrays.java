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

            //Draw Board
            for(int x=1; x<=5; x+=2){ //i+=2 same as i=i+2
                StdDraw.square(100*(x/6.0), 100*(1/6.0), 100*(1/6.0));
            }



            StdDraw.show();
            StdDraw.pause((int)(timeElapsed*1000));
        }

    }

}
