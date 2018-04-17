import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        Random rand = new Random();
        int  randomNumber = rand.nextInt(10) + 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write a number: ");

        int guess = scanner.nextInt();
        while (guess != randomNumber) {
            if (guess > randomNumber) {
                System.out.println("The stored number is lower");
            } else {
                System.out.println("The stored number is higher");
                }
            System.out.println("Please write a number: ");
            guess = scanner.nextInt();
            }
        System.out.println("You found the number: " + randomNumber);
        }
    }
