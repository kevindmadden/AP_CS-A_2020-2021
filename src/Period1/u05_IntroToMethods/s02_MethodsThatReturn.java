package Period1.u05_IntroToMethods;

public class s02_MethodsThatReturn {
    public static void main(String args[]){
        //So this is the main method where we usually do stuff

        System.out.println(getName()); //Printed out the String: Kevin Madden
        System.out.println(getName()+" (Middle Name is David)"); //Did something with the string we got back, and we added onto it

        System.out.println(getWorstYear()); //Printed out int: 2020
        System.out.println(getWorstYear()-1); //Printed out int: 2019

        //So, when you have the syntax: public static *** methodName()...
        // then whatever you fill in for the ***, is the return type.
        // Your options are to say void or a data type. So data types
        // that we've learned about are: String, int, double, boolean, char.

        System.out.println("The circumference of a circle with radius 4 is "+ 2*getPi()*4);
        System.out.println("Is it the year 2019? "+ getIsIt2019());

    }

    public static String getName(){
        String name = "Kevin Madden";
        return name;
    }

    public static int getWorstYear(){
        int worstYear = 2020;
        return worstYear;
    }

    /* public static int getBestYear(){
        String bestYear = "not twenty twenty";
        return bestYear;
    }
    ^^^Example of method that wouldn't work.
    I specified that the method was public static int.... but then I try to return a String.

     */

    public static double getPi(){
        double valueOfPi = Math.PI;
        return valueOfPi;

    }

    public static boolean getIsIt2019(){
        boolean isIt2019 = false;
        return isIt2019;
    }



    public static void cannotGetAnything(){
        //You can't return any values from a void method
        //In other words, you cannot pass any information back to where you called the method
    }

}
