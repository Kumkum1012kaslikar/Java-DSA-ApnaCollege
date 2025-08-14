package Arrays;

public class Print_Subarray {
    public static void Brute_Force(int num[]) {
       int currSum=0;
       int maxSum= Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int end=j;
                currSum=0;
                for(int k=start;k<=end;k++){
                    currSum +=num[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
                
            }
            
        }
        System.out.println("max sum = "+maxSum);
    }

    public static void Prefix_Sum(int [] num) {
        int currSum=0;
        int maxSum= Integer.MIN_VALUE;
        int prefix[]= new int[num.length];
        prefix[0]=num[0];

         for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+num[i];
         }

         for(int i=0;i<num.length;i++){

             int start=i;
             for(int j=i;j<num.length;j++){
                 int end=j;
                 currSum= start ==0 ? prefix[end]: prefix[end] - prefix[start-1];
                
                 if(maxSum < currSum){
                     maxSum = currSum;
                 }
                 
             }
             
         }
         System.out.println("max sum = "+maxSum);
    }

    //kadanes does not work on all negative values.
    public static void kadanes(int num[]) {
        int ms=Integer.MIN_VALUE;
        int cs=0;

        for(int i=0;i<num.length;i++){
            cs=cs+num[i];
            if(cs<0){
                cs=0;
            }
            ms = Math.max(cs , ms);

        }
        System.out.println("our max subarray sum is: "+ms);
        
    }


    public static void main(String[] args) {
        int num[] = {2,4,6,8,10};
        Brute_Force(num);
        Prefix_Sum(num);
        kadanes(num);
    }
}

//O(n^3)
//big O of n cube
