package Period2.u03_IntroToAnimation;

/*

    Variable Scope Simplified
    -Question: How do we print out each iteration of the for loop whether
    or not the ball has touched the ground for the first time?

 */

public class s02_VariableScope {
    public static void main(String args[]){
        StdDraw.setScale(-2, +2);
        StdDraw.enableDoubleBuffering();


        for (double t = 0.0; true; t += 0.02) {
            StdDraw.clear();

            StdDraw.setPenColor(StdDraw.YELLOW);
            StdDraw.filledSquare(0,0, 2);

            if(t>=2){
                StdDraw.filledCircle(0,-2, 0.2);
                if(t>2.5){
                    t=0;
                }
            }else{
                StdDraw.filledCircle(0,2-t*2, 0.2);
            }
            StdDraw.show();
            StdDraw.pause(20);
        }


    }

    public static void setRandomColor(){

    }

}
