package Period2.u02_Conditionals;

public class s06_doWhileLoopsRandomNums {
    public static void main(String args[]){
        //While Loop
        int x=0;
        while(x>0){
            System.out.println("In while loop!");
        }
        //Nothing in the above loop will be printed because it will never run

        do{
            System.out.println("In do-while loop!");
        }while(x>0);
        //The print statement in the do-while loop will run exactly once.
        //What makes a do-while loop different is the stuff in the loop is
        // guaranteed to run at least one time.


        //Random Numbers!
        //For your project, I ask you to generate a random number between
        // 1 and 100 inclusive.
        double randVal = Math.random(); //how to generate a random num between 0 and 1 (not inlcuding 1)
        System.out.println(randVal);
        System.out.println(randVal*100);
        System.out.println((int)(randVal*100));
        System.out.println((int)(randVal*100)+1);
        //(int)(Math.random()*100)+1 // how you would generate the random number all at once






    }
}
