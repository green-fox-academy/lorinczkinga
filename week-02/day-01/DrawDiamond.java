public class DrawDiamond {
    public static void main(String[] args) {
        int number = 7;
        for (int i = 1; i <= (number-3); i++) {
            for (int j = 1; j <= (2*(number-3)-1); j++) {
                if (j > (number-3 - i) && j < (number-3 + i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print('\n');
        }
        for (int i = 1; i <= (number-4); i++) {
            for (int j = 1; j <= (2*(number-3)-1); j++) {
                if (j > i && j < (2*(number-3) - i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print('\n');
        }
    }
}
