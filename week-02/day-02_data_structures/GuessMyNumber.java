import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the minimum and the maximum value of choosing the number: ");
        int min = scanner.nextInt();
        int max = scanner.nextInt();

        Random rand = new Random();
        int randomNumber = rand.nextInt(max - min) + min;
        int numberOfLives = 5;

        System.out.println("I've a number between " + min + "-" + max + ". You have " + numberOfLives + " lives to guess.");
        int guess = scanner.nextInt();


        for (int i = 0; i < numberOfLives+1; i++) {

            if (guess == randomNumber) {
                System.out.println("You found the number: " + randomNumber);
                break;
            } else
                numberOfLives--;
                if (guess > randomNumber) {
                System.out.println("Too high, you have " + numberOfLives + " lives left.");
            } else {
                System.out.println("Too low, you have " + numberOfLives + " lives left.");
            }

            if (numberOfLives == 0) {
                System.out.println("Game over.");
                break;
            } else {
                System.out.println("Please write a number: ");
                guess = scanner.nextInt();
            }
        }
    }
}
