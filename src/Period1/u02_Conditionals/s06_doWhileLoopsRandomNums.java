package Period1.u02_Conditionals;

public class s06_doWhileLoopsRandomNums {

    public static void main(String args[]){


        int x = 0;
        while(x>0){
            //do stuff
            System.out.println("In while loop!");
        }
        //The while loop above isn't going to run even once

        //The do-while loop below is guaranteed to run the first time because
        // the condition isn't checked until the end!
        do{
            //do stuff
            System.out.println("In do-while loop!");
        }while(x>0);

        //The do-while loop is useful if you know you want to run something
        // at least one time.


        //Goal: Generate a random number between 1 and 100 inclusive.

        //How to generate random numbers.
        double randNum1 = Math.random();
        System.out.println(randNum1);
        System.out.println(randNum1*100);
        System.out.println((int)(randNum1*100));

        //So here it is all together! You add 1 because this eliminates 0 from being
        // a possibility, and it makes 100 now a possibility.
        int randNumInt = (int)(Math.random()*100)+1;


        //Game logic loop - Tell user if their guess is too high or too low or correct
        //Main loop - Inside this main loop will be your game logic loop and the logic
        // where you ask whether the user wants to play again and you act accordingly

    }

}
