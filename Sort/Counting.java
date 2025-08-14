package Sort;

public class Counting {
    public static void c(int [] arr) {
        int l=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            l=Math.max(l,arr[i]);
        }
        int count[]=new int[l+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        for(int o=0;o<arr.length;o++){
            System.out.print(arr[o]+"");
        }
    }

    public static void main(String[] args) {
        int arr[] ={5,4,1,3,2,1};
        c(arr);
    }
}
