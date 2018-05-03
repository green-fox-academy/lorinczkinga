import java.util.Scanner;

import static java.lang.Math.pow;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write a number: ");
        int number = scanner.nextInt();
        int lengthOfNumber = String.valueOf(number).length();

        double sum = 0;
        for (int i = 0; i < lengthOfNumber; i++) {
            double doubleValue = Double.parseDouble(String.valueOf(String.valueOf(number).charAt(i)));
            sum = sum + pow(doubleValue, lengthOfNumber);
        }
        if (sum == number) {
            System.out.println("The " + number + " is an Armstrong number.");
        } else {
            System.out.println("The " + number + " isn't an Armstrong number.");
        }
    }
}
