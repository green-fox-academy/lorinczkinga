import java.util.Arrays;

public class DiagonalMatrix {
    public static void main(String[] args) {

        int size = 10;
        int[][] DiagonalMatrix = new int[size][size];

        for (int i = 0; i < 10; i++) {
            DiagonalMatrix[i][i] = 1;
            for (int j : DiagonalMatrix[i]) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
