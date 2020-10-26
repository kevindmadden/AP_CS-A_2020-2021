public class Scrap {

    public static void main(String[] args) {
        double a = 200;
        StdDraw.setScale(0, +a);
        StdDraw.enableDoubleBuffering();
        StdDraw.setPenRadius(0.005);
        StdDraw.setPenColor(11,103,177);

        double rainX = (Math.random() * a);
        double rainX2 = (Math.random() * a);
        for (double t = 0.0; true; t += 5) {

            StdDraw.clear();
            StdDraw.line(rainX - 0.1 * t, 200 - t, rainX + 2 - 0.1 * t, 200 + 5 - t);
            StdDraw.line(rainX2 - 0.1 * t, 200 - t, rainX2 + 2 - 0.1 * t, 200 + 5 - t);
            StdDraw.show();
            StdDraw.pause(20);
            t += 5;

            if(t>200) {
                t = 0.0;
                rainX = (Math.random() * a);
                rainX2 = (Math.random() * a);

            }
        }
    }
}