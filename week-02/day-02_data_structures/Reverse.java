public class Reverse {
    public static void main(String[] args) {

        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        System.out.println(reverse(reversed));

    }

    public static String reverse(String reversed) {
        String normal = "";
        for (int i = 0; i < reversed.length(); i++) {

            normal = normal + reversed.charAt(reversed.length()-1-i);
        }
        return normal;
    }


}
