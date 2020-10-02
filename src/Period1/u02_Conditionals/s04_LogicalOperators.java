package Period1.u02_Conditionals;

public class s04_LogicalOperators {

    public static void main(String args[]){
        //So if you want two things to be true, here's the only way we have to deal that right now

        int x = 16;
        int y = 5;

        //Both of these need to be true: x>10, y>5
        if(x>10){
            if(y>5){
                System.out.println("Both are true!!");
            }
        }

        //But today....
        //There are more concise ways of checking that both x>10 and y>5.

        //More concise:
        if(x>10 && y>5){
            System.out.println("Both are true!!");
        }

        //If values are...
        //int x = 16;
        //int y = 5;
        //(x>10 && y>5)
        //(true && false)
        //(false)

        //So for &&, both sides have to be true in order to get true.
        //If values are...
        //int x = 16;
        //int y = 6;
        //(x>10 && y>5)
        //(true && true)
        //(true)

        //    ||
        // The above means "OR".
        // As long as at least one side is true, then it will evaluate to true.
        //int x = 16;
        //int y = 5;
        //(x>10 || y>5)
        //(true || false)
        //(true)

        //If values are...
        //int x = 16;
        //int y = 6;
        //(x>10 || y>5)
        //(true || true)
        //(true)

        //We have already seen ! in the operator != (not equals)
        //So the common way you'll see ! used in the programming world is to negate boolean variables in if statements
        boolean isRaining = false;

        if(!isRaining){ //hey, if isRaining is false, then do this.
            //do something
        }

        //Example from earlier...
        //int x = 16;
        //int y = 5;
        //!(x>10 && y>5)
        //!(false)
        //true

        x = 16;
        y=5;
        if(!(x>10 && y>5)){
            System.out.println("It would print this out.");
        }

        // There is an order of operations for !, &&, ||
        //0th priority: ()
        //1st priority: !
        //2nd priority: &&
        //3rd priority: ||

        int z = 20;

        //What order would the below expression be evaluated in?
        // x>15 && y>4 || z >10
        // It would be evaluated in this order:
        // (x>15 && y>4) || z >10







    }
}
