import java.util.ArrayList;
import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of parameters: ");
        int NumberOfParameters = scanner.nextInt();
        int sum = 0;
        System.out.println("Please write the parameters: ");
        for (int i = 0; i < NumberOfParameters; i++) {
            int parameter = scanner.nextInt();
            sum = sum + parameter;
        }
        double average = sum/NumberOfParameters;
        System.out.println("Sum: " + sum + " , Average: " + average);
    }
}
