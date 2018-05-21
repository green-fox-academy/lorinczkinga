package main.java.animals;

public class Reptile extends Animal{

    public Reptile(String name) {
        super(name);
    }

    public Reptile(String name, int age, String gender, int numberOfLegs, String foodType, String locomotion) {
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
        return  "horny epidermis";
    }
}
