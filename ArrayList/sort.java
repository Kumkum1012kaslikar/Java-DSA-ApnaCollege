package ArrayList;

import java.util.*;
import java.util.ArrayList;

public class sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(7);
        list.add(2);
        list.add(4);
        // ascending
        Collections.sort(list);
        // descending
        Collections.sort(list, Collections.reverseOrder());
    }
}
