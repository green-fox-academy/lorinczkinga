import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a distance in km as an integer:");

        int distanceKm = scanner.nextInt();
        double distanceMiles = distanceKm/1.609;
        System.out.println("Distance in Miles: " + distanceMiles);
    }
}
