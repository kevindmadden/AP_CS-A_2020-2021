package Period1.u02_Conditionals;

public class s02_NestedIfElse {
    public static void main(String args[]){

        int x = 1;
        int y = 2;

        int radius = 20;
        int area = 40;

        if(x<y){
            //Do something
            if(area < radius){
                //Do something
            }else{
                //Do something else

            }
        }else{
            //Do Something else
        }

        int score=100;

        if(score>=90){
            //A
        }else{
            if(score>=80){
                //B
            }else{
                if(score>=70){
                    //C
                }else{
                    if(score>=60){
                        //D
                    }else{
                        //E
                    }
                }
            }
        }
        //Continue on with program






        if(score>=90){
            //A
        }else if(score>=80){
            //B
        }else if(score>=70){
            //C
        }else if(score>=60){
            //D
        }else{
            //F
        }


    }

}
