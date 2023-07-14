public class GenericsExercise3 {
    public static <T extends Comparable<T>> T getMax(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[] array1 = {3, 10, 7, 1, 8};
        String[] array2 = {"Apple", "Banana", "Orange"};

        System.out.println(getMax(array1));
        System.out.println(getMax(array2));
    }
}
