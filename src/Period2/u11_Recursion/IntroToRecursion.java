package Period2.u11_Recursion;

public class IntroToRecursion {
    public static void main(String args[]) {
        endlessLoop();

    }


    //Example of indirect recursion:
    public static void endlessLoop(){
        System.out.println("haha");
        justForFun();
        System.out.println("can't stop");
    }

    public static void justForFun(){
        System.out.println("hi");
        endlessLoop();
    }

    public void test(int n){
        if(n > 0){
            System.out.println(n);
            test(n-1);
            System.out.println(n);
        }
    }

    //For the above method, what happens when we call...
    //test(4)
    //????

    //test(4)

    //Live:
    //print out: 4, 3, 2, 1, 1, 2, 3, 4


    //5! = 5*4!
    //4! = 4*3!
    //3! = 3*2!
    //2! = 2*1!
    //1! = 1*0!
    //0! = 1!

    public static int fact(int num){
        if(num==0){
            return 1;
        }else{
            return num * fact(num-1);
        }
    }

    //When we call...
    //System.out.println(fact(5));
    //...what gets printed out??

    //How we start              Going in reverse and undoing this chain
    //fact(0) => 1
    //fact(1) => 1*fact(0)  => 1*1 = 1
    //fact(2) => 2*fact(1)  => 2*1 = 2
    //fact(3) => 3*fact(2)  => 3*2 = 6
    //fact(4) => 4*fact(3)  => 4*6 = 24
    //fact(5) => 5*fact(4)  => 5*24 = 120

    //The value that gets printed out is 120 when we call fact(5)!!



}
