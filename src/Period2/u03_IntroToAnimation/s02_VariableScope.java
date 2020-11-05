package Period2.u03_IntroToAnimation;

/*
    Variable Scope Simplified
    -Question: How do we print out each iteration of the for loop whether
    or not the ball has touched the ground **for the first time**?
    -Goal: Print out false as long as the ball hasn't hit the ground the first time.
    Print out True otherwise.
 */

public class s02_VariableScope {
    public static void main(String args[]){
        StdDraw.setScale(-2, +2);
        StdDraw.enableDoubleBuffering();

        boolean hasTouchedGroundForFirstTime=false;
        for (double t = 0.0; true; t += 0.02) {
            StdDraw.clear();

            if(t>=2){
                hasTouchedGroundForFirstTime = true;
                System.out.println(hasTouchedGroundForFirstTime);
                StdDraw.filledCircle(0,-2, 0.2);
                if(t>2.5){
                    t=0;
                }
            }else{
                System.out.println(hasTouchedGroundForFirstTime);
                StdDraw.filledCircle(0,2-t*2, 0.2);
            }
            StdDraw.show();
            StdDraw.pause(20);
        }


    }

}
