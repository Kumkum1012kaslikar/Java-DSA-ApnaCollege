package Sort;
import java.util.*;
import java.util.Collections;
public class ArraysSort {
    public static void main(String[] args) {
        Integer arr[]={5,4,1,3,2};
        Arrays.sort(arr);
        Arrays.sort(arr,0,3);
        Arrays.sort(arr,Collections.reverseOrder());
        Arrays.sort(arr, 0, 3,Collections.reverseOrder());
    }
    
}
