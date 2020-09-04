package Period1.u01_Primitive_Types;
import java.util.*;

public class s05_ReadingKeyboardInput {

    public static void main(String args[]){

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter integer here:");
        int num = keyboard.nextInt();
        System.out.println("The num entered was: " + num);
        double num2 = keyboard.nextDouble();
        System.out.println("The num entered was: " + num2);

        keyboard.nextLine();
        String words = keyboard.nextLine();
        System.out.println("The words entered was: " + words);
        String words2 = keyboard.nextLine();
        System.out.println("The words entered was: " + words2);

    }

}
