package main.java.animals;

public class Bird extends Animal{

    public Bird(String name) {
        super(name);
    }

    public Bird(String name, int age, String gender, int numberOfLegs, String foodType, String locomotion) {
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
        return "laying eggs";
    }

    @Override
    public String skinType() {
        return "feathers";
    }
}
