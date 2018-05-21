import main.java.animals.*;

public class Zoo {

    public static void main(String[] args) {

        Reptile reptile = new Reptile("Crocodile");
        Mammal mammal = new Mammal("Koala");
        Bird bird = new Bird("Parrot");
        Reptile reptile2 = new Reptile("Crocodile", 1, "female", 4, "meat", "walking");
        Mammal mammal2 = new Mammal("Koala", 2, "male", 4, "plant", "climbing");
        Bird bird2 = new Bird("Eagle", 1, "female", 2, "meat", "flying");

        System.out.println("How do you breed?");
        System.out.println("A " + reptile.getName() + " is breeding by " + reptile.breed());
        System.out.println("A " + mammal.getName() + " is breeding by " + mammal.breed());
        System.out.println("A " + bird.getName() + " is breeding by " + bird.breed());

        System.out.println("and...");
        System.out.println("A " + reptile2.getName() + " has " + reptile2.numberOfLegs + " legs. They eat " + reptile2.eat() + " and they have " + reptile2.skinType() + ". ");
        System.out.println("A " + mammal2.getName() + " has " + mammal2.numberOfLegs + " legs. They eat " + mammal2.eat() + " and they have " + mammal2.skinType() + ". ");
        System.out.println("An " + bird2.getName() + " has " + bird2.numberOfLegs + " legs. They eat " + bird2.eat() + " and they have " + bird2.skinType() + ". ");
    }
}