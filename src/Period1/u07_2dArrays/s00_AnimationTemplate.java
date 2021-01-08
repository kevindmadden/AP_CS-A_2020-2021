package Period1.u07_2dArrays;

public class s00_AnimationTemplate {

    public static void main(String args[]){

        StdDraw.setScale(-0.0, +100.0);
        StdDraw.enableDoubleBuffering();

        /* Initial Values */
        String[] board = new String[3];

        double timeElapsed = 0.017; //formerly called "dt". This is number of seconds between each frame of the animation -  0.017 milliseconds is the same as 60fps
        while(true){
            StdDraw.clear();

            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.filledSquare(50,50,50);

            //Draw Board:



            StdDraw.show();
            StdDraw.pause((int)(timeElapsed*1000));
        }

    }

}
