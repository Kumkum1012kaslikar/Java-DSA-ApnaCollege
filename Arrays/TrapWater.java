package Arrays;

public class TrapWater{
    public static int trappedRainWater(int height[]) {
        int leftMax[]=new int[height.length];
        leftMax[0]=height[0];
        for(int i=1;i<height.length;i++){
            leftMax[i]=Math.max(height[i] ,leftMax[i-1]);
        }

        int rightMax[]=new int[height.length];
        rightMax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rightMax[i]=Math.max(height[i], rightMax[i+1]);
        }
        int trappedWater=0;
        for(int i=0;i<height.length;i++){
            int waterLevel=Math.min(leftMax[i], rightMax[i]);
            trappedWater+=waterLevel-height[i];
        }
        return trappedWater;
    }
public static void main(String[] args) {
    int arr[] = {4,2,0,6,3,2,5};
    int lmax[]=new int[arr.length];
  int rmax[]=new int[arr.length];
  int ans[]=new int[arr.length];
  int aans=0;
  int rrmax=0;
  int llmax=0;
    for(int i=0;i<arr.length;i++){
        if(llmax==0){
            lmax[i]=arr[i];
            llmax=arr[i];
        }
        else if(llmax > arr[i]){
            lmax[i]= llmax;

        }
        else if(llmax< arr[i]){
            lmax[i]=arr[i];
            llmax=arr[i];
        }
        }
        System.out.println("left max boundary");
        for(int j=0;j<lmax.length;j++){
            
            System.out.print(lmax[j]+" ");
        }
        System.out.println();
        for(int i=arr.length-1;i>=0;i--){
            if(rrmax==0){
                rmax[i]=arr[i];
                rrmax=arr[i];
            }
            else if(rrmax > arr[i]){
                rmax[i]= rrmax;
    
            }
            else if(rrmax< arr[i]){
                rmax[i]=arr[i];
                rrmax=arr[i];
            }
            }
            System.out.println("Right max boundary");
            for(int j=0;j<rmax.length;j++){
                
                System.out.print(rmax[j]+" ");
            }
          System.out.println();

          for(int i=0;i<lmax.length;i++){
                 if(lmax[i]<rmax[i]){
                  ans[i]=(lmax[i]-arr[i]);
                   aans=+aans+ans[i];
                 }else{
                    ans[i]=(rmax[i]-arr[i]);
                   aans=+aans+ans[i];
                 }
          }
          
          System.out.println("Water Collected");
          for(int i=0;i<arr.length;i++){
            
            System.out.print(ans[i]+" ");
          }
          
          System.out.println();
          System.out.println("Total rain water collected");
          System.out.print(aans);
          System.out.println();
          System.out.println(trappedRainWater(arr));
    }

}
