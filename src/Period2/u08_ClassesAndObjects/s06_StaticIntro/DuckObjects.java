package Period2.u08_ClassesAndObjects.s06_StaticIntro;

public class DuckObjects {
    public static void main(String args[]){

        //Where else have we seen the keyword "new"? Arrays, Scanner
        Duck daffy = new Duck();
        //^^ variable type   ^^constructor call
        daffy.honk();
        daffy.honk();
        daffy.honk();
        daffy.printNumOfTimesHonked();

        System.out.println("Number of Ducks created:");
        System.out.println(Duck.getNumOfDucksCreated());

        Duck donald = new Duck();
        donald.honk();
        donald.printNumOfTimesHonked();

        System.out.println("Number of Ducks created:");
        System.out.println(Duck.getNumOfDucksCreated());

        Duck duck1 = new Duck();
        System.out.println("Number of Ducks created:");
        System.out.println(Duck.getNumOfDucksCreated());

        duck1.killedByCar();


        daffy.getNumOfTimesHonked();
        daffy.setNumOfTimesHonked(99);

        Duck.getNumOfDucksCreated();



        //TODO: Public vs Private

    }
}
