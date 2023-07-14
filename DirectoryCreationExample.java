import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryCreationExample {
    public static void main(String[] args) {
        try {
            Path directoryPath = Paths.get("C:\\Users\\user\\Desktop\\EpamJavaCourse\\myInput.txt");
            Files.createDirectory(directoryPath);
            System.out.println("Directory created successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
