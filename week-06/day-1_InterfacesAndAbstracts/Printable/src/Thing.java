import java.util.Comparator;

/**
 * Created by aze on 2017.03.29..
 */
public class Thing implements Comparable<Thing>, Printable {
    private String name;
    private boolean completed;

    public Thing(String name) {
        this.name = name;
    }

    public void complete() {
        this.completed = true;
    }

    public String getName() {
        return name;
    }

    public boolean isCompleted() {
        return completed;
    }

    @Override
    public String toString() {
        return (completed ? "[x] " : "[ ] ") + name;
    }

    @Override
    public int compareTo(Thing o) {
        if (this.completed) {
            return -1;
        } else {
            return +1;
        }
    }

    public static Comparator<Thing> ThingNameComparator
            = new Comparator<Thing>() {

        public int compare(Thing thing1, Thing thing2) {

            String fruitName1 = thing1.getName().toUpperCase();
            String fruitName2 = thing2.getName().toUpperCase();

            //ascending order
            return fruitName1.compareTo(fruitName2);

        }
    };

    @Override
    public void printAllFields() {
        System.out.println(toString());
    }
}

