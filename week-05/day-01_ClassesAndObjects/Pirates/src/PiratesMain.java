public class PiratesMain {
    public static void main(String[] args) {

        Pirate pirate = new Pirate();
        Pirate pirate2 = new Pirate();

        for (int i = 0; i < 4; i++) {
            pirate.drinkSomeRum();
        }

        pirate.brawl(pirate2);
        pirate.howsItGoingMate();

    }
}
