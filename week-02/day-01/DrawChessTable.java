public class DrawChessTable {
    public static void main(String[] args) {
        int number = 8;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                if (((i % 2 == 0) && (j % 2 == 0)) || ((i % 2 != 0) && (j % 2 != 0))) {
                    System.out.print('%');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.print('\n');
        }
    }
}
