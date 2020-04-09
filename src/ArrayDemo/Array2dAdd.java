
package ArrayDemo;
import java.util.Scanner;

public class Array2dAdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] num1 = new int[4][5];
        //int [][] num2 = new int[4][5];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("num[%d][%d]= ", i,j);
                num1[i][j] = input.nextInt();
            }
            System.out.println();
        }
        //Value printing: 
        System.out.println("Printing value: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" "+ num1[i][j]);
                
            }
            System.out.println();
        }
        
    }
    
}
