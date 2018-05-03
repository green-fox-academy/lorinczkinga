public class TakesLonger {
    public static void main(String[] args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        quote = new StringBuilder(quote).insert(quote.indexOf('y'), "always takes longer than ").toString();
        System.out.println(quote);
    }
}
