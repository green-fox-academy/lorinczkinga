import java.util.Collections;

public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

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

        Collections.sort(fleet.getThings());
        System.out.println(fleet);

        Collections.sort(fleet.getThings(), Thing.ThingNameComparator);
        System.out.println(fleet);
    }
}