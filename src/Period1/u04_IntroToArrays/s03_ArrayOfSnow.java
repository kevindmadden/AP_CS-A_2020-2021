package Period1.u04_IntroToArrays;

import Period1.u03_IntroToAnimation.StdDraw;

public class s03_ArrayOfSnow {
    public static void main(String args[]){

        // Goal: Make a bunch of snowflakes fall at the same time, but the snowflakes will be at random heights.
        //       Give you a solid example of a situation in which arrays could be helpful.

        StdDraw.setScale(-0.0, +10.0);
        StdDraw.enableDoubleBuffering();

        double yPos = 0;
        double yVel = 1.5; //1.5 pixels per frame


        double dt = 0.017; //delta time - the number of seconds between each frame (think of this as timeElapsed) - 0.017 milliseconds is the same as 60fps
        while(true){
            StdDraw.clear();

            yPos = yPos + yVel*dt;
            StdDraw.filledSquare(5,yPos,1);


            StdDraw.show();
            StdDraw.pause((int)(dt*1000));
        }


    }
}
