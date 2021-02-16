package Period2.u08_ClassesAndObjects.s05_OtherUsesOfThis;

public class HolidayTest {
    public static void main(String args[]){
        Holiday independence = new Holiday("Independence Day", 4, "July");
        Holiday newYears = new Holiday("New Year's Day", 1, "January");
        Holiday thanksgiving = new Holiday("thanksgiving", 26, "November");
        Holiday mlkjDay = new Holiday("Martin Luther King Jr. Day", 17, "January");
        Holiday[] holidays = {independence, newYears, thanksgiving};

        /*
        Notice the repetition in the below two print statements.
            Is there a way to eliminate this repetition???
         */

        System.out.println(independence.inSameMonth(independence,newYears)); //expected: false
        //independence repeated      ^^here         ^^AND here
        System.out.println(newYears.inSameMonth(newYears,mlkjDay)); //expected: true
        //newYears repeated      ^^here         ^^AND here

        /*
            Yes, there is. We can create a new method called inSameMonth
            that requires only a single parameter.

            (The keyword "this" is they key to eliminating the unnecessary repetition.)
         */

        System.out.println(independence.inSameMonth(newYears));
        //                    ^^^this (so when we call the method, "this" has a value of independence)

        System.out.println(newYears.inSameMonth(mlkjDay)); //expected: true
        //                    ^^^this (so when we call the method, "this" has a value of newYears)


    }
}
