package AnswerKeys.ex2_02_GasTank;

public class GasTankTest {
    public static void main(String args[]){
        GasTank tank = new GasTank(10);
        tank.getGasValue(); //0 (expected)
        tank.addGas(5);
        tank.getGasValue(); //5 (expected)
        System.out.println(tank.isEmpty()); //false
        System.out.println(tank.isFull()); //false
        tank.addGas(20);
        tank.getGasValue(); //10
        tank.useGas(0.05);
        System.out.println(tank.isEmpty()); //false
        System.out.println(tank.isFull()); //true
        tank.useGas(20);
        tank.getGasValue(); //0
        tank.addGas(0.05);
        System.out.println(tank.isEmpty()); //true
        System.out.println(tank.isFull()); //false
        tank.fillUp();
        tank.getGasValue(); //10
    }

}
