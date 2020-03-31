
package Input_Java;

import java.util.Scanner;

public class NewInputDemo {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int A = input.nextInt();
        System.out.println("A = "+ A);
        
        System.out.println("Enter the second number");
        int B = input.nextInt();
        System.out.println("B = "+ B);
        
        int SOMA = A+B;
        System.out.println(" SOMA = " + SOMA );
        
        
        
    }
        
}
