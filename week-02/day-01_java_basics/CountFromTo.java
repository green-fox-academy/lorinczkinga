import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write 2 numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println("The second number should be bigger");
        } else {
            for (int i = a; i < b; i++){
                System.out.println(i);
            }
        }






    }
}
