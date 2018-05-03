public class Sum {
    public static void main(String[] args) {

        int lastNumber = 5;
        System.out.println(sum(lastNumber));
    }
    public static int sum(int lastNumber) {
        int sum = 0;
        for (int i = 1; i <= lastNumber; i++) {
            sum += i;
        }
        return sum;
    }
}
