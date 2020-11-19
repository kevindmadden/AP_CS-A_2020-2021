package Period2.u05_IntroToMethods;

public class s01_VoidMethods {
    public static void main(String args[]) {
        //Before we start class
        // - General Class Update
        // - - Project Due
        // - Guessing game grades
        // - Other general questions about class?

        //Topic for the Day: Void Methods

        // Example #1 of when you might use a method: See u03_IntroToAnimation.s02_VariableScope.java

        //Reasons for Using Methods
        // #1) Avoiding having the same exact code in two places.
        // #2) It makes code easier to maintain/revise.
        // #3) Clarifies what your code is doing if you write a good method name, and can provide more organization.


        //Example #2: Let's say you wanted to print out the gettysburg address 100 times.

        System.out.println("Here is the Gettysburg Address once:");
        printGettysburgAddress();
        System.out.println("Here is the Gettysburg Address 100 more times:");
        for(int i=0; i < 100; i++){
            printGettysburgAddress();
        }

        //Example #3: The public static void main(String args[]) is a void method.

    }

    public static void printGettysburgAddress(){
        System.out.println("Four score and seven years ago our fathers brought forth on this continent, a new nation, conceived in Liberty, and dedicated to the proposition that all men are created equal.");
        System.out.println("Now we are engaged in a great civil war, testing whether that nation, or any nation so conceived and so dedicated, can long endure. We are met on a great battle-field of that war. We have come to dedicate a portion of that field, as a final resting place for those who here gave their lives that that nation might live. It is altogether fitting and proper that we should do this.");
        System.out.println("But, in a larger sense, we can not dedicate—we can not consecrate—we can not hallow—this ground. The brave men, living and dead, who struggled here, have consecrated it, far above our poor power to add or detract. The world will little note, nor long remember what we say here, but it can never forget what they did here. It is for us the living, rather, to be dedicated here to the unfinished work which they who fought here have thus far so nobly advanced. It is rather for us to be here dedicated to the great task remaining before us—that from these honored dead we take increased devotion to that cause for which they gave the last full measure of devotion—that we here highly resolve that these dead shall not have died in vain—that this nation, under God, shall have a new birth of freedom—and that government of the people, by the people, for the people, shall not perish from the earth.");
    }



}
