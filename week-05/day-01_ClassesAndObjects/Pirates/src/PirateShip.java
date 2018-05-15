import java.util.ArrayList;
import java.util.List;

public class PirateShip {
    private List<Pirate> crew;
    private Pirate captain;

    public PirateShip() {
        crew = new ArrayList<>();
    }

    public void setCrew(List<Pirate> crew) {
        this.crew = crew;
    }

    public void setCaptain(Pirate captain) {
        this.captain = captain;
    }

    public List<Pirate> getCrew() {
        return crew;
    }

    public Pirate getCaptain() {
        return captain;
    }

    public int countAlivePirates() {
        int deadPirateCounter = 0;
        for (Pirate currentPirate:crew) {
            if (currentPirate.getPirateCondition() == "dead") {
                deadPirateCounter++;
            }
        }
        return (this.crew.size() - deadPirateCounter);
    }

    public void fillShip() {
        for (int i = 0; i < (int)(1 + Math.random()*10); i++) {
            crew.add(new Pirate());
        }
        captain = new Pirate();
    }

    public void shipInformation() {
        String result = "";
        result += "The captain is " + captain.getPirateCondition()
                + ". He/She's drunk " + captain.getDrunkLevel() + " times. ";
        result += "Number of alive pirates in the crew is: " + countAlivePirates();
        System.out.println(result);
    }

    public boolean battle(PirateShip otherShip) {

        if ((this.countAlivePirates() - this.captain.getDrunkLevel()) > (otherShip.countAlivePirates() - otherShip.captain.getDrunkLevel())) {
            int randomNumber = (int)(1 + Math.random()*(otherShip.crew.size()));
            System.out.println("You've won this battle!");
            for (int i = 0; i < randomNumber; i++) {
                int localRandomNumber = (int) (0 + Math.random() * (otherShip.crew.size() - 1));
                otherShip.crew.remove(localRandomNumber);
            }
            for (Pirate currentPirate : this.crew) {
                currentPirate.drinkSomeRum();
            }
            this.captain.drinkSomeRum();
            return true;
        } else {
            System.out.println("You've lost this battle!");
            int randomNumber = (int)(1 + Math.random()*(this.crew.size()));
            for (int i = 0; i < randomNumber; i++) {
                int localRandomNumber = (int) (0 + Math.random() * (this.crew.size() - 1));
                this.crew.remove(localRandomNumber);
            }
            for (Pirate currentPirate : otherShip.crew) {
                currentPirate.drinkSomeRum();
            }
            otherShip.captain.drinkSomeRum();
            return false;
        }
    }
}
