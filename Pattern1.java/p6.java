public class p6 {
    public static void main(String[] args) {
    
    int n=4;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
           
            System.out.print(" ");
    }
    for(int p=1; p<=i;p++){
        System.out.print("*");
    }
    System.out.println();
    }
}
}
