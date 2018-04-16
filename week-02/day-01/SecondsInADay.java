public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int remainingHours = 24 - currentHours + 1;
        int remainingMinutes = 60 - currentMinutes + 1;
        int remainingSeconds = 60 - currentSeconds;
        int sumRemainingSeconds=remainingHours*60*60+remainingMinutes*60+remainingSeconds;
        System.out.println(sumRemainingSeconds);
    }
}
