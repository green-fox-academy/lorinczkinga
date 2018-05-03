import java.util.ArrayList;

public class SubInt {
    public static void main(String[] args) {
        //  Create a function that takes a number and a list of numbers as a parameter
        //  Returns the indeces of the numbers in the list where the first number is part of
        //  Returns an empty list if the number is not part any of the numbers in the list

        //  Example:
        System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
        //  should print: `[0, 1, 4]`
        System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
        //  should print: '[]'
    }

    public static ArrayList subInt(int searchFor, int[] numbers) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {

            if ( String.valueOf(numbers[i]).contains(String.valueOf(searchFor)) )
            answer.add(i);
        }
        return answer;
    }

}
