import java.util.ArrayList;

public class Sum {
    protected ArrayList<Integer> listOfNumbers;

    public Sum(){
        this.listOfNumbers = new ArrayList<>();
    }

    public Sum(ArrayList<Integer> listOfNumbers) {
        this.listOfNumbers = listOfNumbers;
    }

    public ArrayList<Integer> getListOfNumbers() {
        return listOfNumbers;
    }

    public int summarize() {
        int sum = 0;
        for (Integer tempNumber : listOfNumbers) {
            sum += tempNumber;
        }
        return sum;
    }
}
