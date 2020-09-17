package Period1.u01a_Drawing;

public class s01_Test {
    public static void main(String args[]){

        //StdDraw.setScale(-10,10); //how to change dimensions if you want

        StdDraw.setPenRadius(0.05);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.point(0.5, 0.5);
        StdDraw.setPenRadius(0.1);
        StdDraw.setPenColor(28, 176, 68);
        StdDraw.line(0.2, 0.2, 0.8, 0.2);

        System.out.print("is a method");
        System.out.println("is a method");

        StdDraw.filledEllipse(0.75,0.75,.15,.25);



    }
}
