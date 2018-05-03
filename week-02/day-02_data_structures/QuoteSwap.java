import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class QuoteSwap {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

        // Accidentally I messed up this quote from Richard Feynman.
        // Two words are out of place
        // Your task is to fix it by swapping the right words with code
        // Create a method called quoteSwap().

        // Also, print the sentence to the output with spaces in between.
        for (int i = 0; i < quoteSwap(list).size(); i++) {

            if (i == (quoteSwap(list).size()-1)) {
                System.out.print(quoteSwap(list).get(i));
            }
            System.out.print(quoteSwap(list).get(i) + " " );
        }

        // Expected output: "What I cannot create I do not understand."
    }
    public static ArrayList quoteSwap(ArrayList list) {
        Collections.swap(list, 2, 5);
        return list;
    }

}
