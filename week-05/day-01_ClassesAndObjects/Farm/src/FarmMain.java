import java.util.Arrays;

public class FarmMain {
    public static void main(String[] args) {
        Farm farm = new Farm();
        for (int i = 0; i < 10 ; i++) {
            farm.breed();
            farm.getFarmList().get(0).play();
            System.out.println(farm.getFarmList().get(i).getHunger());
            System.out.println(farm.freePlaces);
        }
        System.out.println("----");
        System.out.println(farm.getFarmList().get(0).getHunger());
        farm.slaughter();
        System.out.println("----");

        for (int i = 0; i < 9 ; i++) {
            System.out.println(farm.getFarmList().get(i).getHunger());
        }
    }
}
