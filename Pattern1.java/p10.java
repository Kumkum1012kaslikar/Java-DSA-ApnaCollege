public class p10 {
    public static void main(String[] args) {
        int n=6;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=(n-i);k++){
                System.out.print(" ");
            }
        for(int j=1;j<=n;j++){
            if(i==n || i==1 || j==1 || j==n){
            System.out.print("*");
            }else{
               
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
        
        
        }  
    }

