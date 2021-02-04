package Period1.u08_ClassesAndObjects.s01_ClassExamples;

public class DuckObjects {
    public static void main(String args[]){

        //Where we've seen "new" before (when declaring arrays, Scanner)

        Duck daffy = new Duck();
        //^ data type      ^call to constructor

        Duck donald = new Duck();

        daffy.honk();
        daffy.honk();
        daffy.printNumOfTimesHonked();

        donald.honk();
        donald.printNumOfTimesHonked();

        //TODO: Public vs Private

    }
}
