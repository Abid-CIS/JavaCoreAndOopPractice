
package OperatorExample;
import java.util.Scanner;

public class ConditionalOperator {
    public static void main(String[] args) {
        int large,lowest;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two digit");
        int a = input.nextInt();
        int b = input.nextInt();
        large= a>b?a:b;// ternary operator
        lowest=a<b?a:b;
        System.out.println("The large value is"+ large);
        System.out.println("The lowest value is"+ lowest);
        
        
    }
}
