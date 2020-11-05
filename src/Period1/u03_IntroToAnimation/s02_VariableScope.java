package Period1.u03_IntroToAnimation;

//    Variable Scope Simplified
//    -Question: How do we print out each iteration of the for loop whether
//    or not the ball has touched the ground for the first time?


public class s02_VariableScope {
    public static void main(String args[]){
        StdDraw.setScale(-2, +2);
        StdDraw.enableDoubleBuffering();

        setRandomColor();

        boolean hasTouchedForFirstTime = false;
        for (double t = 0.0; true; t += 0.02) {
            StdDraw.clear();
            if(t>=2){
                hasTouchedForFirstTime = true;
                //We have to have something in here that switches the boolean to true
                StdDraw.filledCircle(0,-2, 0.2);
                if(t>2.5){
                    t=0;
                    setRandomColor();
                }
            }else{
                StdDraw.filledCircle(0,2-t*2, 0.2);
            }

            System.out.println(hasTouchedForFirstTime);

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
