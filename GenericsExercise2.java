public class GenericsExercise2 {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3, 4, 5};
        String[] array2 = {"Hello", "World", "Java"};

        printArray(array1);
        printArray(array2);
    }
}
