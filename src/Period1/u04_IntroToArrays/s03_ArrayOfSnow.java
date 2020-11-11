package Period1.u04_IntroToArrays;

import Period1.u03_IntroToAnimation.StdDraw;

public class s03_ArrayOfSnow {
    public static void main(String args[]){

        StdDraw.setScale(-0.0, +100.0);
        StdDraw.enableDoubleBuffering();

        double yVel = 10; //10 pixels per second
        /*
        For one snowflake:
            double yPos = Math.random()*100;
            double xPos = Math.random()*100;
         */

        //For multiple snowflakes
        double[] snowHeight = new double[100];
        double[] snowXPos = new double[100];
        //snowHeight.length is the number of items in the array
        for(int i = 0; i < snowHeight.length; i++){
            snowHeight[i] = Math.random()*100;
            snowXPos[i] = Math.random()*100;
        }




        double dt = 0.017; //delta time - the number of seconds between each frame (think of this as timeElapsed) - 0.017 milliseconds is the same as 60fps
        while(true){
            StdDraw.clear();
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.filledSquare(50,50,50);


            StdDraw.setPenColor(StdDraw.WHITE);
            /* Animate 1 snowflake:
                yPos = yPos - yVel*dt;
                StdDraw.filledCircle(xPos,yPos,1); */
            for(int i = 0; i < snowHeight.length; i++){
                snowHeight[i] = snowHeight[i] - yVel*dt;
                StdDraw.filledCircle(snowXPos[i],snowHeight[i],1);
            }






            StdDraw.show();
            StdDraw.pause((int)(dt*1000));
        }


    }
}
