
package TernaryOperator;

import java.util.Scanner;


public class TernaryOperatorDemo {
    
    public static void main(String[] args) {
        // 2 ti digit er modhe comparison korte Ternary operator use hbe..
        // 2 ti number er (expression) er modhe condition check korte ternary operator use hoy.
        
        Scanner input = new Scanner(System.in);
        int a, b, maximum;
        System.out.println("Enter the first number!");
        a = input.nextInt();
        System.out.println("Enter the second number!");
        b = input.nextInt();
        
        maximum = (a > b) ? a : b;
        
        System.out.println("Maximum number is: " + maximum);
        
        
    }
}
