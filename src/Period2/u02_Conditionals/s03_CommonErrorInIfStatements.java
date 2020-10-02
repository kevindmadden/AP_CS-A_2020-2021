package Period2.u02_Conditionals;

public class s03_CommonErrorInIfStatements {
    public static void main(String args[]){

        //Common Error #1: Not including braces

        int x = 0;
        int y = 0;

        if(x<y)
            y = y-1;
            x += 1;

        //What values will get printed?
        System.out.println(x);
        System.out.println(y);

        //We think: x will be 1, y will be -1
        //Actual values that will be printed are: x is 1, y is 0

        // It is not doing what we would expect because if you don't include braces
        // for your if statement, then only line that is part of that if statement,
        // is the SINGLE line immediately below.

        //Here's what the code is actually doing if we used braces:
        if(x<y) {
            y = y - 1;
        }
        x += 1;

        boolean isRaining = true;

        if(isRaining){
            //Then run stuff
        }




    }
}
