package ArrayList;

import java.util.*;

public class swap {

    public static void s(ArrayList<Integer> list, int inx1, int inx2) {
        int temp = list.get(inx1);
        list.set(inx1, list.get(inx2));
        list.set(inx2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        int inx1 = 1, inx2 = 3;
        System.out.print(list);
        System.out.println();
        s(list, inx1, inx2);
        System.out.print(list);
    }

}
