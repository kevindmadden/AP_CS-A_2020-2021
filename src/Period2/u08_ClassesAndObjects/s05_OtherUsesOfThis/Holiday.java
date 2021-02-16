package Period2.u08_ClassesAndObjects.s05_OtherUsesOfThis;

public class Holiday {

    private String name;
    private int day;
    private String month;

    public Holiday(String name, int day, String month){
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public boolean inSameMonth(Holiday h1, Holiday h2){
        if(h1.month.equals(h2.month)){
            return true;
        }else{
            return false;
        }
    }

    public boolean inSameMonth(Holiday h2){
        // So the keyword "this" refers to a reference of the object the method is being called on.
        if(this.month.equals(h2.month)){
            return true;
        }else{
            return false;
        }
    }



    public double avgDate(Holiday[] holidays){
        double total = 0;
        for(Holiday holiday : holidays){
            total+=holiday.day; //equivalent to total = total + holiday.day
        }
        /*
        - - -
        The for-each loop above is equivalent to the below normal for-loop
        - - -
        for(int i=0; i<holidays.length; i++){
            total+=holidays[i];
        }
         */
        return (total/holidays.length);
    }

}
