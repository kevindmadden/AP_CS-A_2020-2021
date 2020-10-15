package Period1.u02_Conditionals;
import java.util.*;

public class s07_BasicNumberGameTemplate {
    public static void main(String args[]){

        int theNumber = (int)(Math.random()*100)+1;
        Scanner kb = new Scanner(System.in);

        do{
            System.out.println("Guess the number!");
            int guess = kb.nextInt();

            //series of if statements to test whether the guess is too high
            // too low or correct.


        }while(/*some sort of condition that involves whether guess is correct or not*/);

    }
}
