package Period1.u04_IntroToArrays;

public class s03_ArrayOfSnow {
    public static void main(String args[]){

        StdDraw.setScale(-0.0, +100.0);
        StdDraw.enableDoubleBuffering();

        double yVel = 10; //10 pixels per second

        //For multiple snowflakes
        double[] snowYPos = new double[100];
        double[] snowXPos = new double[100];
        //snowYPos.length is the number of items in the array
        for(int i = 0; i < snowYPos.length; i++){
            snowYPos[i] = Math.random()*100;
            snowXPos[i] = Math.random()*100;
        }

        double dt = 0.017; //delta time - the number of seconds between each frame (think of this as timeElapsed) - 0.017 milliseconds is the same as 60fps
        while(true){
            StdDraw.clear();
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.filledSquare(50,50,50);


            StdDraw.setPenColor(StdDraw.WHITE);
            for(int i = 0; i < snowYPos.length; i++){
                snowYPos[i] = snowYPos[i] - yVel*dt; //this is making things move
                snowXPos[i] = snowXPos[i] + (Math.random()-0.5)*.1; //wiggle effect
                StdDraw.filledCircle(snowXPos[i],snowYPos[i],.3);

                if(snowYPos[i] < 0){
                    snowYPos[i] = snowYPos[i] + 110; //causes snowflake to "reset" and go back above the screen
                }
            }

            /*
                End Animation Loop Stuff
             */
            StdDraw.show();
            StdDraw.pause((int)(dt*1000));
        }
    }
}
