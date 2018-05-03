import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] list = {34, 12, 24, 9, 5};

        System.out.println(Arrays.toString(bubble(list)));
        System.out.println(Arrays.toString(advancedBubble(list, true)));
    }

    public static int[] bubble(int[] list) {
        Arrays.sort(list);
        return list;
    }

    public static int[] advancedBubble(int[] list, boolean flag) {
        Arrays.sort(list);
        if (flag) {
            int[] descSortedList = new int[list.length];
            for (int i = 0; i < list.length; i++) {
                descSortedList[list.length-1-i] = list[i];
            }
            return descSortedList;
        } else {
            return list;
        }
    }
}