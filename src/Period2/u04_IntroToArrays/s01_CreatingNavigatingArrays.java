package Period2.u04_IntroToArrays;

public class s01_CreatingNavigatingArrays {

    public static void main(String args[]){


        // Array: List of the same kind of stuff
        String[] videoGameTitles = {"COD", "Minecraft", "GTA", "Candy Crush Saga", "Mario Kart", "R6 Siege" };
        // index values:               0            1      2                   3             4           5



        // Goal: Print out each of the items in the array.

        //Long way to accomplish goal:
        System.out.println( videoGameTitles[0] );
        System.out.println( videoGameTitles[1] );
        System.out.println( videoGameTitles[2] );
        System.out.println( videoGameTitles[3] );
        System.out.println( videoGameTitles[4] );
        System.out.println( videoGameTitles[5] );

        //Short way to accomplish goal:
        for(int i=0; i<6; i++){
            System.out.println( videoGameTitles[i] );
        }

        // Length of an Array - The length of an array is the number of items in the array.
        System.out.println(videoGameTitles.length); //The array videoGameTitles is length 6. So this prints out 6.

        //So we could rewrite the above for loop like so:
        for(int i=0; i<videoGameTitles.length; i++){
            System.out.println( videoGameTitles[i] );
        }

        // https://csawesome.runestone.academy/runestone/books/published/csawesome/Unit6-Arrays/topic-6-1-array-basics.html#using-new-to-create-arrays
        // So there are a couple different ways to create a new array:
        String[] ex1 = {"COD", "Minecraft", "GTA", "Candy Crush Saga", "Mario Kart", "R6 Siege" };
        int[] ex2 = new int[6]; //creates an int array with 6 items that are the default values
        System.out.println(ex2[3]);
        // When you create an array like ex2, the array gets filled up with default values that depend on whatever
        //  the data type is.
        // Default Values:
        // String - null
        // int - 0
        // double - 0.0
        // boolean - false



    }

}

