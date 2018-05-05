import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    List<Sharpie> SharpieList;

    public SharpieSet () {
        SharpieList = new ArrayList<>();
    }

    public int countUsable() {
       int count = 0;
        for (Sharpie actualSharpie:SharpieList) {
            if (actualSharpie.inkAmount != 0) {
                count ++;
            }
        }
       return count;
    }

    public void removeTrash() {
        for (int i = 0; i < SharpieList.size(); i++) {
            if (SharpieList.get(i).inkAmount == 0) {
                SharpieList.remove(i);
            }
        }
    }
}
