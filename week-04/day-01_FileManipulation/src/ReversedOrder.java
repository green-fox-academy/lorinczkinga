import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {

    public static void main(String[] args) {
        decryptReversedOrder("reversed-order.txt");
    }

    private static List<String> decryptReversedOrder(String filePath) {
        Path path = Paths.get(filePath);
        List<String> decryptedText = new ArrayList<>();
        try {
            List<String> originalText = new ArrayList<>(Files.readAllLines(path));

            for (int i = 1; i < originalText.size()+1 ; i++) {
                decryptedText.add(i-1, originalText.get(originalText.size()-i));
                System.out.println(decryptedText.get(i-1));
            }
            return decryptedText;
        } catch (IOException e) {
            System.out.println("Could not read the file");
            return decryptedText;
        }
    }
}
