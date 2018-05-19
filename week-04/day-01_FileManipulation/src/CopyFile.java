import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {

    public static void main(String[] args) {
        CopyFile("my-file3.txt", "my-file4.txt");
    }

    public static void CopyFile(String sourcePath, String destinationPath) {
        Path sourcePathVariable = Paths.get(sourcePath);
        Path destinationPathVariable = Paths.get(destinationPath);

        try {
            List<String> myContent = new ArrayList<>(Files.readAllLines(sourcePathVariable));
            Files.write(destinationPathVariable, myContent);
        } catch (IOException e) {
            System.out.println("Unable to copy: " + sourcePath);
        }
    }
}
