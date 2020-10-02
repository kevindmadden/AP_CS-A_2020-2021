package Period1.u02_Conditionals;

public class s03_CommonErrorsInIfStatements {
    public static void main(String args[]){

        //Common Error #1 - Not using braces!!
        int x = 0;
        int y = 0;
        if(x>=y)
            x++;
        System.out.println(x); //prints out 1
        if(x>=y)
            x++;
            y++;
        System.out.println(x); //prints out 2
        System.out.println(y); //prints out 1
        if(x<=y)
            x++;
            y++;
        System.out.println(x); //prints out 2
        System.out.println(y); //prints out 2

        //If you do NOT include braces after an if statement, then the only code
        // that is "part" of the if statement is the imemdiately following line.

        // For example, if I rewrote the above code to function in the same way as above
        // but wanted to use braces, here is what it would look like.

        x = 0;
        y = 0;
        if (x>=y) {
            x++;
        }
        System.out.println(x); //prints out 1
        if(x>=y) {
            x++;
        }
        y++;
        System.out.println(x); //prints out 2
        System.out.println(y); //prints out 1
        if(x<=y) {
            x++;
        }
        y++;
        System.out.println(x); //prints out 2
        System.out.println(y); //prints out 2


    }
}
