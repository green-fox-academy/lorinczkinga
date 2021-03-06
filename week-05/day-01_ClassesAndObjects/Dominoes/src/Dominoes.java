import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dominoes {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();

        List<Domino> newDominoes = new ArrayList<>();
        newDominoes.add(dominoes.get(0));
        while (dominoes.size() != newDominoes.size())
            for (int j = 0; j < dominoes.size(); j++) {
            if (newDominoes.get(newDominoes.size()-1).getValues()[1] == dominoes.get(j).getValues()[0]) {
                newDominoes.add(dominoes.get(j));
            }
        }
        System.out.println(newDominoes);
    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }
}