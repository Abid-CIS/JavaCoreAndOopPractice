
package Input_Java;
import java.util.Scanner;

public class InputDemoString {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
  
        System.out.println("Enter the name of first person: ");
        String A = input.nextLine();
        System.out.println("A = " + A);
        
        System.out.println("Enter the name of first person: ");
        String B = input.nextLine();
        System.out.println("B = " + B);
        
        String TOTAL = A + " + " + B;
        System.out.println("TOTAL: " + TOTAL);
        
        
        
    }
}
