import java.util.ArrayList;
import java.util.Arrays;

public class ElementFinder {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(containsSeven2(arrayList));
        // Write a method that checks if the arrayList contains "7" if it contains return "Hoorray" otherwise return "Noooooo"
        // The output should be: "Noooooo"
        // Do this again with a different solution using different list methods!
    }


    public static String containsSeven(ArrayList arrayList) {
        String answer = "";
        if (arrayList.contains(7)) {
            answer = "Hoorray";
        } else {
            answer = "Noooooo";
            }
            return answer;
        }
    public static String containsSeven2(ArrayList arrayList) {
        String answer = "";
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).equals(7)) {
                answer = "Hoorray";
            } else {
                answer = "Noooooo";
            }
        }
        return answer;
    }
}
