
package TwoDimensionalArray;
import java.util.Scanner;

public class TwoDimensionalArrayDemo {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of Row: ");
        int row = input.nextInt();
        System.out.println("Enter the number of col: ");
        int col = input.nextInt();
        
        String [][] names = new String [row][col];
        
     
        for (int i = 0; i < row; i++) {
            
            for (int j = 0; j < col; j++) {
                System.out.println("Position: " + i + " " + j);
                System.out.print("Enter the value of col: ");
                names [i][j] = input.next();
                
                
            }
            
            System.out.println();
        }
        System.out.println("All the values are printing below: ");
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(" "+ names[i][j]);
            }
            System.out.println();
        }
        
    }
}
