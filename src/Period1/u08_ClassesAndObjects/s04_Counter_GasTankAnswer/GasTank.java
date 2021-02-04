package Period1.u08_ClassesAndObjects.s04_Counter_GasTankAnswer;

public class GasTank {
    private double amount = 0;
    private double capacity;

    public GasTank(double value){
        capacity = value;
    }

    public void addGas(double value){
        if(amount+value > capacity){
            amount = capacity;
        }else{
            amount = amount + value; //or: amount += value;
        }
    }

    public void useGas(double value){
        if(amount-value<0){
            amount = 0;
        }else{
            amount = amount - value; //or: amount -=value
        }
    }

    public boolean isEmpty(){
        if(amount < 0.1){
            return true;
        }else{
            return false; //you don't have to have the else statement; you could alternatively just have the return statement at the end similar to isFull()
        }
    }

    public boolean isFull(){
        if(amount > capacity-0.1){
            return true;
        }
        return false; //you could alternatively have this in an else statement similar to isEmpty
    }

    public double getGasValue(){
        System.out.println(amount); //this is here to make debugging easier so that I don't have to write a brand new print statement whenever I want to check the amount value
        return amount;
    }

    public double fillUp(){
        double difference = capacity - amount;
        amount = capacity;
        return difference;
    }

}
