package arrays_2D;

public class Digonal {

  public static int ds(int[][] matrix) {
    int sum = 0;

    // brute force (not optimize) O(n^2)
    /*
     * for (int i = 0; i < matrix.length; i++) {
     * for (int j = 0; j < matrix[0].length; j++) {
     * if (i == j) {
     * sum += matrix[i][j];
     * } else if (i + j == matrix.length - 1) {
     * sum += matrix[i][j];
     * }
     * }
     * 
     * }
     */

    // O(1)
    for (int i = 0; i < matrix.length; i++) {
      sum += matrix[i][i];
      // i+j= n-1
      // j=n-1-i
      if (i != matrix.length - 1 - i) {
        sum += matrix[i][(matrix.length - 1 - i)];
      }
    }

    return sum;
  }

  public static void main(String[] args) {
    int matrix[][] = { { 1, 2, 3, 4 },
        { 5, 6, 7, 8 },
        { 9, 10, 11, 12 },
        { 13, 14, 15, 16 } };

    System.out.println(ds(matrix));
  }
}
