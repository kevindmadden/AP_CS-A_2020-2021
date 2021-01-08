public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        StdDraw.setScale(-0.0, +100.0);
        StdDraw.enableDoubleBuffering();

        double xVel = 10;
        double[] Height = new double[100];
        double[] Xpos = new double[100];
        //new position = old position + velocity * time
        double dt = 0.017;
        for(int i = 0; i < Xpos.length; i++) {
            Height[i] = Math.random()*100;
            Xpos[i] = Math.random()*100;
        }


        while(true) {
            StdDraw.clear();
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.filledSquare(50,  50,  50);
            StdDraw.setPenColor(StdDraw.WHITE);

            for(int i = 0; i < Xpos.length; i++) {
                Height[i] = Height[i] - xVel*dt;
                StdDraw.filledSquare(Xpos[i], Height[i], .5);
                Xpos[i] = Xpos[i] + (Math.random()-0.5)*.5;
                //Math.random(); gives number between 0 and 1
                if(Height[i] < 0) {
                    Height[i] = Height[i] + 110;
                }

            }


            StdDraw.show();
            StdDraw.pause((int)(dt*1000));
        }

    }

}