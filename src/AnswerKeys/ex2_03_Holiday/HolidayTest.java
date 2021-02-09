package AnswerKeys.ex2_03_Holiday;

public class HolidayTest {
    public static void main(String args[]){
        Holiday h1 = new Holiday("Independence Day", 4, "July");
        Holiday h2 = new Holiday("New Year's Day", 1, "January");
        Holiday h3 = new Holiday("Thanksgiving", 26, "November");
        Holiday h4 = new Holiday("Martin Luther King Jr. Day", 17, "January");
        Holiday[] holidays = {h1, h2, h3};
        System.out.println(h1.inSameMonth(h1,h2)); //expected: false
        System.out.println(h2.inSameMonth(h2,h4)); //expected: true
        System.out.println(h1.avgDate(holidays)); //expected: 10.3333...

    }
}
