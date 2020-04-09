
package ArrayDemo;
import java.util.Scanner;

public class ArrayDemo {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] number1 = new int[10];
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.printf("Enter the Value: \n number1[%d]= ", i);
            number1[i]= input.nextInt();
            sum = sum + number1[i]; 
        }
        System.out.println("\n");
        System.out.println("Values printing: \n");
        for (int i = 0; i < 10; i++) {
            
            int k = number1[i];
            System.out.printf("number1[%d] = %d \n", i, k);
            
        }
        System.out.println();
        System.out.println("Total: " + sum);
        
    }  
}
