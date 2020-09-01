package Period1.u01_Primitive_Types;

public class s03_ExpressionsAndAssignmentStatements {

    // Dividing by 0 results in this type of error: Arithmetic Exception
    // Order of Operations is followed
    // Also: Math.pow(a, b)
    // Explain integer division
    // Pull off final digit of number with: # % 10.

    public static void main(String args[]){

        // Assignment Operator: =. It can always be used to change
        //      the value of an existing primitive except in the situation below.
        // final keyword - A primitive declared with the final keyword cannot be changed ever again
        //               - Used for constants
        //               - Variables names are in all CAPS with underscores between words
        final double PI = 3.14;
        final int NUMBER_OF_WHEELS = 4;

        // Operations: +, -, *, /, %
        // Rules for Operations:
        //      An operation between two int numbers results in an int, even for division.
        //      An operation where at least one of the numbers is a double results in a double.

        int x = 10;
        int y = 3;

        System.out.println(x/y); //results in 3 (think about like this: do normal division, chop of decimal numbers)

        // % - modulos operator
        // "remainder"
        // When you first learned division, maybe you got this problem: 10/3.
        // What is the remainder of 10/3? Answer: 1
        // 10%3 => 1
        // So % means do the division, and compute the remainder. That remainder is what the % gives.
        // 5%3 => 2 (So you do 5/3; 3 goes into 5 one time; you are left with a remainder of 2)

        // Let's say I asked you to print out the rightmost digit of the variable below:
        int z = 8768456;
        // z/10 = 876845 remainder: 6
        System.out.println(z%10); //prints out 6
        //This pattern continues. You could print out final 2 digits by doing z%100.

        double a = 9;
        int b =10;

    }

}
