import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WorkFile {
    public static void main(String[] args) {

            try (FileInputStream input = new FileInputStream("input.txt");
                 FileOutputStream output = new FileOutputStream("output.txt")) {

                int val;
                while ((val = input.read()) != -1) {
                    output.write(val);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
