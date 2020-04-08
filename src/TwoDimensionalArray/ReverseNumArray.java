
package TwoDimensionalArray;

import java.util.Scanner;


public class ReverseNumArray {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the row of \'Matrix\' A: ");
        int row = input.nextInt();
        System.out.println("Enter the column of \'Matrix\' A: ");
        int col = input.nextInt();
        int [][] A = new int [row][col];
        int k = 100;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                A[i][j] = k;
                System.out.printf("A[%d][%d]= %d \t", i, j, A[i][j]);
                k--;
            }
            System.out.println();
        }
        System.out.println("Print value: ");
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("\t"+ A[i][j]);
            }
            System.out.println();
        }
    }
}
