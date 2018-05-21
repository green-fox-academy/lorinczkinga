public class Anagram {

    public boolean anagramFunction(String word1, String word2) {
        boolean result;
        if (word1.length() == word2.length()) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < word1.length(); i++) {
                sb.append(word1.charAt(word1.length() - i - 1));
            }
            if (sb.toString().equals(word2)) {
                result = true;
            } else {
                result = false;
            }
        } else {
            result = false;
        }
        return result;
    }
}