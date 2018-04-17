public class DrawSquare {
    public static void main(String[] args) {
        int number = 6;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                if (i == 1 || i == number || j == 1 || j == number) {
                    System.out.print('%');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.print('\n');
        }
    }
}
