import java.util.ArrayList;


public class JosephusProblem {
    public static void main(String[] args) {

        System.out.println(JosephusProblem(13));
    }

        public static int JosephusProblem(int numberOfPeople) {

        ArrayList<Integer> numbersOfSeats = new ArrayList<>();
        for (int i = 1; i <= numberOfPeople; i++) {
            numbersOfSeats.add(i);
        }

        int jump = 1;
        while (numbersOfSeats.size() > 1) {
            if (jump >= numbersOfSeats.size()) {
                    jump -= numbersOfSeats.size();
                }
            numbersOfSeats.remove(jump);
            jump ++;
        }

        int survival = numbersOfSeats.get(0);
        return survival;
    }

}






