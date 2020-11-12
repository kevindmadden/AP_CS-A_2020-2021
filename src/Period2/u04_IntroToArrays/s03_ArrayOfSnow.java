package Period2.u04_IntroToArrays;

public class s03_ArrayOfSnow {
    public static void main(String args[]){

        StdDraw.setScale(-0.0, +100.0);
        StdDraw.enableDoubleBuffering();

        /* Initial Values */

        //Hold yVel constant
        double yVel = 100; //px/sec

        //Randomize xPos, yPos
        double xPos = Math.random()*100;
        double yPos = Math.random()*100;

        // Fill up array with random values
        double[] yPosSnowflakes = new double[100];
        double[] xPosSnowflakes = new double[100];

        for(int i = 0; i < yPosSnowflakes.length; i++){
            yPosSnowflakes[i] = Math.random()*100;
            xPosSnowflakes[i] = Math.random()*100;
        }

        double dt = 0.017; //delta time - the number of seconds between each frame (think of this as timeElapsed) - 0.017 milliseconds is the same as 60fps
        while(true){
            StdDraw.clear();
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.filledSquare(50,50,50);

            StdDraw.setPenColor(StdDraw.WHITE);
            for(int i = 0; i<yPosSnowflakes.length; i++){
                yPosSnowflakes[i] = yPosSnowflakes[i] - yVel*dt;
                StdDraw.filledCircle(xPosSnowflakes[i], yPosSnowflakes[i],.5);
                if(yPosSnowflakes[i] < -1){
                    yPosSnowflakes[i] = 101;
                    xPosSnowflakes[i] = Math.random()*100;
                }

            }




            StdDraw.show();
            StdDraw.pause((int)(dt*1000));
        }
    }
}
