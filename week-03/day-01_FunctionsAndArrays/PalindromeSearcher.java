import java.util.ArrayList;

public class PalindromeSearcher {
    public static void main(String[] args) {

        String wordOrSomething= "dog goat dad duck doodle never";
        System.out.println(palindromeSearcher(wordOrSomething));
    }

    public static ArrayList<String> palindromeSearcher(String wordOrSomething) {
        ArrayList<String> answer = new ArrayList<>();
        for (int i = 1; i < wordOrSomething.length()-1; i++) {
            if (wordOrSomething.charAt(i+1) == wordOrSomething.charAt(i-1)) {
                StringBuilder sb = new StringBuilder();
                String rootWord = sb.append(wordOrSomething.charAt(i-1)).append(wordOrSomething.charAt(i)).append(wordOrSomething.charAt(i+1)).toString();
                answer.add(answer.size(), rootWord);
                        int count = 2;
                            while ((wordOrSomething.charAt(i+count) == wordOrSomething.charAt(i-count))) {
                                sb.setLength(0);
                                rootWord = sb.append(wordOrSomething.charAt(i - count)).append(rootWord).append(wordOrSomething.charAt(i + count)).toString();
                                answer.add(answer.size(), rootWord);
                                count++;
                                if (((i+count) > wordOrSomething.length()) || ((i-count) < 0)) {
                                    break;
                                }
                            }
            }
            if (wordOrSomething.charAt(i) == wordOrSomething.charAt(i+1)) {
                StringBuilder sb = new StringBuilder();
                String rootWord = sb.append(wordOrSomething.charAt(i)).append(wordOrSomething.charAt(i+1)).toString();
                int count = 1;
                    while (wordOrSomething.charAt(i+1+count) == wordOrSomething.charAt(i-count)) {
                        sb.setLength(0);
                    rootWord = sb.append(wordOrSomething.charAt(i - count)).append(rootWord).append(wordOrSomething.charAt(i + 1 + count)).toString();
                    answer.add(answer.size(), rootWord);
                    count++;
                        if ((((i+count) > wordOrSomething.length()) || ((i-count) < 0))) {
                        break;
                        }
                }
            }
        }
        return answer;
    }
}
