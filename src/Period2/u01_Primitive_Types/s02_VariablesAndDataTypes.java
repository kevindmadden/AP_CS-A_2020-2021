package Period2.u01_Primitive_Types;

public class s02_VariablesAndDataTypes {

    public static void main(String[] args) {

        // Variables and Data Types

        // 48, -78, 0, 67.9, true, false, "Text"

        // Variable - something that holds a value

        int x; //this creates/declares a variable called x that can store ONLY integer values
        x = 12; //this assigns the value on the right (12) to the variable on the left (x)
        //12 = x; this does not work!!

        int y = 13; //in a single line, creates/declares the variable y, and then assign the value 13 to the variable y

        // Variable types in this class:
        // int -3, 0, 89, etc. (integers)
        // double - 89.35 (decimals)
        // boolean - true, false
        // String - "text"


        double doubleNum = 12.5;
        boolean isTeacherGood = false;
        String isClassOver = "Maybe, maybe not.";

        //Variables can be used when assigning values

        int length = 20;
        int width = 92;
        int depth = 67;
        //Let's say the length needs to be 92.
        // Two different ways to accomplish this:
        // length = 92
        //  OR
        // length = width;
        length = width;
        // ALSO, this overwrites whatever the value is that was stored in length previously.







    }
}
