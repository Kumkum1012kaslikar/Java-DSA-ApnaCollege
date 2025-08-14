package Sort;

public class Selection {
    public static void ss(int[] arr) {
    
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp =arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        for(int o=0;o<arr.length;o++){
            System.out.print(arr[o]+"");
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        ss(arr);
    }
}
