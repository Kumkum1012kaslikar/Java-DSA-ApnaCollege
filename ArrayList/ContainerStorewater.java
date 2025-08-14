package ArrayList;

import java.util.ArrayList;

public class ContainerStorewater {
    // brute force approach
    public static int str(ArrayList<Integer> height) {
        int max = 0;
        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int width = j - i;
                int currWater = ht * width;
                max = Math.max(max, currWater);

            }
        }
        return max;
    }

    // 2 pointer approach
    public static int st(ArrayList<Integer> height) {
        int max = 0;
        int lp = 0;
        int rp = height.size() - 1;

        while (lp < rp) {
            // calculate water height
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int currWater = ht * width;
            max = Math.max(max, currWater);

            // update ptr
            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }

        }
        return max;

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(str(list));
        System.out.println(st(list));
    }
}
