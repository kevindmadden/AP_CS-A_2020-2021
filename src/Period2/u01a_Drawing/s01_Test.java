package Period2.u01a_Drawing;

public class s01_Test {
    public static void main(String args[]){
        System.out.print("Testing that printing works.");
        System.out.println("Testing that printing works.");
        // methods
        // examples of methods this year so far: System.out.print, System.out.println, nextInt, nextDouble, nextLine

        StdDraw.setScale(-10,10);

        StdDraw.setPenRadius(0.05);
        StdDraw.setPenColor(143, 189, 115);
        StdDraw.point(0, 0);
        StdDraw.setPenColor(StdDraw.MAGENTA);
        StdDraw.line(0.2, 0.2, 0.8, 0.2);

        StdDraw.filledEllipse(5,5, 1, 2.5);
        StdDraw.arc(-5,-5,3,45,90);


    }
}
