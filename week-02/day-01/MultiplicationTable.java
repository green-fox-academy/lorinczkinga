import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write a number: ");
        int number = scanner.nextInt();
        for (int i = 1; i < 11 ; i++) {
            int solution = number * i;
            System.out.println(i + " * " + number + " = " + solution);
        }
    }
}
