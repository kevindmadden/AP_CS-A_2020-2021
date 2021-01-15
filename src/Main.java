import java.util.Random;

public class Main {
    public static void main(String args[]){
        StdDraw.setScale(-0.0, +10.0);
        StdDraw.enableDoubleBuffering();
        double x = randomNum();
        double y = 9.0;


        while(true){
            StdDraw.filledSquare(x,y,0.25);
            StdDraw.filledSquare(x+0.5,y+0.5,0.25);
            StdDraw.filledSquare(x-2,y-0.25,0.25);
            StdDraw.filledSquare(x-2.54,y-1.5,0.25);
            StdDraw.filledSquare(x-1.24,y-1.12,0.25);

            StdDraw.show();
            StdDraw.pause(17);
            StdDraw.clear();

            x = x - 0.25;
            if (x < 0.0){
                x = 9.0;
                y = randomNum();
            }
        }
    }

    public static int randomNum(){
        Random rand = new Random();
        return rand.nextInt(8);
    }
}