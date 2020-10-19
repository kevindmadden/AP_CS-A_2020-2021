package Period2.u02_Conditionals;
import java.util.*;

public class s07_BasicNumberGameTemplate {
    public static void main(String args[]){

        Scanner kb = new Scanner(System.in);
        boolean shouldKeepPlaying = true;

        while(shouldKeepPlaying){
            int theNumber = (int) (Math.random() * 100) + 1;
            int guess = 0;
            //Below do-while loop is the repetition that occurs as long as user guesses incorrectly
            /*do{
                System.out.println("Enter your guess:");
                guess = kb.nextInt();


                if statements (else if), etc. Testing whether the guess is
                too high, too low, or correct


            }while(as long as the guessed number doesn't equal the actual number);*/

            //Logic to ask user whether to play again or not.
            kb.nextLine(); //dummy
            String yesOrNo = kb.nextLine(); //User must type "Y" or "N"

            // Highly non-condensed
            /*if(yesOrNo.equals("Y")){
                shouldKeepPlaying = true;
            }else if(yesOrNo.equals("N")){
                shouldKeepPlaying = false;
            }else{
                shouldKeepPlaying = false;
            }*/

            //Slightly !condensed
            /*if(yesOrNo.equals("Y")){
                shouldKeepPlaying = true;
            }else{
                shouldKeepPlaying = false;
            }*/

            //Highly condensed
            if(!yesOrNo.equals("Y")){ //suppose user enters "N": !yesOrNo.equals("Y") -> !false -> true
                shouldKeepPlaying = false;
            }

            //Mostly condensed -- this is equivalent to the above block of code
            /*if(yesOrNo.equals("Y")==false){ //suppose user enters "N": yesOrNo.equals("Y")==false -> false==false -> true
                shouldKeepPlaying = false;
            }*/

        }
    }
}
