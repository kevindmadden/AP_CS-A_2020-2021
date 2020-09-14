package Period1.u01_Primitive_Types;

import java.util.Scanner;

public class ScannerExperimentation {

    public static void main(String args[]){
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = kb.nextInt();

        kb.nextLine(); //dummy

        System.out.println("Enter a word");
        String word = kb.nextLine();

        System.out.println("Enter a number:");
        int num2 = kb.nextInt();


    }

}
