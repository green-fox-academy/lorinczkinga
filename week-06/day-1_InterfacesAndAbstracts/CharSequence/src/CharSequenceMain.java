public class CharSequenceMain {
    public static void main(String[] args) {
        Gnirts g = new Gnirts("example");
        System.out.println(g.charAt(1));
        System.out.println(g.subSequence(3,6));

        Shifter s = new Shifter("example", 2);
        System.out.println(s.charAt(0));
        System.out.println(s.subSequence(0, 4));
    }
}
