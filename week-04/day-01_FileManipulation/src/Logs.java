import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Logs {

    public static void main(String[] args) {
        System.out.println(Arrays.asList(getIPAddresses("log.txt")));
        System.out.println(getGetPostRation("log.txt"));
    }

    private static float getGetPostRation(String filePath) {
        Path path = Paths.get(filePath);
        float getPostRatio;
        try {
            List<String> fileContent = new ArrayList<>(Files.readAllLines(path));
            int getCounter = 0;
            int postCounter = 0;
            for (int i = 0; i <fileContent.size(); i++) {
                if (fileContent.get(i).substring(41, 45).equals("POST")) {
                   postCounter++;
                } else {
                    getCounter++;
                }
            }
            getPostRatio = (float) getCounter / postCounter;
            return getPostRatio;
        } catch (IOException e) {
            System.out.println("Could not read the file");
            return 0;
        }
    }

    private static String[] getIPAddresses(String filePath) {

        Path path = Paths.get(filePath);
        try {
            List<String> fileContent = new ArrayList<>(Files.readAllLines(path));
            String[] IPAddresses = new String[fileContent.size()];
            for (int i = 0; i <fileContent.size(); i++) {
                IPAddresses[i] = fileContent.get(i).substring(27, 38);
            }
            return IPAddresses;
        } catch (IOException e) {
            System.out.println("Could not read the file");
            String[] IPAddresses = new String[1];
            return IPAddresses;
        }
    }
}
