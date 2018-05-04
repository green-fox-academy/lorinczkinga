import java.sql.SQLOutput;

public class Animal {
    int hunger;
    int thirst;

    public Animal() {
        this.hunger = 50;
        this.thirst = 50;
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

    public static void main(String[] args) {
        Animal littleTiger = new Animal();

        littleTiger.eat();

        System.out.println(littleTiger.hunger);
    }
}
