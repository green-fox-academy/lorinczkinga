import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        String filename = "my-file.txt";
        System.out.println(countLines(filename));

    }
        public static int countLines(String filename) {

            try {
                Path path = Paths.get(filename);
                List<String> lines = Files.readAllLines(path);
                return lines.size();
            } catch (IOException e) {
                return 0;
            }
        }
}
