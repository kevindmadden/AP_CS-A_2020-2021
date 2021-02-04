package Period1.u08_ClassesAndObjects.s04_Counter_GasTankAnswer;

public class CounterTest {
    public static void main(String args[]){
        Counter counter = new Counter(7);
        counter.increment(); //7+1=8
        counter.increment(); //8+1=9
        counter.increment(); //9+1=10
        counter.increment(); //10+1=11
        counter.decrement(); //11-1=10
        System.out.println(counter.getValue());
        //Expected result: 10
        //Ran code and determined 10 was printed out as expected.
    }
}
