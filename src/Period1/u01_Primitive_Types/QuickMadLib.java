package Period1.u01_Primitive_Types;
import java.util.*;

public class QuickMadLib {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String firstName = keyboard.nextLine();

        System.out.println("Enter your age:");
        int age = keyboard.nextInt();

        keyboard.nextLine();
        System.out.println("Enter your favorite video game:");
        String videoGame = keyboard.nextLine();

        System.out.println("My first name is " + firstName);
        System.out.println("I am " + age + " years old.");
        System.out.println("My favorite video game is " + videoGame);


    }
}
