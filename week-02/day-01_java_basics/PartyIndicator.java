import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write the number of girls: ");
        int numberOfGirls = scanner.nextInt();
        System.out.println("Please write the number of boys: ");
        int numberOfBoys = scanner.nextInt();

        if (numberOfBoys + numberOfGirls > 20) {
            if (numberOfGirls == numberOfBoys) {
                System.out.println("The party is exellent!");
            } else if (numberOfGirls == 0) {
                System.out.println("Sausage party");
            } else {
                System.out.println("Quite cool party!");
            }
        } else {
            System.out.println("Average party...");
        }
    }
}
