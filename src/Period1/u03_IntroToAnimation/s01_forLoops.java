package Period1.u03_IntroToAnimation;

public class s01_forLoops {

    public static void main(String args[]){

        //Simple While loop example
        int happinessLevel = 0;
        while(happinessLevel<5){
            System.out.println("While loop: Happiness Level:" +happinessLevel);
            System.out.println("While loop: Not happy yet");
            happinessLevel++;
        }
        System.out.println("While loop: Now happy");


        //For-loop equivalent
        boolean isHappy2 = false;
      //for(        declaration;     condition;       control-variable;
        for(int happinessLevel2=0; happinessLevel2<5; happinessLevel2++){
            System.out.println("Happiness Level2:" +happinessLevel2);
            System.out.println("Not happy yet2");
        }
        System.out.println("Now happy");


        /*
        For loop Notes:
        -Declaration: Declare a new variable and initialize it (variable for controlling the for-loop)
        -Condition: Condition for what must be true in order to run the for-loop
        -Control-variable: This is something that happens
            each time you run the for-loop

        Ordering:
        -The declaration part happens immediately at the start and only at the start.
        -The condition is checked every time the for-loop is run.
            -The condition is checked the first time we run the for-loop.
            -The condition is checked every subsequent time the for-loop is run.
            -The condition is checked immediately after the control variable is altered (except for the first time)


         */


    }

}
