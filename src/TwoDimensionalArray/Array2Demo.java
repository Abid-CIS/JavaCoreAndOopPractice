
package TwoDimensionalArray;

public class Array2Demo {
    
    public static void main(String[] args) {
        int [][] A = new int[4][6];
        int k = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                A[i][j] = k;
                System.out.printf("A[%d][%d]= %d \t", i, j, A[i][j]);
                
                k++;
            }
            System.out.println("Column complete-->>");
            System.out.println();    
        }
        System.out.println("\n \n");
        System.out.println("Printing value: ");
        System.out.println("Matrix A = ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                
                System.out.print(" \t" + A[i][j]);
                
            }
            System.out.println();
        }
    }
}
