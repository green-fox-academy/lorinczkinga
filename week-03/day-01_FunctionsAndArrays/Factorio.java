public class Factorio {
    public static void main(String[] args) {
        int number = 5;
        System.out.println(Factorio(number));
    }
    public static int Factorio(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
