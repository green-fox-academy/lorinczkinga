public class BattleApp {
    public static void main(String[] args) {
        PirateShip ship1 = new PirateShip();
        ship1.fillShip();
        ship1.shipInformation();

        PirateShip ship2 = new PirateShip();
        ship2.fillShip();
        ship2.shipInformation();

        ship1.battle(ship2);

        ship1.shipInformation();
        ship2.shipInformation();
    }
}
