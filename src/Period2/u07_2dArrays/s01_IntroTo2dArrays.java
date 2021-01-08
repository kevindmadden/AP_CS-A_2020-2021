package Period2.u07_2dArrays;

import Period2.u04_IntroToArrays.StdDraw;

public class s01_IntroTo2dArrays {

    public static void main(String args[]){

        StdDraw.setScale(-0.0, +100.0);
        StdDraw.enableDoubleBuffering();

        /* Initial Values */
        String[][] board = new String[3][3];

        double timeElapsed = 0.017; //formerly called "dt". This is number of seconds between each frame of the animation -  0.017 milliseconds is the same as 60fps
        while(true){
            StdDraw.clear();

            //Draw Board:
            for(int x = 1; x<=5; x+=2){ //i+=2 is the same as i=i+2
                for(int y = 1; y<=5; y+=2){
                    StdDraw.square(100*(x/6.0), 100*(y/6.0), 100*(1/6.0) );
                }
            }

            StdDraw.show();
            StdDraw.pause((int)(timeElapsed*1000));
        }

    }

}
