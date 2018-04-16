import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println(a);
        } else if (a == b) {
            System.out.println("The numbers are equal.");
        } else {
            System.out.println(b);
        }
    }
}
