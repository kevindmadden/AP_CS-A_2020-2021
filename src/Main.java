public class Main {
    public static void main(String args[]){
        StdDraw.setScale(-0.0, +100.0);
        StdDraw.enableDoubleBuffering();
        double yVel = 15;

        double yPos = Math.random()*100;
        double xPos = Math.random()*100;


        double[] snowHeight = new double[100];
        double[] snowXPos = new double[100];

        for(int i = 0; i < snowHeight.length; i++){
            snowHeight[i] = Math.random()*100;
            snowXPos[i] = Math.random()*100;
        }
        double dt = 0.015;

        while(true){
            StdDraw.clear();
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.filledSquare(25,25,25);
            StdDraw.setPenColor(StdDraw.WHITE);

            yPos = yPos - yVel*dt;
            StdDraw.filledCircle(xPos,yPos,1);

            for(int i = 0; i < snowHeight.length; i++){
                snowHeight[i] = snowHeight[i] - yVel*dt;
                StdDraw.filledCircle(snowXPos[i],snowHeight[i],1);
                StdDraw.filledCircle(snowXPos[i],snowHeight[i],.3);
                snowXPos[i] = snowXPos[i] + (Math.random()-0.5)*.5;

                if(snowHeight[i] < 0){
                    snowHeight[i] = snowHeight[i] + 100;
                }
            }


            StdDraw.show();
            StdDraw.pause((int)(dt*1000));
        }
    }
}