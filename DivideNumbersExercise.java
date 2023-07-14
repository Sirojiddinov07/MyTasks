public class DivideNumbersExercise {
    public static int divideNumbers(int dividend, int divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return dividend / divisor;
    }

    public static void main(String[] args) {
        try {
            int result = divideNumbers(10, 2);
            System.out.println(result);
            result = divideNumbers(10, 0);
            System.out.println(result); // Will not be executed
        } catch (ArithmeticException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}