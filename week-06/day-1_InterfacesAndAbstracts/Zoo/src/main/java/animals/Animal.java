package main.java.animals;

public abstract class Animal {
    public String name;
    public int age;
    public String gender;
    public int numberOfLegs;
    public String foodType;
    public String locomotion;

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, int age, String gender, int numberOfLegs, String foodType, String locomotion) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.numberOfLegs = numberOfLegs;
        this.foodType = foodType;
        this.locomotion = locomotion;
    }

    public String getName() {
        return name;
    }

    public abstract String move();
    public abstract String eat();
    public abstract String breed();
    public abstract String skinType();
}
