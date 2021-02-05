package AnswerKeys.ex2_01_Counter;

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
