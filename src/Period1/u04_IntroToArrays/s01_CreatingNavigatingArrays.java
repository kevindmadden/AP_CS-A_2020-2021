package Period1.u04_IntroToArrays;

public class s01_CreatingNavigatingArrays {

    public static void main(String args[]){

        // {6, 9, 30, 78, 5, 68}
        //  0  1   2   3  4  5
        // An Arrays is a list of stuff.

        //Goal: Print out all 6 of these numbers
        int[] firstArray = {6, 9, 30, 78, 5, 68};

        //Long way to accomplish goal:
        System.out.println( firstArray[0] );
        System.out.println( firstArray[1] );
        System.out.println( firstArray[2] );
        System.out.println( firstArray[3] );
        System.out.println( firstArray[4] );
        System.out.println( firstArray[5] );
        //System.out.println( firstArray[6] ); //Don't do this! OutOfBoundsException Error

        //Short way to accomplish goal:
        for(int i = 0; i < 6; i++){
            System.out.println( firstArray[i] );
        }


        //How to create a new array:
        int[] ex1 = {6, 9, 30, 78, 5, 68}; //Fills the array up with some numbers
        String[] ex2 = new String[5]; //What is the array filled with.....?
        System.out.println(ex2[3]); //prints out null?!?

        //Summary: When you create an array like ex2, it's gonna get filled up with whatever
        // the default values are **for that data type**.

        // String default = null
        //    int default = 0
        // double default = 0.0
        //boolean default = false




    }

}

