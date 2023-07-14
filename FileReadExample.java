import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class FileReadExample {
    public static void main(String[] args) {
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
