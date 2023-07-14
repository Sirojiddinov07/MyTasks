
public class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    public static void main(String[] args) {
        // Creating instances of Pair
        Pair<Integer, String> pair1 = new Pair<>(10, "John");
        Pair<String, Double> pair2 = new Pair<>("Apple", 3.14);

        // Accessing and modifying the elements of Pair
        System.out.println(pair1.getFirst() + " " + pair1.getSecond());
        System.out.println(pair2.getFirst() + " " + pair2.getSecond());

        pair1.setSecond("Doe");
        pair2.setFirst("Banana");

        System.out.println(pair1.getFirst() + " " + pair1.getSecond());
        System.out.println(pair2.getFirst() + " " + pair2.getSecond());
    }
}

