import java.util.ArrayList;

public class Unique {
    public static void main(String[] args) {

        System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
    }

    public static ArrayList unique(int[] arg) {
        ArrayList<Integer> result= new ArrayList<>();
        result.add(0,arg[0]);
        int flag = 0;
        for (int i = 1; i < arg.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arg[i] == arg[j]) {
                    flag = 1;
                    break;
                }
            }
            if (flag != 1) {
                result.add(result.size(), arg[i]);
            } else {
                flag = 0;
            }
        }
        return result;
    }
}
