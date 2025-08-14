public class p8 {
    public static void main(String[] args) {
        int n=8;

        for(int i=1;i<=n/2;i++){
            for(int j=i;j>=1;j--){
              System.out.print("*");
            }
              for(int k=n-(2*i)+1;k>=2;k--){
                System.out.print(" ");
            }
            for(int l=n-i+1;l<=n;l++){
                System.out.print("*");
            }
            
           
           
            System.out.println();
        }

        for(int i=n/2;i>=1;i--){
            for(int j=1;j<=i;j++){
              System.out.print("*");
            }
              for(int k=2;k<=n-(2*i)+1;k++){
                System.out.print(" ");
            }
            for(int l=n;l>=n-i+1;l--){
                System.out.print("*");
            }
            
           
           
            System.out.println();
        }

    }
}
