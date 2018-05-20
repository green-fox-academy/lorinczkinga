import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Lottery {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findMostCommonLotteryNumbers("lottery.txt")));
    }

    private static int[] findMostCommonLotteryNumbers(String filePath) {
        Path path = Paths.get(filePath);
        List<String[]> decryptedText = new ArrayList<>();
        int[] mostCommonNumbers= new int[5];
        try {
            List<String> originalText = new ArrayList<>(Files.readAllLines(path));

            for (int i = 1; i < originalText.size() + 1; i++) {
                String yourString = originalText.get(i - 1);
                decryptedText.add(i - 1, yourString.split("[\\;]"));
                System.out.println(Arrays.asList(decryptedText.get(i-1)));
            }

            HashMap<String, Integer> frequencyOfNumbers = new HashMap<>();
            for (int i = 1; i < 6; i++) {
                for (int j = 0; j < originalText.size(); j++) {
                    if (frequencyOfNumbers.containsKey(decryptedText.get(j)[decryptedText.get(j).length - i])) {
                        Integer increase = frequencyOfNumbers.get(decryptedText.get(j)[decryptedText.get(j).length - i]) + 1;
                        frequencyOfNumbers.replace(decryptedText.get(j)[decryptedText.get(j).length - i], increase);
                    } else {
                        frequencyOfNumbers.put(decryptedText.get(j)[decryptedText.get(j).length - i], 1);
                    }
                }
            }

            List<Map.Entry<String, Integer>> frequencyMapEntry = new LinkedList<>(frequencyOfNumbers.entrySet());
            Collections.sort(frequencyMapEntry, new Comparator<>() {
                public int compare(Map.Entry<String, Integer> o1,
                                   Map.Entry<String, Integer> o2) {
                    return o2.getValue().compareTo(o1.getValue());
                }
            });

            for (int i = 0; i < 5; i++) {
                mostCommonNumbers[i] = Integer.parseInt(frequencyMapEntry.get(i).getKey());
            }
        } catch (IOException e) {
            System.out.println("Could not read the file");
        }
        return mostCommonNumbers;
    }
}