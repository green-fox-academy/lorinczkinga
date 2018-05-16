import java.util.ArrayList;
import java.util.List;

public class Garden {
    private List<Tree> treeList;
    private List<Flower> flowerList;

    public Garden() {
        treeList = new ArrayList<>();
        flowerList = new ArrayList<>();
    }

    public void setTreeList(List<Tree> treeList) {
        this.treeList = treeList;
    }

    public void setFlowerList(List<Flower> flowerList) {
        this.flowerList = flowerList;
    }

    public List<Tree> getTreeList() {
        return treeList;
    }

    public List<Flower> getFlowerList() {
        return flowerList;
    }

    public void wateringPlants(int waterAmount) {

        System.out.println("Watering with " + waterAmount);
        for (Flower currentFlower: flowerList) {
            currentFlower.watering(waterAmount);
        }
        for (Tree currentTree: treeList) {
            currentTree.watering(waterAmount);
        }
    }

    public void gardenInfo() {
        for (Flower currentFlower: flowerList) {
            currentFlower.plantInfo();
        }
        for (Tree currentTree: treeList) {
            currentTree.plantInfo();
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Garden garden = new Garden();
        garden.getFlowerList().add(new Flower("yellow"));
        garden.getFlowerList().add(new Flower("blue"));
        garden.getTreeList().add(new Tree("purple"));
        garden.getTreeList().add(new Tree("orange"));

        garden.gardenInfo();
        garden.wateringPlants(40);
        garden.gardenInfo();
        garden.wateringPlants(70);
        garden.gardenInfo();
    }
}
