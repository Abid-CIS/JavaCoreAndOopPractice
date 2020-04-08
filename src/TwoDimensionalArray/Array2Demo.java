
package TwoDimensionalArray;

public class Array2Demo {
    
    public static void main(String[] args) {
        int [][] A = new int[4][6];
        int k = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                A[i][j] = k;
                System.out.printf("A[%d][%d]= ", i, j);
                System.out.println("The value is = " + A[i][j]);
                k++;
            }
        }
        System.out.println("Printing value: ");
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                A[i][j] = k;
                System.out.printf("A[%d][%d]= ", i, j);
                System.out.println("The value is = " + A[i][j]);
                k++;
            }
        }
    }
}
