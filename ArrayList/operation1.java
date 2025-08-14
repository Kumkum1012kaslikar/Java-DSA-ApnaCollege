package ArrayList;

import java.util.*;

public class operation1 {
    public static void main(String[] args) {
        // classname objectname = new classname
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();
        // add
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(1, 4);

        System.out.println(list);

        // get
        int element = list.get(2);
        System.out.println(element);

        // delete
        list.remove(2);
        System.out.println(list);

        // set
        // 2 index me 3 daal do
        list.set(2, 3);

        // check krne ke liye ki 2 index me kya 3 exist krta hai
        System.out.println(list.contains(1));

        // iteration
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // find max
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {

            max = Math.max(max, list.get(i));
        }
        System.out.println(max);
    }

}
