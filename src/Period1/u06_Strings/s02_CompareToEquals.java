package Period1.u06_Strings;

public class s02_CompareToEquals {

    public static void main(String args[]){

        /*
            String.equals
         */

        // so if you're comparing int, double, or boolean values, you've been doing it like this:
        int a = 1;
        int b = 4;
        if(a == b){
            //do something
        }

        //the double =='s comparison above is NOT the way you want to do it for Strings
        //Here is how to test for equality between two Strings
        String str1 = "hello";
        String str2 = "goodbye";
        if(str1.equals(str2)){ //do NOT do it this way: str1 == str2
            //do stuff
        }

        /*
            String.compareTo
         */

        String str3 = "hello";
        String str4 = "hello";
        int val1 = str3.compareTo(str4);//print:0
        System.out.println(val1);

        //ASCII value table: https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html

        String str5 = "a"; //97
        String str6 = "A"; //65
        //          97     -       65   = 32
        int val2 = str5.compareTo(str6);
        System.out.println(val2);
        //prints:32 (the reason why is because the ASCII value of str5 is greater than the ASCII value of str6)
        // Note: 97-65 = 32

        //          65     -      97    = -32
        int val3 = str6.compareTo(str5);
        System.out.println(val3); //prints -32



    }
}
