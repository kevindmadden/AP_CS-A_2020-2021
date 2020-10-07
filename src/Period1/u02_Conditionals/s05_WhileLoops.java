package Period1.u02_Conditionals;

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
            -Skip 21214
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
            System.out.println("Welcome to Java!!");
            System.out.println(count);
            count++;
        }

        int sum = 0;
        int i = 1;
        while(i < 10){
            sum = sum + i;
            i++;
        }
        System.out.println(sum);

        //          sum+ i = (NEW) sum
        //1st: sum = 0 + 1 = 1
        //2nd: sum = 1 + 2 = 3
        //3rd: sum = 3 + 3 = 6
        //4th: sum = 6 + 4 = 10
        //...
        //go until i=9, then stop
        //Final result is 45.


        //"INFINITE" loop
        /*while(i < 11){
            sum = sum + i;
            System.out.println(sum);
        }*/
        //The reason why this loop isn't truly infinite is because eventually
        // sum will have a value in it that is larger than the largest possible
        // int value in java, which will cause an error
        // You can print out the largest possible int value like this:
        System.out.println(Integer.MAX_VALUE);

        //Infinite loop
        /*int j = 0;
        while(j < 10){
            System.out.println("Hello world");
        }*/





    }
}
