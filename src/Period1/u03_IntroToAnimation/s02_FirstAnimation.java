package Period1.u03_IntroToAnimation;

public class s02_FirstAnimation {
    public static void main(String args[]){
        StdDraw.setScale(-2, +2);
        StdDraw.enableDoubleBuffering();

        for (double t = 0.0; true; t += 0.02) {
            StdDraw.clear();

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
}
