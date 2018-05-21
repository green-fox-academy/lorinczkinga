import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercise9 {
    public static void main(String[] args) {

        char[] somethingCharArray = {'I', 't', '\'','s',' ','d','o', 'n', 'e', '.'};
        String convertedToString = IntStream
                .range(0, somethingCharArray.length)
                .mapToObj(i -> "" + somethingCharArray[i])
                .collect(Collectors.joining());

        System.out.println(convertedToString);
    }
}
