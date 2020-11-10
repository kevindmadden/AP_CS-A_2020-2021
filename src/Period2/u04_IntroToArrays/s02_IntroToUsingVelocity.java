package Period2.u04_IntroToArrays;

public class s02_IntroToUsingVelocity {
    public static void main(String args[]){

        StdDraw.setScale(-0.0, +10.0);
        StdDraw.enableDoubleBuffering();

        double yPos = 5;
        double yVel = 2; //2 units per sec
        double dt = 0.017; //dt=delta time (delta means change) -- in other words, 0.017 seconds between each frame

        while(true){
            StdDraw.clear();

            //Example Problem: You have already driven 100 miles. For the next 2 hours, you will be driving at 60mph.
            //  How many miles total will you have traveled at the end of the 2 hours?
            //  new position = old position + velocity * time
            //  new position =     100miles + 60 mph * 2 hrs
            //  new position = 220 miles

            //Question: So the yPos starts at 5. The yVel is 2. What's the new position once 0.017 seconds have passed?
            // Answer: new yPos = 5 + 2*0.017 = 5.034
            //  new position = old position + velocity * time
            yPos = yPos + yVel*dt;


            StdDraw.filledCircle(5, yPos,1);



            StdDraw.show();
            StdDraw.pause((int)(dt*1000)); //it expecting to receive an int that is in milliseconds
        }
    }
}
