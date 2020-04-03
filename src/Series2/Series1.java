
package Series2;
// 1*2*3*4
import java.util.Scanner;


public class Series1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the last number");
        int n = input.nextInt();
        int mul = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " X ");
            mul = mul*i;
        }
        System.out.println();
        System.out.println("Result: " + mul );
        
        
    }
}
