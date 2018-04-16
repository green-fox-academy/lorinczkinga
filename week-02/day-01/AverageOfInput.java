import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write 5 numbers in a row");
        double sum = 0;
        for ( int i = 1; i < 6; i++) {
            double number = scanner.nextDouble();
            sum = sum + number;
        }
        double average = sum/5;

        System.out.println("Sum: " + sum + ", Average: " + average);
    }
}
