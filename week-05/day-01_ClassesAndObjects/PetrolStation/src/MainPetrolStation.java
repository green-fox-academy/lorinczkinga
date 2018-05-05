public class MainPetrolStation {
    public static void main(String[] args) {

        Car car = new Car();
        System.out.println(car.gasAmount);

        Station station = new Station();
        station.refill(car);
        System.out.println(car.gasAmount);
        System.out.println(station.gasAmount);
    }
}
