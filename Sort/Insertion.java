package Sort;

public class Insertion {
        public static void in(int[] arr) {
        
            for( int i=1;i<arr.length;i++){
                int c=arr[i];
                int p=i-1;
                while(p >=0 && arr[p] >c){
                    
                        arr[p+1]=arr[p];
                       p--;

                    }
                    arr[p+1]=c;
                }
                
            
            for(int o=0;o<arr.length;o++){
                System.out.print(arr[o]+"");
            }
        }
        
        public static void main(String[] args) {
            int arr[]={5,4,1,3,2};
            in(arr);
        }
    }
     

