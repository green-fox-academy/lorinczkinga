import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Doubled {
    public static void main(String[] args) {
        decryptDuplicatedChars("duplicated-chars.txt");
    }

    private static List<String> decryptDuplicatedChars(String filePath) {
        Path path = Paths.get(filePath);
        List<String> decryptedText = new ArrayList<>();
        try {
            List<String> originalText = new ArrayList<>(Files.readAllLines(path));

            for (int i = 0; i < originalText.size(); i++) {
                decryptedText.add(i, "");
                for (int j = 0; j < originalText.get(i).length(); j++) {
                    if (j % 2 == 0) {
                        decryptedText.set(i, decryptedText.get(i).concat("" + originalText.get(i).charAt(j)));
                    }
                }
            }
            Path decryptedPath = Paths.get("decryptedText.txt");
            Files.write(decryptedPath, decryptedText);
            return decryptedText;

        } catch (IOException e) {
            System.out.println("Could not read the file");
            return decryptedText;
        }
    }
}
