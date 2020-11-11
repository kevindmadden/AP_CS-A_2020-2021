package Other;

import Period1.u03_IntroToAnimation.StdDraw;

public class s03_ArrayOfSnow {
    public static void main(String args[]){

        // Goal: Make a bunch of snowflakes fall at the same time, but the snowflakes will be at random heights.
        //       Give you a solid example of a situation in which arrays could be helpful.

        StdDraw.setScale(-0.0, +100.0);
        StdDraw.enableDoubleBuffering();

        double yVel = 20; //1.5 pixels per second

        double[] snowHeights = new double[100];
        double[] snowHorizontal = new double[100];
        for(int i=0; i<snowHeights.length; i++){
            snowHeights[i] = Math.random()*100+101; //This will be a random number between 100 and 200
            snowHorizontal[i] = Math.random()*100;
        }

        double dt = 0.017; //delta time - the number of seconds between each frame (think of this as timeElapsed) - 0.017 milliseconds is the same as 60fps
        while(true){
            StdDraw.clear();
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.filledSquare(50,50,50); //background
            for(int i = 0; i<snowHeights.length; i++){
                if(snowHeights[i] < 0){
                    snowHeights[i] = Math.random()*100+101;
                    snowHorizontal[i] = Math.random()*100;
                }
                snowHorizontal[i] = snowHorizontal[i]+((Math.random()-0.45)*.3);
                snowHeights[i] = snowHeights[i] - yVel*dt;
                StdDraw.setPenColor(StdDraw.WHITE);
                StdDraw.filledCircle(snowHorizontal[i],snowHeights[i],0.2);
            }

            StdDraw.show();
            StdDraw.pause((int)(dt*1000)); //*1000 because dt is in seconds, and .pause expects to get milliseconds
        }


    }
}
