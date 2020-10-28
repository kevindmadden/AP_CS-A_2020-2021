package Period2.u03_IntroToAnimation;

public class s02_FirstAnimation {
    public static void main(String args[]){
        StdDraw.setScale(-2, +2);
        StdDraw.enableDoubleBuffering();

        //snow falling
        setRandomColor();
        for (double t = 0.0; true; t += 0.02) {
            StdDraw.clear();

            if(t <= 2){
                StdDraw.filledCircle(0,2-t*2,.1);
            }else{
                StdDraw.filledCircle(0,-2,.1);
                if(t >= 2.5){
                    t = 0;
                    setRandomColor();
                }
            }

            StdDraw.show();
            StdDraw.pause(20);
        }
    }

    public static void setRandomColor(){
        int r = (int)(Math.random()*256); //1 exclusive * 256 = 256 exclusive
        int g = (int)(Math.random()*256);
        int b = (int)(Math.random()*256);
        System.out.println(r+", "+g+", "+b);
        StdDraw.setPenColor(r,g,b);
    }
}
