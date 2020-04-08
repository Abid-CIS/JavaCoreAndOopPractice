
package TwoDimensionalArray;

import java.util.Scanner;


public class DiagonalElementsInMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of row: ");
        int row = input.nextInt();
        System.out.println("Enter the value of column: ");
        int col = input.nextInt();
        int[][] A = new int[row][col];
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("A[%d][%d] =", i, j);
                 A[i][j] = input.nextInt();
            }
            System.out.println();
        }
        System.out.println("Printing value of matrix A: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                
                System.out.print("\t"+A[i][j]); 
            }
            System.out.println();
        }
        int sum = 0;
        System.out.println("Sum of diagonal elements: \n");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(i==j){
                    System.out.printf("A[%d][%d]=", i, j);
                    System.out.println("The diagonal element = " + A[i][j]);
                    sum = sum + A[i][j];
                    
                }
            }
        }
        System.out.println();
        System.out.println("The total of all diagonal elements: "+ sum + "\n");
        sum=0;
        System.out.println("Upper Triangle elements: \n");
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(i < j){
                    System.out.printf("A[%d][%d]=", i, j);
                    System.out.println("The diagonal element = " + A[i][j]);
                    sum = sum + A[i][j];
                    
                }
            }
            
        }
        System.out.println();
        System.out.println("The total upper triangle elements: "+ sum + "\n");
        sum=0;
        
        System.out.println("Lower Triangle elements: \n");
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(i > j){
                    System.out.printf("A[%d][%d]=", i, j);
                    System.out.println("The diagonal element = " + A[i][j]);
                    sum = sum + A[i][j];
                    
                }
            }
            
        }
        System.out.println();
        System.out.println("The total Lower triangle elements: "+ sum);
        
        
        
        
    }
}
