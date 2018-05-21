import java.util.ArrayList;
import java.util.List;

public class PrintableMain {
    public static void main(String[] args) {

        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(2,3));
        for (Domino d : dominoes) {
            d.printAllFields();
        }

        Fleet fleet = new Fleet();
        Thing GetMilk = new Thing("Get milk");
        fleet.add(GetMilk);
        Thing RemoveTheObstacles = new Thing("Remove the obstacles");
        fleet.add(RemoveTheObstacles);
        Thing StandUp = new Thing("Stand up");
        fleet.add(StandUp);
        StandUp.complete();
        Thing EatLunch = new Thing("Eat lunch");
        fleet.add(EatLunch);
        EatLunch.complete();
        for (Thing t : fleet.getThings()) {
            t.printAllFields();
        }
    }
}
