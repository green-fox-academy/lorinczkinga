import java.util.ArrayList;
import java.util.Arrays;
import static java.lang.Integer.max;

public class Matchmaking {

    public static void main(String[] args) {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Bözsi", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Béla", "Todd", "Neef", "Jeff"));

        System.out.println(makingMatches(girls, boys));
    }
        public static ArrayList makingMatches(ArrayList girls, ArrayList boys) {
            ArrayList<String> girlsAndBoys = new ArrayList<>();
            for (int i = 0; i < max(girls.size(), boys.size()); i++) {
                if (i < girls.size()) {
                    girlsAndBoys.add(girls.get(i).toString());
                }
                if (i < boys.size()) {
                    girlsAndBoys.add(boys.get(i).toString());
                }
            }
            return girlsAndBoys;
        }
}
