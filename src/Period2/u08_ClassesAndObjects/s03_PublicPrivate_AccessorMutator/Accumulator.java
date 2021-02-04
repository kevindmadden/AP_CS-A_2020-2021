package Period2.u08_ClassesAndObjects.s03_PublicPrivate_AccessorMutator;

public class Accumulator {

    //On the AP test, any instance variables you write as part of your code, should
    // ALWAYS be private.
    private int sum;

    public Accumulator(int value){
        sum = value;
    }

    //"Getter" methods (you'll also hear "Accessor" methods)
    public int getSum(){
        return sum;
    }

    public void add(int value){
        sum = sum + value;
    }

}
