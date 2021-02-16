package Period1.u08_ClassesAndObjects.s05_StaticIntro;

public class DuckObjects {
    public static void main(String args[]){

        //Where we've seen "new" before (when declaring arrays, Scanner)

        System.out.println("Total Number of Ducks:");
        System.out.println(Duck.getNumOfDucksCreated());

        Duck daffy = new Duck();
        //^ data type      ^call to constructor

        Duck donald = new Duck();

        daffy.honk();
        daffy.honk();
        daffy.printNumOfTimesHonked();

        donald.honk();
        donald.printNumOfTimesHonked();

        System.out.println("Total Number of Ducks:");
        System.out.println(Duck.getNumOfDucksCreated());

        Duck duck1 = new Duck();

        System.out.println("Total Number of Ducks:");
        System.out.println(Duck.getNumOfDucksCreated());

        duck1.killedByCar();

        System.out.println("Total Number of Ducks:");
        System.out.println(Duck.getNumOfDucksCreated());

        //TODO: Public vs Private

    }
}
