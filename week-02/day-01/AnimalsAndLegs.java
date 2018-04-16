import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many chickens do you have?");
        int numberOfChickens = scanner.nextInt();

        System.out.println("How many pigs do you have?");
        int numberOfPigs = scanner.nextInt();
        int numberOfLegs = numberOfChickens*2 + numberOfPigs*4;
        System.out.println("Number of legs: " + numberOfLegs);
    }
}
