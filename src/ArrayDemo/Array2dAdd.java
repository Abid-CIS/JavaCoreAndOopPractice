
package ArrayDemo;
import java.util.Scanner;

public class Array2dAdd {
    public static void main(String[] args) {
        //array -1
        Scanner input = new Scanner(System.in);
        int [][] num1 = new int[4][5];
        //int [][] num2 = new int[4][5];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("num1[%d][%d]= ", i,j);
                num1[i][j] = input.nextInt();
            }
            System.out.println();
        }
        //Value printing: 
        System.out.println("Printing value of Array1: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" "+ num1[i][j]);
                
            }
            System.out.println();
        }
        
        System.out.println("\n Array2 printing:");
        //array -2
        
        int [][] num2 = new int[4][5];
       
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("num2[%d][%d]= ", i,j);
                num2[i][j] = input.nextInt();
            }
            System.out.println();
        }
        //Value printing: 
        System.out.println("Printing value of Array2: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" "+ num2[i][j]);
                
            }
            System.out.println();
        }
        // Adding 2 Arrays:
        System.out.println("\n");
        System.out.println("Adding 2 arrays: ");
        int [][] add = new int[4][5];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                add [i][j] = num1[i][j] + num2 [i][j];
                System.out.print(" " + add[i][j]);
            }
            System.out.println();
        }
        
    }
    
}
