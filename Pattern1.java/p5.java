public class p5 {

    public static void h_r(int r, int c){
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(i==1 || i== r || j ==1 ||j ==c){
            System.out.print("*");
            
            
            }else{
                System.out.print(" ");
            }
            
            
    }
    System.out.println();}}
    public static void main(String[] args){
         
    int n=5; 
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n;j++){
                if(i==0 || i== n-2){
            System.out.print("*");
            
            
             continue;
            }
            
            else if(j ==0 ||j ==n-2){
               
              System.out.print("*");
              
              
            }
            System.out.print(" ");
        }
       System.out.println();
    }

    h_r(4,5);
}
}