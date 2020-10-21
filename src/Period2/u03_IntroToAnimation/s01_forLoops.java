package Period2.u03_IntroToAnimation;

public class s01_forLoops {

    public static void main(String args[]){

        //Simple While loop example
        int happinessLevel = 0;
        while(happinessLevel<5){
            System.out.println("(While Loop) Happiness Level:"+happinessLevel);
            happinessLevel++;
        }

        //For-loop example (similar to while-loop example)
      //for  declare and set var;      condition          change
        for(int happinessLevel2 = 0; happinessLevel2<5; happinessLevel2++){
            System.out.println("(For loop) Happiness Level:" + happinessLevel2);
        }

        //For-loop that immediately ends because the condition is false from the beginning
        for(int i=0; i==500; i++){
            System.out.println("i: "+i);
        }

        /*
        For-Loop Ordering Notes:
        1. Declare and initialize the variable (int happiness2 = 0;)
        2. Immediately after this, the condition is checked.
            -If the condition is true, the for-loop will run.
            -If the condition is false, the for-loop will immediately stop
        3. Once you reach the closing brace of the for-loop,
                the change portion of the for-loop is run (happinessLevel2++).
        4. Repeat steps (2.) and (3.) until you reach a point where the condition in
                step (2.) is false. At this point, the for-loop immediately stops running
                and the code resumes running starting at the closing brace of the for-loop.
         */







    }

}
