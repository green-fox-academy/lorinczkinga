public class Exercise5 {
    public static void main(String[] args) {
        String somethingString = "sdfFGjtSjN";

        somethingString.chars()
               .filter(c -> c > 64 && c < 91)
                .mapToObj(c -> Character.toString((char) c))
                        .forEach(System.out::println);

    }
}
