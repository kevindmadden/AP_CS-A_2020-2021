package Period2.u01_Primitive_Types;

public class s04_CompoundAsgn_CastingAndRanges {

    public static void main(String args[]){

        //Compound Assignment Operators
        int counter = 0;
        //Do something complex that needs counted
        counter = counter + 1; // result => 0+1 => counter now equals 1
        //Do something complex that needs counted
        counter = counter + 1; // result => 1+1 => counter now equals 2



        //you can have the same results as counter for counter2, but in a shorter way
        int counter2 = 0;
        //Do something complex that needs counted
        counter2+=1; // means the same thing as: counter2 = counter2 + 1
        //Do something complex that needs counted
        counter2+=1; // means the same thing as: counter2 = counter2 + 1

        // Java's Operators: +, -, *, /, %
        // Java's Compound Operators, +=, -=, *=, /=, %=
        int counter3 = 0;
        counter3-=2; // equivalent to: counter3=counter3-2;
        counter3*=2; // equivalent to: counter3=counter3*2;
        counter3/=2; // equivalent to: counter3=counter3/2;
        counter3%=2; // equivalent to: counter3=counter3%2;

        // increment operators, decrement operators
        int counter4 = 0;
        counter4++; // counter4 = counter4 + 1;
        System.out.println(counter4); //result: 1
        counter4++;
        System.out.println(counter4); //result: 2
        counter4--; // counter4 = counter4 - 1;
        System.out.println(counter4); //result: 1

        //
        // Casting and Ranges of Variables
        //

        double x = 4.5;
        // int newX = x; //result: ERROR: you cannot just autoconvert a double to an int
        int newX = (int)x; // result: newX = 4 (the decimal gets chopped off)
        // THERE IS NO ROUNDING THAT TAKES PLACE HERE

        // Question: Is there a way using forced conversion to correctly round whatever
        //              random decimal number I give you? (You have no way of knowing
        //              what number I gave you; you only see the result of what you do.)

        // Tools at your disposal:
        //      You can use (int), +, -, =, /, %, ()
        //          The random decimal # is the variable z

        double z = 2.1;
        System.out.println((int)(z+0.5)); //if z is positive
        System.out.println((int)(z-0.5)); //if z is negative

        // A few Last Things
        // Error Messages

        // ArithmeticException Error
        //System.out.println(1/0);

        //Overflow Error
        System.out.println(Integer.MAX_VALUE);
        //int i = 2147483648; //AirthmeticException error










    }

}
