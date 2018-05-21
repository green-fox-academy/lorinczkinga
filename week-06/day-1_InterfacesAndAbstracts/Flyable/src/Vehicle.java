public abstract class Vehicle {
    public String type;
    public int maxSpeed;
    public int maxNumberOfPassengers;

    public Vehicle(String type, int maxSpeed, int maxNumberOfPassengers) {
        this.type = type;
        this.maxSpeed = maxSpeed;
        this.maxNumberOfPassengers = maxNumberOfPassengers;
    }
}
