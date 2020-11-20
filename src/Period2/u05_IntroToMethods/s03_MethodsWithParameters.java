package Period2.u05_IntroToMethods;

public class s03_MethodsWithParameters {
    public static void main(String args[]){

        //Example #1:
        // So you can think of this happening behind the scenes:
        // String printMessage = "This message is getting stored in a paremeter!"
        print("This message is getting stored in a paremeter!");

        print("Another message!");

        //Example #2
        //Behind the scenes:
        // int num1 = 2;
        // int num2 = 7;
        // We can say: The values 2 and 7 are getting passed.
        add(2,7);

        //Example #3 - A method that isn't void.
        // Differences between Ex #2 and Ex #3:
        //  - In Ex #3, the value of the addition gets tossed back to us.
        //  - In Ex #2, the method prints out the value of the addition but we don't get that value back.
        //  - In a lot of ways, Ex #3 is "better" because we get information back from the method that we can use.
        System.out.println(addV2(4,9));

        int sum = addV2(4,9); //This is equivalent to: int sum = 13;
        System.out.println(sum*2);
    }

    //Example #1:
    //                       String printMessage --> This is called a parameter (a parameter is a specific type of variable)
    public static void print(String printMessage){
        System.out.println("- - - - - - -");
        System.out.println(printMessage);
        System.out.println("- - - - - - -");
    }

    //Example #2:
    public static void add(int num1, int num2){
        int result = num1 + num2;
        System.out.println(result);
    }

    //Example #3:
    public static int addV2(int num1, int num2){
        int result = num1 + num2;
        return result;
    }

    //Example #4 (Theoretical):
    // -Suppose we had two squares that we were animating.
    // -So these squares are moving around
    // -Let's write a theoretical method for detecting if these two squares run into each other
    // public static boolean didSquaresCollide(int xPosSq1, int yPosSq1, halfLengthSq1, int xPosSq2, int yPosSq2, halfLengthSq2){
    //      boolean didCollisionOccur = Math to determine if there is a collision
    //      return didCollisionOccur;
    // }
}
