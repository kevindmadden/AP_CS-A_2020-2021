package Period1.u06_Strings;

public class s01_StringMethods {

    public static void main(String args[]){

        /*
            Length

            For strings when you want to access length, you do String.length().
            However, to access the length of an array, you do Array.length.

            So the main difference is having () or not having them.
            On the AP test, the graders don't count off points if you accidentally mess up whether it has () or not.
         */
        String message1 = "You chose to focus on strings first.";
        int message1Length = message1.length();
        System.out.println(message1Length); //prints 36


        /*
            Substring

                String.substring(int from) - starts at index "from" and pulls until end.
                String.substring(int from, int to) - starts at index "from" and pulls up through index "to" but doesn't include index "to"

         */
        String message2 = "Winter yay";
        //                 0123456789

        String section1 = message2.substring(7); //pulls the string that starts at index 7 until the end of the message
        System.out.println(section1);

        String section2 = message2.substring(0,6); //pulls string beginning at index 0 up to index 6 (but doesn't include index 6)
        System.out.println(section2);

        String section3 = message2.substring(5,8); //pulls string beginning at index 5 up to index 8 (but doesn't include index 6)
        System.out.println(section3);

        /*
            indexOf
                Returns the index of whatever String you are trying to lookup.
         */
        String message3 = "a bat bat";
        //                 012345678
        int indexLocation1 = message3.indexOf("bat");
        System.out.println(indexLocation1); //prints out **2** because "bat" occurs for the first time in message3 at index **2**.

        int indexLocation2 = message3.indexOf("t b");
        System.out.println(indexLocation2); //prints out 4

        int indexLocation3 = message3.indexOf("apple");
        System.out.println(indexLocation3); //prints out -1 because the string "apple" is nowhere in message3.


    }

}
