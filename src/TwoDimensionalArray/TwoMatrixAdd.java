
package TwoDimensionalArray;

import java.util.Scanner;

public class TwoMatrixAdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Matrix A
        System.out.println("Enter the value for Matrix  A: ");
        System.out.println("Please enter the number of row: ");
        int row1 = input.nextInt();
        System.out.println("Please enter the number of col: ");
        int col1 = input.nextInt();
        int [][] A = new int [row1][col1];
        
       
        
        //For Matrix A: 
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                System.out.printf("A[%d][%d] = ", i,j);
                A[i][j] = input.nextInt();
            }
            System.out.println();
        }
       System.out.println("Matrix \'A\' is printing below: ===>>");
        System.out.println("A = ");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                
                System.out.print("\t"+A[i][j]);
                
                
            }
            System.out.print("\n\n");
        }
        
        
        
        System.out.print("\n");
        // Matrix B
        System.out.println("Enter the value for Matrix  B: ");
        System.out.println("Please enter the number of row: ");
        int row2 = input.nextInt();
        System.out.println("Please enter the number of col: ");
        int col2 = input.nextInt();
        int [][] B = new int [row2][col2];
        
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.printf("B[%d][%d] = ", i,j);
                B[i][j] = input.nextInt();
            }
            System.out.println();
        }
        
        System.out.println("Matrix \'B\' is printing below: ===>>");
        System.out.println("B = ");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print("\t"+B[i][j]);
                
                
            }
            System.out.print("\n\n");
        }
        
        //Adding Matrix A+B and Placing into C [][];
        // For matrix c:
        System.out.println("Enter the value for Matrix  C: ");
        System.out.println("Please enter the number of row: ");
        int row3 = input.nextInt();
        System.out.println("Please enter the number of col: ");
        int col3 = input.nextInt();
        int [][] C = new int[row3][col3];
        System.out.println("Matrix A+B: ");
        for (int i = 0; i < row3; i++) {
            for (int j = 0; j < col3; j++) {
                C [i][j] = ((A[i][j]) + (B [i][j]));
                //System.out.print("\t"+((A[i][j]) + (B [i][j])));
                System.out.print("\t"+ C[i][j]);
                
                
            }
            System.out.print("\n\n");
        }

    }
}
