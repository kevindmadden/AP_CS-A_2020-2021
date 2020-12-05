import java.awt.*;

public class Main {
    public static void main(String[] args) {
        StdDraw.setScale(-2, +2);
        StdDraw.enableDoubleBuffering();

        for (double t = 0.0; true; t += 0.01) {
            double x = Math.tan(t);
            double y = Math.cos(t);
            StdDraw.clear();
            StdDraw.filledCircle(x,y,0.25);
            StdDraw.filledSquare(-x,-y,0.25);
            StdDraw.show();
            StdDraw.pause(10);
        }
    }
}





