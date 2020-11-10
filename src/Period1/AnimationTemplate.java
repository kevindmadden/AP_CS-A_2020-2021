package Period1;

import Period1.u03_IntroToAnimation.StdDraw;

public class AnimationTemplate {
    public static void main(String args[]){

        StdDraw.setScale(-0.0, +10.0);
        StdDraw.enableDoubleBuffering();

        double dt = 0.017; //delta time - the number of seconds between each frame (think of this as timeElapsed) - 0.017 milliseconds is the same as 60fps
        while(true){
            StdDraw.clear();



            StdDraw.show();
            StdDraw.pause((int)(dt*1000));
        }


    }
}
