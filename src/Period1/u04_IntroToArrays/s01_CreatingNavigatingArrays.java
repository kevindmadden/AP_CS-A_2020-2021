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



    }

}

