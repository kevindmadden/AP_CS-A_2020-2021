package Period2.u06_Strings;

public class s01_StringMethods {

    public static void main(String args[]){

        /*
            String.length()
                Returns the number of characters in a string.
         */

        String message1 = "I ate food";
        //                 0123456789
        int message1Length = message1.length();
        System.out.println(message1Length); //prints out 10 because message1 has 10 characters.

        /*
            String.substring(int from) - This pulls out a section of a string beginning at index "from" and continuing until the end of the message
            String.substring(int from, int to)
         */
        String message2 = "I like CS.";
        //                 0123456789

        String section1 = message2.substring(2); //store the string in message2 beginning at index 2 until the end
        System.out.println(section1); //prints:like CS.

        String section2 = message2.substring(2,6);
        System.out.println(section2); //prints:like

        String section3 = message2.substring(5,8);
        System.out.println(section3); //prints:e C


        /*
            String.indexOf(String str) - Looks for the first occurence of str and returned the index location.
                If str isn't found anywhere, then it returns -1.
         */
        String message3 = "a bat bat";
        //                 012345678

        int location1 = message3.indexOf("bat"); //this looks up the first time the string "bat" occurs in message3 and returns the index of that first location
        System.out.println(location1); //prints:2

        int location2 = message3.indexOf("t b");
        System.out.println(location2); //prints:4

        int location3 = message3.indexOf("apple");
        System.out.println(location3); //print:-1
    }

}
