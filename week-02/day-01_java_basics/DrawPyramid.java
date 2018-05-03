public class DrawPyramid {
    public static void main(String[] args) {
        int number = 14;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= (2*number-1); j++) {
                if (j > (number - i) && j < (number + i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print('\n');
        }
    }
}