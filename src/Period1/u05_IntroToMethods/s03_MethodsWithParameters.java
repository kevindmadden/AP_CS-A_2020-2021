package Period1.u05_IntroToMethods;

public class s03_MethodsWithParameters {
    public static void main(String args[]){

        //Example #1:
        //When you call the method, you are storing the value you specify in the parameter.
        // So when you put it all together, you can think of this as having happened behind the scenes:
        //      String printMessage = "Print this message!"
        print("Print this message!");

        //Example #2:
        //When I call this, you can think of this happening behind the scenes:
        //     int num1 = 2;
        //     int num2 = 7;
        add(2,7);

        //Example #3 (Has both paremeters and a return statement)
        //When I call this, you can think of this happening behind the scenes:
        //     int num1 = 4;
        //     int num2 = 7;
        // The difference with addV2 versus add is that addV2 returns the result of the addition.
        //      So you can also think of this as addV2(4,7) getting replaced with 11.
        System.out.println(addV2(4,7));
        System.out.println(addV2(4,7)*3);

        // The difference between add (Ex #2) and addV2 (Ex #3) is that addV2 returns a value
        // that you can then do something with.
    }

    //Example #1:
    // In the method, you basically declare a variable in the ()
    //                       String printMessage --> This is called a parameter (specific type of variable)
    public static void print(String printMessage){
        System.out.println("- - - - - - -");
        System.out.println(printMessage);
        System.out.println("- - - - - - -");
    }

    //Example #2
    public static void add(int num1, int num2){
        int result = num1+num2;
        System.out.println(result);
    }

    //Example #3
    public static int addV2(int num1, int num2){
        int result = num1+num2;
        return result;
    }


    public static class s04_MethodsReview {
        public static void main(String args[]){
            System.out.println("hello");

        }

        public static int add(int num1, int num2){
            int result = num1+num2;
            return result;
        }

    }
}
