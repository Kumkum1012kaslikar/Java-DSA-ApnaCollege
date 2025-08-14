package Sort;

public class Bubble{
    public static void b(int [] arr) {
        for(int i=0;i<arr.length-2;i++){

            System.out.println(" Step : ");

            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    
                }
               
                for(int k=0;k<arr.length;k++){
                    System.out.print(arr[k]+" ");
                }
              
               System.out.println();
            }
            
            
        }
        System.out.println("Final");
            for(int o=0;o<arr.length;o++){
                System.out.print(arr[o]+"");
            }
    }
    public static void main(String[] args) {
        int arr[] ={5,4,1,3,2};
        b(arr);
    }
}