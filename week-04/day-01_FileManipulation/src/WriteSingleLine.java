import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WriteSingleLine {
    public static void main(String[] args) {

        List<String> myContent = new ArrayList<>(Arrays.asList("This is my single line."));
        Path path = Paths.get("my-file2.txt");
         try {
             Files.write(path, myContent);
         } catch (IOException e) {
             System.out.println("Unable to write file: my-file2.txt");
         }

    }
}
