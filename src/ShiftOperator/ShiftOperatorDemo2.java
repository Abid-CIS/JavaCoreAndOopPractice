
package ShiftOperator;

import java.util.Scanner;


public class ShiftOperatorDemo2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Enter the first value! : ");
        a = input.nextInt();
        System.out.println("Enter the second value! : ");
        b = input.nextInt();
        int c= (a >> b);
        System.out.println("C is: " + c);
    }
 
}
