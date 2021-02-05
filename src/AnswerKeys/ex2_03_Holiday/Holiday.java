package AnswerKeys.ex2_03_Holiday;

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
