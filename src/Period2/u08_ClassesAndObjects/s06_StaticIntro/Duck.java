package Period2.u08_ClassesAndObjects.s06_StaticIntro;

//Additional reading on writing classes: https://csawesome.runestone.academy/runestone/books/published/csawesome/Unit5-Writing-Classes/toctree.html

// Classes should always be declared public
// The convention is to capitalize the name of a class ("Duck" in this case).
public class Duck {

    // ===================================================================
    // ===================================================================
    //
    //  PART 1: THE BLUEPRINT
    //          A description of how to CONSTRUCT the object.
    //
    //    Components:
    //      -Instance Variables (also called "fields")
    //      -Constructor
    //
    // ===================================================================
    // ===================================================================

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // - Start of instance variables - - - - - - - - - - - - - - - - - - -

    private int numOfTimesHonked;
    private String speechContent;
    private boolean isSwimming;
    private boolean isFlying;
    private boolean isAlive;

    private static int numOfDucksCreated;

        /*
            Access to attributes [instance variables] should be kept internal
            to the class. Therefore, instance variables are
            designated as private. (MOD-2.A.4)
         */

    // - End of Instance variables - - - - - - - - - - - - - - - - - - - -
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -


    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // - Start of constructor  - - - - - - - - - - - - - - - - - - - - - -

    public Duck(){ //for constructors, first letter should be upper case; the name of the constructor should be the same as the name of the class
        numOfTimesHonked=0;
        speechContent="honk!";
        isSwimming=true;
        isFlying=false;
        isAlive=true;
        numOfDucksCreated++;
    }
        /*
            Constructors are used to set the initial state of an object,
            which should include initial values for
            ALL instance variables. (MOD-2.B.2)
        */
    // - End of constructor  - - - - - - - - - - - - - - - - - - - - - - -
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -


    // ===================================================================
    // ===================================================================
    //
    //  PART 2: THE MANUAL
    //          A description of how to USE the object.
    //
    //    Components:
    //      -Methods
    //
    // ===================================================================
    // ===================================================================

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // Start of Methods  - - - - - - - - - - - - - - - - - - - - - - - - -

    public void honk(){
        System.out.println(speechContent+ " " + speechContent);
        numOfTimesHonked+=2; //equivalent to: numOfTimesHonked = numOfTimesHonked + 2;
    }

    public void takeFlight(){
        isSwimming = false;
        isFlying = true;
    }

    public void killedByCar(){
        isSwimming = false;
        isFlying = false;
        isAlive = false;
        System.out.println("RIP Duckie");
        numOfDucksCreated--;
    }

    public void printNumOfTimesHonked(){
        System.out.println("The duck has honked "+numOfTimesHonked+" times.");
    }

    public int getNumOfTimesHonked(){
        return numOfTimesHonked;
    }

    public void setNumOfTimesHonked(int numOfTimesHonked){
        this.numOfTimesHonked = numOfTimesHonked;
    }

    public void startSwimming(){
        isSwimming = true;
        isFlying = false;
    }

    public static int getNumOfDucksCreated(){
        return numOfDucksCreated;
    }

    public String toString(){
        return numOfTimesHonked + " is the number of times this duck has honked. And the duck's message is:" + this.speechContent;
    }

    // End of methods  - - - - - - - - - - - - - - - - - - - - - - - - - -
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -


}

