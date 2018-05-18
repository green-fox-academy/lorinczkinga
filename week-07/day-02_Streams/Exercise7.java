public class Exercise7 {

    public static void main(String[] args) {
        String somethingString = "sssFGjtSjN";
                somethingString.chars()
                        .map(x -> ((int)somethingString.chars().filter(c -> (char) c == (char) x).count()))
                        .forEach(System.out::println);
    }
}
