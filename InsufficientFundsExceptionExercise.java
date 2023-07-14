public class InsufficientFundsExceptionExercise {
    public static class InvalidInputException extends Exception {
        public InvalidInputException(String message) {
            super(message);
        }
    }

    public static void validateInput(String input) throws InvalidInputException {
        if (input == null || input.isEmpty()) {
            throw new InvalidInputException("Input is invalid");
        }
        // Perform the validation
    }

    public static void main(String[] args) {
        try {
            String validInput = "Hello";
            validateInput(validInput);
            System.out.println("Validation successful");

            String invalidInput = null;
            validateInput(invalidInput); // Will throw InvalidInputException
            System.out.println("Validation successful"); // Will not be executed
        }
        catch (InvalidInputException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}