package Period1.u08_ClassesAndObjects.s02_PublicPrivate_AccessorMutator;

public class Accumulator {

    /*
    On the AP test, make ANY instance variables in your code private.
    Because sum is private in the Accumulator class, it means that sum can only be accessed
    when inside the accumulator class itself.*/
    private int sum;

    public Accumulator(int value){
        sum = value;
    }

    //"Getter" method (also called "Accessor" method)
    public int getSum(){
        return sum;
    }

    public void add(int value){
        sum = sum + value;
    }

}
