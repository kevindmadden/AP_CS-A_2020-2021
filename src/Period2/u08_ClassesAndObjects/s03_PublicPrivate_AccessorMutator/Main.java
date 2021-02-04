package Period2.u08_ClassesAndObjects.s03_PublicPrivate_AccessorMutator;

public class Main {
    public static void main(String args[]){

        Accumulator acc1 = new Accumulator(12);

        /*
        Anti-example: You cannot access acc1.sum because the variable sum is private!
         */
        //System.out.println(acc1.sum);

        System.out.println(acc1.getSum());
        acc1.add(8); //12+8 => 20
        System.out.println(acc1.getSum());
        acc1.add(15); //20+15 => 35
        System.out.println(acc1.getSum());

        Accumulator acc2 = new Accumulator(200);
        System.out.println(acc2.getSum());
        acc2.add(100); //200+100 => 300
        System.out.println(acc2.getSum());

        System.out.println("The value of acc1 stored in sum is the same:");
        System.out.println(acc1.getSum());

    }
}