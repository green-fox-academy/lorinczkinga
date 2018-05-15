import java.util.ArrayList;
import java.util.List;

public class Armada {
    private List<PirateShip> shipList;

    public Armada() {
        shipList = new ArrayList<>();
        for (int i = 0; i < (int)(0 + Math.random()*10); i++) {
            shipList.add(new PirateShip());
            shipList.get(i).fillShip();
        }
    }

    public List<PirateShip> getShipList() {
        return shipList;
    }

    public void setShipList(List<PirateShip> shipList) {
        this.shipList = shipList;
    }

    public boolean war(Armada otherArmada) {
        while ((this.shipList.size()!= 0) && (otherArmada.shipList.size() != 0)) {
            System.out.println("Number of ships in your armada: " + this.shipList.size());
            System.out.println("Number of ships of the enemy: " + otherArmada.shipList.size());
            boolean isThisArmadaWinner = this.shipList.get(0).battle(otherArmada.shipList.get(0));
            if (isThisArmadaWinner) {
                otherArmada.shipList.remove(0);
            } else {
                this.shipList.remove(0);
            }

        }
        if (this.shipList.size() > otherArmada.shipList.size()) {
            System.out.println("You've won the war!");
            return true;
        } else {
            System.out.println("You've lost the war!");
            return false;
        }
    }
}
