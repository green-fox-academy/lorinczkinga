import java.sql.SQLOutput;
import java.util.Collections;

public class Animal implements Comparable<Animal> {
    int hunger;
    int thirst;

    public Animal() {
        this.hunger = 50;
        this.thirst = 50;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public void drink() {
        this.thirst --;
    }

    public void eat() {
        this.hunger --;
    }

    public void play() {
        this.hunger ++;
        this.thirst ++;
    }

    @Override
    public int compareTo(Animal o) {
        return o.hunger - this.hunger;
    }

}
