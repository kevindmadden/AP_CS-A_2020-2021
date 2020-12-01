public class Scrap {
    public static void main(String args[]) {

    }

    public static int add(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    public static int subtract(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }

    public static int multiply(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }

    public static int divide(int num1, int num2) {
        if (num2 == 0) {
            return 666;
        } else {
            int result = num1 / num2;
            return result;
        }
    }
}
