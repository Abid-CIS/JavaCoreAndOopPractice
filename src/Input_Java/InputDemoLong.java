
package Input_Java;
import java.util.Scanner;

public class InputDemoLong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the first long munber: ");
        long A = input.nextLong();
        System.out.println(A);
        
        System.out.println("Enter the second long munber: ");
        long B = input.nextLong();
        System.out.println(B);
        
        System.out.println("Enter the third long munber: ");
        long C = input.nextLong();
        System.out.println(C);
        
        long sum = A+B+C;
        System.out.println("The sum is: " + sum);
        
    }
}
