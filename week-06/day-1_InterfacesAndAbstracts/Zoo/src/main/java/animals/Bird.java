package main.java.animals;

public class Bird extends Animal implements Flyable {

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

    @Override
    public void land() {
        System.out.println("The " + getName() + " is landing.");
    }

    @Override
    public void fly() {
        System.out.println("The " + getName() + " is flying.");
    }

    @Override
    public void takeOff() {
        System.out.println("The " + getName() + " is taking off.");
    }
}
