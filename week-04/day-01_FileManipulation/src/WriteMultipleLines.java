import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {
    public static void main(String[] args) {
        WriteMultipleLines("my-file3.txt", "WriteMultipleLineTask", 10);
    }

    public static void WriteMultipleLines(String path, String lineContent, int numberOfLines) {
        List<String> myContent = new ArrayList<>();
        for (int i = 0; i < numberOfLines; i++) {
            myContent.add(lineContent);
        }
        Path pathVariable = Paths.get(path);
        try {
            Files.write(pathVariable, myContent);
        } catch (IOException e) {
            System.out.println("Unable to write file: my-file3.txt");
        }
    }
}
