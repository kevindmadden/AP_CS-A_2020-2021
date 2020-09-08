package Period2.u01_Primitive_Types;
import java.util.*;

public class s05_ReadingKeyboardInput {

    public static void main(String args[]){

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter integer here:");
        int num = keyboard.nextInt();
        System.out.println("The number that you entered is: " + num);

        System.out.println("Enter double here:");
        double num2 = keyboard.nextDouble();
        System.out.println("The number that you entered is: " + num2);

        System.out.println("Enter string here:");
        keyboard.nextLine(); //dummy next line
        String words = keyboard.nextLine();
        System.out.println("The words that you entered: " + words);

        // File -> New ->


    }

}
