package Period1.u08_ClassesAndObjects.s04_Counter_GasTankAnswer;

public class Counter {
    private int counter;

    public Counter(int value){
        counter = value;
    }

    public void increment(){
        counter++;
    }

    public void decrement(){
        counter--;
    }

    public int getValue(){
        return counter;
    }

}
