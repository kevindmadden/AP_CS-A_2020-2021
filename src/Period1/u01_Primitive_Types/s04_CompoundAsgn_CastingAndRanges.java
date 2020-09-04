package Period1.u01_Primitive_Types;

public class s04_CompoundAsgn_CastingAndRanges {

    public static void main(String args[]){

        //Compound Assignment Operators
        int counter = 0;
        //Do something complex that needs counted
        counter = counter + 1; // result, counter now equals 1
        //Do something complex that needs counted
        counter = counter + 1; // result, counter now equals 2

        //you can have the same results as counter for counter2, but in a shorter way
        int counter2 = 0;
        //Do something complex that needs counted
        counter2+=1; // result, counter2 now equals 1
        //Do something complex that needs counted
        counter2+=1; // result, counter2 now equals 2

        int variableToDoStuffWith = 5;
        variableToDoStuffWith-=3; // variableToDoStuffWith = variableToDoStuffWith - 3, result:2
        variableToDoStuffWith*=4; // variableToDoStuffWith = variableToDoStuffWith*4, result:8
        variableToDoStuffWith/=2; // variableToDoStuffWith = variableToDoStuffWith/2, result:4
        variableToDoStuffWith%=3; // variableToDoStuffWith = variableToDoStuffWith%3, result:1

        //Increment and Decrement Operators
        int counter3 = 0;
        counter3++; //counter3=counter3+1 ------ counter3+=1, result:1
        System.out.println(counter3);
        counter3++; //counter3=counter3+1 ------ counter3+=1, result:2
        System.out.println(counter3);
        counter3--; //counter3=counter3-1 ------ counter3-=1, result:1


        //
        // Casting and Ranges of Variables
        //

        // "Casting" a variable means changing it from one type to another.
        double x = 1.7;
        //int newX = x; <== That will not work
        int newX = (int)x; // "(int)" <== this is a casting operator
        System.out.println(newX); //result is 1 (the .7 just gets chopped off the 1.7)

        //
        // Rounding posNum or negNum
        //

        double posNum = 1.4; // <--- Try to round this num
        //The smallest number that you would ever want to round up to 2, is 1.5.
        int print = (int)(posNum+0.5);

        //if r is 1.5, then r+0.5=2.0 <== the "(int)" will chop off decimal and round up correctly
        //if r is 1.49, then r+0.5=1.99 <== the "(int)" will chop off decimal and round down correctly
        double negNum = -1.49; // <--- Try to round this num
        print = (int)(negNum-0.5);

        int maxValue = Integer.MAX_VALUE;
        int minValue = Integer.MIN_VALUE;

        // If something were to cause an integer to reach a larger (or smaller) value
        // than the max (or min), then an integer overflow error occurs.


        // If you try to divide by 0 in java, you get an ArithmeticException
        //System.out.println(8/0);







    }

}
