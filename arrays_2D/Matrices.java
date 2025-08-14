package arrays_2D;

import java.util.*;
public class Matrices {
    public static void main(String[] args) {
        //row(horizontal) * columns(vertical)
        int matrix [] [] =new int[3] [3];
           int n=matrix.length; //rows length
           int m= matrix[0].length; //column length
           
        Scanner sc=new Scanner( System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
             System.out.print(matrix[i][j] +" ");
                
            }
            System.out.println();
        }

    }
    
}
