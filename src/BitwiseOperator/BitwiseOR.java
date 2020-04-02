
package BitwiseOperator;
import java.util.Scanner;

public class BitwiseOR {
    //Bitwise inclusive OR: | (only one)
    
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int a, b, c, z;
         System.out.println("Enter the first digit: ");
         a = input.nextInt();
         System.out.println("Enter the second digit: ");
         b = input.nextInt();
         c = a | b;
         z = a ^ b;
         System.out.println("A BitwiseOR B: C -> " + c);
         System.out.println("A BitwiseEXOR B: Z -> " + z);
    }
    
    
}
