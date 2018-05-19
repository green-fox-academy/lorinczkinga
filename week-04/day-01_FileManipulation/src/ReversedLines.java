import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {

    public static void main(String[] args) {
        decryptReversedLines("reversed-lines.txt");
    }

    private static List<String> decryptReversedLines(String filePath) {
        Path path = Paths.get(filePath);
        List<String> decryptedText = new ArrayList<>();
        try {
            List<String> originalText = new ArrayList<>(Files.readAllLines(path));

            for (int i = 0; i < originalText.size(); i++) {
                decryptedText.add(i, "");
                for (int j = 1; j < originalText.get(i).length()+1; j++) {
                    decryptedText.set(i, decryptedText.get(i)
                            .concat("" + originalText.get(i).charAt(originalText.get(i).length() - j)));
                }
            }
            Path decryptedPath = Paths.get("decryptedReversedLines.txt");
            Files.write(decryptedPath, decryptedText);
            return decryptedText;

        } catch (IOException e) {
            System.out.println("Could not read the file");
            return decryptedText;
        }
    }
}