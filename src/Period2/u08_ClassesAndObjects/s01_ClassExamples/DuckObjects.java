package Period2.u08_ClassesAndObjects.s01_ClassExamples;

public class DuckObjects {
    public static void main(String args[]){

        //Where else have we seen the keyword "new"? Arrays, Scanner
        Duck daffy = new Duck();
        //^^ variable type   ^^constructor call
        daffy.honk();
        daffy.honk();
        daffy.honk();
        daffy.printNumOfTimesHonked();

        Duck donald = new Duck();
        donald.honk();
        donald.printNumOfTimesHonked();

        //TODO: Public vs Private

    }
}
