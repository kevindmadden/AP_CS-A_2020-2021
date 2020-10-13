package Period2.u02_Conditionals;

public class s05_WhileLoops {
    public static void main(String args[]){
        /*
        If you find that you need more explanation, check out the additional resource
        at the link below. At least for me, I generally need to read the info about new
        coding topics from a couple of different sources before everything clicks.
        Additional reading about while loops:
         https://csawesome.runestone.academy/runestone/books/published/csawesome/Unit4-Iteration/topic-4-1-while-loops.html
        */

        /*
        Assignment:
            -Complete ALL 5.2 MPL exercises
            -Skip 21214 (I should have had you skip 21212, 21007, 21009, as well... sorry)
            -Exercises 21007 and 21009 require you to compare strings. When
            comparing strings, use .equals() instead of ==. The syntax works like
            this:
                String word1 = "hello"
                String word2 = "hello"
                String word3 = "bye"

            Here are a few examples:
                word1.equals(word2)  //this expression evaluates to true
                word1.equals("hello") //this expression evaluates to true
                word1.equals(word3) //this expression evaluates to false
                word1.equals("test") //this expression evaluates to false
                word1==word2 //DO NOT CHECK EQUALITY OF TWO STRINGS WITH ==
                word1==word3 //DO NOT CHECK EQUALITY OF TWO STRINGS WITH ==

         */

        //Two types of while loops: standard while loop, do while loop

        int count = 0;
        while(count < 100){
            System.out.println("This is a while loop");
            System.out.println(count);
            count++;
        }
        System.out.println("Whatever is next");

        count = 0;
        while(count < 100){
            System.out.println("This is a while loop");
            System.out.println(count);
            count=count+10;
        }
        System.out.println("This while loop doesn't run as many times because count goes up faster.");

        //Example of an infinite loop:
        /*int i = 0;
        while(i < 50){
            System.out.println("Do something");
            System.out.println(i);
        }*/

        int sum = 0;
        int i = 1;
        while(i < 10){
            sum = sum + i;
            i++;
        }
        System.out.print(sum);
        //     sum + i;
        //1st    0 + 1 = 1
        //2nd    1 + 2 = 3
        //3rd    3 + 3 = 6
        //4th    6 + 4 = 10
        //5th    ...
        //         + 9 = 45





    }
}
