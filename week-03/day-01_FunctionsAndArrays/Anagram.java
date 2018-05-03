import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {

        String firstWord = "DOG";
        String secondWord = "God";

        System.out.println(Anagram(firstWord, secondWord));
    }

        public static boolean Anagram(String firstWord, String secondWord) {
            firstWord = firstWord.toLowerCase();
            secondWord = secondWord.toLowerCase();
            boolean answer = false;
            boolean success = true;
            while (success) {
                success = false;
                for (int j = 0; j < secondWord.length(); j++) {

                    if (firstWord.charAt(0) == secondWord.charAt(j)) {
                        StringBuilder sb1 = new StringBuilder(firstWord);
                        sb1.deleteCharAt(0);
                        firstWord = sb1.toString();
                        StringBuilder sb2 = new StringBuilder(secondWord);
                        sb2.deleteCharAt(j);
                        secondWord = sb2.toString();
                        success = true;
                        break;
                    }
                }
            }
            if ((firstWord.length() == 0) && (secondWord.length() == 0)) {
                System.out.println("These words are anagrams.");
                answer = true;
            } else {
                System.out.println("These words aren't anagrams.");
            }
            return answer;
        }
}
