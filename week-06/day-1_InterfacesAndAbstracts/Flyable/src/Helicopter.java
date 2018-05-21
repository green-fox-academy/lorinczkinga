public class Helicopter extends Vehicle implements Flyable {

    public Helicopter(String type, int maxSpeed, int maxNumberOfPassengers) {
        super(type, maxSpeed, maxNumberOfPassengers);
    }

    @Override
    public void land() {
        System.out.println("The helicopter is landing.");
    }

    @Override
    public void fly() {
        System.out.println("The helicopter is flying.");
    }

    @Override
    public void takeOff() {
        System.out.println("The helicopter is taking off.");
    }
}
