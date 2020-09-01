package Period2.u01_Primitive_Types;

public class s03_ExpressionsAndAssignmentStatements {

    //Tuesday TODO: camelCase
    //Tuesday TODO: Emphasize that the data type of a variable only needs specified ONCE.

    // Assignment Operator: =. It can always be used to change
    //      the value of an existing primitive except in the situation below.


    // Tuesday TODO
    // Dividing by 0 results in this type of error: Arithmetic Exception
    // Order of Operations is followed
    // Also: Math.pow(a, b)
    // Explain integer division

    public static void main(String args[]){

        // final keyword - A primitive declared with the final keyword cannot be changed ever again
        //               - Used for constants
        //               - Variables names are in all CAPS with underscores between words
        final double PI = 3.14;
        //pi = 6.28; => running this line would produce an error
        final int NUM_OF_WHEELS_ON_CAR = 4;

        // Operations: +, -, *, /, %
        // +, -, *, and / all work (mostly) like you would expect
        // ****Division can act like you may not expect!****
        int x = 10;
        int y = 3;
        System.out.println(x/y); // 10/3=3.3333 => (chops off decimal) 3
        int a = 3;
        int b = 2;
        System.out.println(a/b); // 3/2=1.5     => (chops off decimal) 1
        double bOther = 2;
        System.out.println(a/bOther); //3/2=1.5

        // An operation between two int numbers results in an int, even for division.
        // An operation where at least one of the numbers is a double results in a double.

        // % - This operator is the modulos operator.
        //   - Think of as a "remainder"
        System.out.println(3%2); // What is the remainder of 3/2 => 1
        System.out.println(5%3); // What is the remainder of 5/3 => 2
        System.out.println(10%4); // What is the remainder of 10/4 => 2

        // Pull off final digit of number with: # % 10.
        // Pull off final digit of 78436598, then use %.
        System.out.print(78436598%10);






    }

}
