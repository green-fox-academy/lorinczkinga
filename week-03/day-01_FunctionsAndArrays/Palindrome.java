public class Palindrome {
    public static void main(String[] args) {

        String wordOrSomething= "greenfox";

        System.out.println(palindrome(wordOrSomething));
    }

    public static String palindrome(String wordOrSomething) {
        String newWord = wordOrSomething;
        for (int i = 0; i < wordOrSomething.length(); i++) {
        newWord = newWord + wordOrSomething.charAt(wordOrSomething.length()-i-1);
        }
        return newWord;
    }
}
