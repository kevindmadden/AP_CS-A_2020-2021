import java.util.*;
public class Scrap {
    public static void main(String args[]){

        StdDraw.setScale(-0.0, +10.0);
        StdDraw.enableDoubleBuffering();


        double xPos = 0;
        double xVel = 1.5;

        double[] squaresHeights = new double[100];
        double[] squaresPos = new double[100];

        for(int i = 0; i < squaresHeights.length; i++){
            squaresHeights[i] = Math.random()*100;
            squaresPos[i] = Math.random()*100;
        }


        double dt = 0.017;
        while(true){
            StdDraw.clear();

            xPos = xPos + xVel*dt;
            //Call method setPenColor
            StdDraw.filledSquare(5, 5, 5);


            for(int i = 0; i < squaresHeights.length; i++){
                squaresHeights[i] = squaresHeights[i] - xVel*dt;
                //Call method setPenColor
                StdDraw.filledSquare(squaresPos[i],squaresHeights[i],.3);
                squaresPos[i] = squaresPos[i] + (Math.random()-0.5)*.5;

                if(squaresHeights[i] < 0){
                    squaresHeights[i] = squaresHeights[i] + 110;
                }
            }

            StdDraw.show();
            StdDraw.pause((int)(dt*1000));
        }


    }
}
