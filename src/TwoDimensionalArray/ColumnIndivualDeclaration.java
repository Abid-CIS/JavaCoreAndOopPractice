
package TwoDimensionalArray;

public class ColumnIndivualDeclaration {
    
    public static void main(String[] args) {
        int [][] A = new int[5][];
        A[0] = new int[1];
        A[1] = new int[2];
        A[2] = new int[3];
        A[3] = new int[4];
        A[4] = new int[5];
        int k = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i+1; j++) {
                A[i][j]= k;
                System.out.printf("A[%d][%d]= %d \t",i,j,A[i][j]);
                k++;
            }
            System.out.println();
        }
        System.out.println("\n \n");
        System.out.println("For printing: ");
        System.out.println("A=");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(" \t" + A[i][j]);
            }
            System.out.println();
        }
        
    }
}
