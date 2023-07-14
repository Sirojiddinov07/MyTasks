import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the index number: ");
        int index = scanner.nextInt();

        int [] array = {1,2,3,4,5,6,7};
        try {
            int element = array[index];
            System.out.println(element);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.fillInStackTrace());
        }

    }
}