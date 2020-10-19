package Period1.u02_Conditionals;
import java.util.*;

public class s07_BasicNumberGameTemplate {
    public static void main(String args[]){



        Scanner kb = new Scanner(System.in);
        boolean shouldKeepPlaying = true;

        while(shouldKeepPlaying){
            int theNumber = (int)(Math.random()*100)+1;
            int guess;

            /*do{
                System.out.println("Guess the number!");
                guess = kb.nextInt();

                //series of if statements to test whether the guess is too high
                // too low or correct.


            }while(some sort of condition that involves whether guess is correct or not);*/

            System.out.println("Do you want to play again? (Enter Y for yes, or N for no.");
            kb.nextLine(); //dummy
            String yesOrNo = kb.nextLine();

            //Non-condensed version
            /*if(yesOrNo.equals("Y")){
                shouldKeepPlaying=true;
            }else if(yesOrNo.equals("N")){
                shouldKeepPlaying=false;
            }else{
                shouldKeepPlaying=false;
            }

            //Non-condensed version
            if(yesOrNo.equals("Y")){
                shouldKeepPlaying=true;
            }else{
                shouldKeepPlaying=false;
            }*/

            //Fully condensed version
            if(!yesOrNo.equals("Y")){ //(assuming user enters N) !yesOrNo.equals("Y")=>!false=>true
                shouldKeepPlaying=false;
            }

            //The below block does the same thing as the above block
            //if(yesOrNo.equals("Y")==false){
            //    shouldKeepPlaying=false;
            //}
        }
    }
}
