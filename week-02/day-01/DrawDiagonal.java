public class DrawDiagonal {
    public static void main(String[] args) {
        int number = 7;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                if (i == 1 || i == number || i ==j || j == 1 || j == number) {
                    System.out.print('%');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.print('\n');
        }
    }
}
