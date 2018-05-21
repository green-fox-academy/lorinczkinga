package main.java.animals;

public class Mammal extends Animal{

    public Mammal(String name) {
        super(name);
    }

    public Mammal(String name, int age, String gender, int numberOfLegs, String foodType, String locomotion) {
        super(name, age, gender, numberOfLegs, foodType, locomotion);
    }

    @Override
    public String move() {
        return locomotion;
    }

    @Override
    public String eat() {
        return foodType;
    }

    @Override
    public String breed() {
        return "pushing miniature versions out";
    }

    @Override
    public String skinType() {
        return "fur";
    }
}
