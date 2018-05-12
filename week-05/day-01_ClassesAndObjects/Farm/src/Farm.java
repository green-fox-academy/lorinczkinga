import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Farm {
    static final int capacity = 10;
    int freePlaces;
    List<Animal> farmList;
    
    public Farm() {
        freePlaces = capacity;
        farmList = new ArrayList<>();
    }

    public List<Animal> getFarmList() {
        return farmList;
    }

    public static int getCapacity() {
        return capacity;
    }

    public int getFreePlaces() {
        return freePlaces;
    }

    public void breed() {
        if (this.freePlaces != 0) {
            this.farmList.add(new Animal());
        }
        this.freePlaces = capacity - farmList.size();
    }

    public void slaughter() {
        Collections.sort(farmList);
        farmList.remove(0);
        this.freePlaces = capacity - farmList.size();
    }

}
