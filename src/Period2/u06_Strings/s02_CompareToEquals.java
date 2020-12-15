package Period2.u06_Strings;

public class s02_CompareToEquals {

    public static void main(String args[]){

        /*
            String.equals
         */

        //If you are testing to see if two int, double, or boolean values are equals, then you use ==
        //For example
        int a = 3;
        int b = 4;
        if(a==b){
            //do stuff
        }

        //For Strings, do NOT use the =='s to test for equality.
        //Instead, use the String.equals method.
        //For example:
        String str1 = "hello";
        String str2 = "hello";
        if(str1.equals(str2)){ //do NOT do str1==str2
            //do stuff
        }

        /*
            String.compareTo
         */

        String str3 = "goodbye";
        String str4 = "goodbye";
        //         this           other
        int val1 = str3.compareTo(str4);
        System.out.println(val1); //print:0 (the reason it prints 0 is because this (str3) is equal to other (str4)

        //What does it mean for a string to be less than another string?
        //  It means that the string's ASCII value is less than the other string's ASCII value.
        //  https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html
        String str5 = "A"; //65
        String str6 = "a"; //97

        //          65     -       97 = -32
        int val2 = str5.compareTo(str6);
        System.out.println(val2); //prints:-32
        //           97     -      65 = 32
        int val3 = str6.compareTo(str5);
        System.out.println(val3);//prints:32


    }
}
