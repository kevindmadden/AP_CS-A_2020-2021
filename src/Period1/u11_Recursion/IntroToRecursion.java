package Period1.u11_Recursion;

public class IntroToRecursion {
    public static void main(String args[]) {
        endlessLoop();

    }

    public static void endlessLoop(){
        System.out.println("endless");
        endlessLoop();
    }

    // 5! = 5*4*3*2*1 = 5*4!
    // 4! = 4*3*2*1   = 4*3!

    //Let's say we call:
    //System.out.println(fact(5));

    public static int fact(int num){
        if(num==0){
            return 1;
        }else{
            return num * fact(num-1); //1 * fact(0)
        }
    }

    //fact(0) => 1
    //fact(1) =>  1 * fact(0) => 1*1 => 1
    //fact(2) =>  2 * fact(1) => 2*1 => 2
    //fact(3) =>  3 * fact(2) => 3*2 => 6
    //fact(4) =>  4 * fact(3) => 4*6 => 24
    //fact(5) =>  5 * fact(4) => 5*24 => 120

    //Conclusion...
    //If we called...
        //System.out.println(fact(5));
    // The 120 would be printed out


}
