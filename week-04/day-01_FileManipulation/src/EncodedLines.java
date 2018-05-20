import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EncodedLines {

    public static void main(String[] args) {
        decryptEncodedLines("encoded-lines.txt");
    }

    private static List<String> decryptEncodedLines(String filePath) {
        Path path = Paths.get(filePath);
        List<String[]> splittedText = new ArrayList<>();
        List<String> decryptedText = new ArrayList<>();
        try {
            List<String> originalText = new ArrayList<>(Files.readAllLines(path));
            for (int i = 1; i < originalText.size() - 1; i++) {
                splittedText.add(i - 1, originalText.get(i - 1).split(""));
                decryptedText.add(i - 1, "");
                if (splittedText.get(i - 1)[0].equals("")) { } else {
                    for (int j = 0; j < originalText.get(i - 1).length(); j++) {
                        if (splittedText.get(i - 1)[j].charAt(0) == ' ') {
                            decryptedText.set(i - 1, decryptedText.get(i - 1).concat(" "));
                        } else {
                            int temp = (int) splittedText.get(i-1)[j].charAt(0);
                            temp--;
                            decryptedText.set(i - 1, decryptedText.get(i - 1).concat("" + (char) temp));
                        }
                    }
                }
                System.out.println(decryptedText.get(i - 1));
            }
            return decryptedText;
        } catch (IOException e) {
            System.out.println("Could not read the file");
            return decryptedText;
        }
    }
}
