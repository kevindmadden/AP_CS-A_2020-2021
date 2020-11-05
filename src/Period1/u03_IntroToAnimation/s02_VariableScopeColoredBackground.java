package Period1.u03_IntroToAnimation;

/*

    Variable Scope
    -Role of a variable in its place
    -Variables are available at different levels depending on where they are placed.
    -Variables only exist between the braces in which they are created.

    Question of the Day: How do we change the color of the background?
    -Initial answer: Draw a giant square of a particular color behind everything
    -Difficulty: The color of the square is the same as the color of the circle.
 */

import Period2.u03_IntroToAnimation.StdDraw;

public class s02_VariableScopeColoredBackground {
    public static void main(String args[]){
        StdDraw.setScale(-2, +2);
        StdDraw.enableDoubleBuffering();



        int r = (int)(Math.random()*256); //1 exclusive * 256 = 256 exclusive
        int g = (int)(Math.random()*256);
        int b = (int)(Math.random()*256);
        System.out.println(r+", "+g+", "+b);

        for (double t = 0.0; true; t += 0.02) {
            StdDraw.clear();

            StdDraw.setPenColor(StdDraw.YELLOW);
            StdDraw.filledSquare(0,0, 2);

            StdDraw.setPenColor(r,g,b);
            if(t>=2){
                StdDraw.filledCircle(0,-2, 0.2);
                if(t>2.5){
                    t=0;
                    r = (int)(Math.random()*256); //1 exclusive * 256 = 256 exclusive
                    g = (int)(Math.random()*256);
                    b = (int)(Math.random()*256);
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
