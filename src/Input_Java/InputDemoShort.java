
package Input_Java;

import java.util.Scanner;


public class InputDemoShort {
    
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        
        System.out.println("Short1: ");
        short b1 = inputValue.nextShort();
        System.out.println("Short1 : " + b1);
        
        System.out.println("Short2: ");
        short b2 = inputValue.nextShort();
        System.out.println("Short2 : " + b2);
        
        System.out.println("Short3: ");
        short b3 = inputValue.nextShort();
        System.out.println("Short3 : " + b3);
        
        short sum = (short)(b1 + b2 + b3);
        System.out.println("Byte3 : " + sum);
    }
}
