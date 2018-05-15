public class Pirate {
    private int drunkLevel;
    private String pirateCondition;
    private boolean hasParrot;

    public Pirate() {
        this.pirateCondition = "OK";
    }

    public int getDrunkLevel() {
        return drunkLevel;
    }

    public String getPirateCondition() {
        return pirateCondition;
    }

    public boolean HasParrot() {
        return hasParrot;
    }

    public void setDrunkLevel(int drunkLevel) {
        this.drunkLevel = drunkLevel;
    }

    public void setPirateCondition(String pirateCondition) {
        this.pirateCondition = pirateCondition;
    }

    public void setHasParrot(boolean hasParrot) {
        this.hasParrot = hasParrot;
    }

    public void drinkSomeRum() {
        if (this.pirateCondition == "dead") {
            System.out.println("This pirate is dead.");
        } else {
            drunkLevel++;
        }
    }

    public void die() {
        this.pirateCondition = "dead";
    }

    public void addParrot() {
        hasParrot = true;
    }

    public void brawl(Pirate otherPirate) {
        if (this.pirateCondition == "dead") {
            System.out.println("This pirate is dead.");
        } else {
            int destiny = (int)(0+Math.random()*2);
            if (destiny == 0) {
                this.pirateCondition = "dead";
            } else if (destiny == 1){
                otherPirate.pirateCondition = "dead";
            } else if (destiny == 2){
                this.pirateCondition = "dead";
                otherPirate.pirateCondition = "dead";
            }
        }
    }

    public void howsItGoingMate() {
        if (this.pirateCondition == "dead") {
            System.out.println("This pirate is dead.");
        } else if (this.drunkLevel < 5 ) {
            System.out.println("Pour me anudder!");
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            this.pirateCondition = "sleeping";
        }
    }
}
