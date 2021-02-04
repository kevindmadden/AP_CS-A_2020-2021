package Period1.u08_ClassesAndObjects.s02_PublicPrivate_AccessorMutator;

public class Main {
    public static void main(String args[]){
        Accumulator acc1 = new Accumulator(12);

        /*Anti-Example-- don't do this!!
          Because sum is private in the Accumulator class, it means that sum can only be accessed
          when inside the accumulator class itself.*/
        //System.out.println(acc1.sum);

        System.out.println(acc1.getSum());
        acc1.add(8); //12+8 => 20
        System.out.println(acc1.getSum());
        acc1.add(15); //20+15 => 35
        System.out.println(acc1.getSum());

        Accumulator acc2 = new Accumulator(200);
        acc2.add(100); //200+100 => 300
        System.out.println(acc2.getSum());
    }
}