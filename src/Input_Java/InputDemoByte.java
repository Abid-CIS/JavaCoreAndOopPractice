
package Input_Java;
import java.util.Scanner;

public class InputDemoByte {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        
        System.out.println("Byte1: ");
        byte b1 = inputValue.nextByte();
        System.out.println("Byte1 : " + b1);
        
        System.out.println("Byte2: ");
        byte b2 = inputValue.nextByte();
        System.out.println("Byte2 : " + b2);
        
        System.out.println("Byte3: ");
        byte b3 = inputValue.nextByte();
        System.out.println("Byte3 : " + b3);
        //byte sum = (b1 + b2 + b3);//left side is byte and right side is integer.
        /*
        Note: 
        There is no operator for byte operation in java, 
        before processing, 
        it just only treated as byte 
        and after processed using (+ or - operator)
        it just only treated as integer number
        */
        byte sum = (byte)(b1 + b2 + b3);
        System.out.println("The sum is : " + sum);
    }
}
