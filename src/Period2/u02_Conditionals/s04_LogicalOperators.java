package Period2.u02_Conditionals;

public class s04_LogicalOperators {

    public static void main(String args[]){
        //So if you want two things to be true, here's the only way we have to deal that right now

        int x = 16;
        int y = 5;

        //Print out a statement if both x is greater than 10 and y is greater than 4
        if(x>10){
            if(y>4){
                //Print something
            }
        }

        //The way you could combine both of these if statements into one if statement:
        if(x>10 && y>4){
            //print something
        }

        //&& - means AND
        //Both sides of the && have to be true in order for the whole thing to be true.

        //if(x>10 && y>5){
        //if(true && false){
        //if(false){

        //|| - means OR
        //Only one side of the || has to be true in order for the whole thing to be true.

        //if(x>10 || y>5){
        //if(true || false){
        //if(true){


        //Where have you seen the ! mark so far this school year?
        // !=

        //! - means logical negation

        boolean isRaining = true;
        if(!isRaining){
            //Print something about not raining
        }

        //The other way you could do it:
        if(isRaining==false){
            //Print something about not raining
        }

        //You can also use ! to negate entire logical expressions
        //if(!(x>10 && y>5)){
        //if(!(true && false)){
        //if(!(false)){
        //if(true){

        //Order of Operations
        // There is an order of operations for !, &&, ||
        //0th priority: ()
        //1st priority: !
        //2nd priority: &&
        //3rd priority: ||

        //For example:
        int a = 7;
        int b = 5;
        int c = -1;

        //if(a>9 || b>6 && c==-1)
        //if(a>9 || false)
        //if(false || false)
        //if(false)



    }
}
