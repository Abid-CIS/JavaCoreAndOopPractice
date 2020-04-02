
package TernaryOperator;

import java.util.Scanner;


public class ChechLowestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, lowest;
        
        System.out.println("Enter the first number!");
        num1 = input.nextDouble();
        System.out.println("Enter the second number!");
        num2 = input.nextDouble();
        
        lowest = (num1 < num2) ? num1 : num2;
        System.out.println("The lowest number is: " + lowest);
        
    }
}
