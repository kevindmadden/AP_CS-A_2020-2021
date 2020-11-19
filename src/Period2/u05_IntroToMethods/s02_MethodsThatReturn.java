package Period2.u05_IntroToMethods;

public class s02_MethodsThatReturn {
    public static void main(String args[]){

        // Ex of method that returns String value:
        //Think of the method call getTeacherName() as getting replaced with whatever value that method returns.
        System.out.println(getTeacherName());
        System.out.println("My full name is Kevin D. "+ getTeacherName());

        // Ex of method that returns int value:
        System.out.println("Worst Year Ever Is: " + getWorstYearEver());
        System.out.println("Is it " + (getWorstYearEver()+1) + " yet?");


        // public static **** aMethodName()
        // - When the ****'s are void, then there cannot be a return value.
        // - If you want a return value, then the ****'s should specify a data type.

        // What are other data types we've discussed in class?
        //  double, String, int, boolean, char

        //Ex of method that returns double value:
        System.out.println("The circumference of a circle with raidus 4 is: "+2*getPi()*4);

    }

    public static String getTeacherName(){
        String teacherName = "Madden";
        return teacherName;
    }

    public static int getWorstYearEver(){
        int worstYearEver = 2020;
        return worstYearEver;
    }

    public static void thisMethodCannotReturnStuff(){
        //void methods do not return anything
    }

    public static double getPi(){
        double pi = 3.14;
        return pi;
    }

    //Anti-example
    //Always return values of the type your specify.
    //This fails because you are trying to return a String value when you've said that it is public static **int**...
    /*public static int getYear(){
        String year = "twenty twenty";
        return year;
    }*/

}
