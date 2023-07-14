import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.List;

public class FileCopyExample {
    public static void main(String[] args) {
        try {
            Path sourcePath = Paths.get("C:\\Users\\user\\Desktop\\EpamJavaCourse\\input.txt");
            Path destinationPath = Paths.get("C:\\Users\\user\\Desktop\\EpamJavaCourse\\output.txt");
            Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Path filePath = Paths.get("C:\\Users\\user\\Desktop\\EpamJavaCourse\\output.txt");
            List<String> lines = Files.readAllLines(filePath, StandardCharsets.UTF_8);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

