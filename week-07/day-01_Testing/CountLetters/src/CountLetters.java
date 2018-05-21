import java.util.HashMap;

public class CountLetters {

    public HashMap countLetters(String string) {
        HashMap<Character, Integer> frequencyOfCharacters = new HashMap<>();
        for (int i = 0; i < string.length() ; i++) {
            if (frequencyOfCharacters.containsKey(string.charAt(i))) {
                frequencyOfCharacters.replace(string.charAt(i), frequencyOfCharacters.get(string.charAt(i)) + 1);
            } else {
                frequencyOfCharacters.put(string.charAt(i), 1);
            }
        }
        return frequencyOfCharacters;
    }
}
