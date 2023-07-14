public class ConvertToIntegerExercise {
    public static int convertToInteger(String input) throws NumberFormatException {
        return Integer.parseInt(input);
    }

    public static void main(String[] args) {
        try {
            String validInput = "123";
            int result = convertToInteger(validInput);
            System.out.println(result);

            String invalidInput = "abc";
            result = convertToInteger(invalidInput);
            System.out.println(result); // Will not be executed
        } catch (NumberFormatException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}