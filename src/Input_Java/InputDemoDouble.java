
package Input_Java;
import java.util.Scanner;

public class InputDemoDouble {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature of the room: ");
        double d1 = input.nextDouble();
        System.out.println("The first value is: " + d1);
        
    }
}
