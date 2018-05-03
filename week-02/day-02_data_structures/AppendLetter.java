import java.util.Arrays;
import java.util.List;

public class AppendLetter {
    public static void main(String[] args) {
        List<String> far = Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk");
        System.out.println(appendA(far));

    }

    public static List  appendA(List far) {

        for (int i = 0; i < far.size(); i++) {
            far.set(i, far.get(i).toString().concat("a"));
        }
        return far;

    }
}
