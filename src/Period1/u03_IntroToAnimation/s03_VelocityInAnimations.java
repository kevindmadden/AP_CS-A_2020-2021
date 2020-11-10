package Period1.u03_IntroToAnimation;

public class s03_VelocityInAnimations {
    public static void main(String args[]) {
        StdDraw.setScale(-0.0, +10.0);
        StdDraw.enableDoubleBuffering();

        /*
            Modifying velocity is how we will control the speed of our animations going forward.
            -This will make things less jumpy.
            -Changing the direction of something that is moving will be more straight-forward
            - position = old position + time * velocity
         */

        double xPosBall = 5;
        double yPosBall = 5;
        double yVelBall = 2; //20 pixels per second
        double direction = 1;
        double dt = 0.02; //0.01 seconds between each frame; dt stands for delta time, which means change in time

        while(true){
            if(yPosBall < 0){
                direction = 1;
            }else if(yPosBall > 10){
                direction = -1;
            }
            yPosBall = yPosBall + (dt * yVelBall * direction);

            StdDraw.clear();
            StdDraw.filledCircle(xPosBall,yPosBall, .2);
            System.out.println("test");


            StdDraw.show();
            StdDraw.pause((int)(dt*1000)); //StdDraw.pause expects the units to be in milliseconds, not seconds
        }
    }
}