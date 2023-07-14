public class GenericsExercise {
    public static <T> boolean compareTwoElements(T element1, T element2) {
        return element1.equals(element2);
    }

    public static void main(String[] args) {
        // Testing the method with different types
        System.out.println(compareTwoElements(5, 5));
        System.out.println(compareTwoElements(3.14, 3.18));
        System.out.println(compareTwoElements("Hello", "Hello"));
    }
}
