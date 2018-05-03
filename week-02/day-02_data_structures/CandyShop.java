import java.util.ArrayList;
import java.util.Arrays;

public class CandyShop {
    public static void main(String[] args) {

        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add("Cupcake");
        arrayList.add(2);
        arrayList.add("Brownie");
        arrayList.add(false);

        System.out.println(sweets(arrayList));
    }

    public static ArrayList sweets(ArrayList arrayList) {
        arrayList.set(1, "Croissant");
        arrayList.set(3, "Ice cream");
        return arrayList;
    }

}
