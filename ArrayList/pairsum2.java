package ArrayList;

import java.util.ArrayList;

public class pairsum2 {
    public static boolean pairsumm(ArrayList<Integer> list, int target) {
        int l = 0;
        int r = list.size() - 1;
        while (l != r) {
            if (list.get(l) + list.get(r) == target) {
                return true;
            } else if (list.get(l) + list.get(r) < target) {
                l++;
            } else if (list.get(l) + list.get(r) > target) {
                r--;
            }
        }
        return false;
    }

    // brute force

    public static boolean pairsum(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    return true;
                }
            }
        }
        return false;

    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 5;

        
    }
}
