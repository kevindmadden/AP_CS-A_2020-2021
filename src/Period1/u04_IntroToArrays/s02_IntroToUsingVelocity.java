package Period1.u04_IntroToArrays;

import Period1.u03_IntroToAnimation.StdDraw;

public class s02_IntroToUsingVelocity {
    public static void main(String args[]){

        //new position = old position + velocity * time
        // Example: There is a ball lying on the ground at rest that someone kicks. If the person kicks the ball
        //  at a speed of 10 miles per second, how far has the ball traveled in 5 second?
        //new position = 0 + (10miles/sec)*5sec
        //new position = 50 miles
        // Example 2: You have already driven 100 miles today. You are driving down the highway at 60mph.
        // How far will you have traveled today assuming two hours have passed since you started driving at 60mph?
        //  Answer: 100+60mph*2hrs = 220 miles

        StdDraw.setScale(-0.0, +10.0);
        StdDraw.enableDoubleBuffering();

        double yPos = 0;
        double yVel = 1.5; //1.5 pixels per sec

        //If we have only 0.017 seconds between each frame, then we will be at approximately 60fps. (In other words, 1.0/60 equals about 0.017.)
        double dt = 0.017; //delta time - the number of seconds between each frame
        while(true){
            StdDraw.clear();

            yPos = yPos + yVel*dt;
            StdDraw.filledSquare(5,yPos,1);


            StdDraw.show();
            StdDraw.pause((int)(dt*1000));
        }


    }
}
