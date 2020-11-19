package Period1.u05_IntroToMethods;

public class s01_VoidMethods {
    public static void main(String args[]){
        //Before we start class
        // - General Class Update
        // - - Project Due
        // - Guessing game grades
        // - Other general questions about class?

        System.out.println("Example #1: For first in class example, see s02_VariableScope");
        System.out.println("#1 reason to use a method:");
        System.out.println("      - avoid duplicating code");
        System.out.println("General Rule of Thumb: If you are repeating a certain sequence of code more than once,");
        System.out.println("what that means is you need to use a method.");
        System.out.println("You create new methods outside of the { } of the public static void main(String args[]) method");

        System.out.print("Example #2: This method ");
        printMainMethodStuff();
        System.out.println(" is a void method.");

        System.out.print("Advantage #1: So the ");
        printMainMethodStuff();
        System.out.println(" method is extremely useful if you want to avoid having to type out that entire phrase every time.");

        System.out.println("Advantage #2: You can update the code in the method, and then that code will be updated wherever you use it.");
        System.out.println("Advantage #3: It helps with code organization because having a name for a method can clarify what is going on in your code");

        //Final Example:
        // -Let's say you were looking for the cleanest way to print out the gettysburg address 100 times.
        // -What part of the code is repeating? gettysburg address
        // -What does that mean? A method!

        for(int i=0; i<100; i++){
            printGettysburgAddress();
        }
    }

    //When you add a new method, it needs to be outside of the the public static void main(String args[]) method
    // but inside the outermost { }.

    public static void printMainMethodStuff(){
        System.out.print("*public static void main(String args[])*");
    }

    public static void printGettysburgAddress(){
        System.out.println("\n--------------------------");
        System.out.print("\nFour score and seven years ago our fathers brought forth on this continent, a new nation, conceived in Liberty, and dedicated to the proposition that all men are created equal.\n" +
                "Now we are engaged in a great civil war, testing whether that nation, or any nation so conceived and so dedicated, can long endure. We are met on a great battle-field of that war. We have come to dedicate a portion of that field, as a final resting place for those who here gave their lives that that nation might live. It is altogether fitting and proper that we should do this.\n" +
                "\n" +
                "But, in a larger sense, we can not dedicate—we can not consecrate—we can not hallow—this ground. The brave men, living and dead, who struggled here, have consecrated it, far above our poor power to add or detract. The world will little note, nor long remember what we say here, but it can never forget what they did here. It is for us the living, rather, to be dedicated here to the unfinished work which they who fought here have thus far so nobly advanced. It is rather for us to be here dedicated to the great task remaining before us—that from these honored dead we take increased devotion to that cause for which they gave the last full measure of devotion—that we here highly resolve that these dead shall not have died in vain—that this nation, under God, shall have a new birth of freedom—and that government of the people, by the people, for the people, shall not perish from the earth.");
    }

}
