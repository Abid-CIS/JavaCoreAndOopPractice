
package Input_Java;

import java.util.Scanner;


public class InputDemoFloat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first float number");
        float A = input.nextFloat();
        System.out.println("The first value is: " + A);
        
        System.out.println("Enter the second float number");
        float B = input.nextFloat();
        System.out.println("The first value is: " + A);
        
        float C = A+B;
        System.out.println("The sum is: " + C);
        
        String s1 = String.valueOf(A) + " + " + Float.toString(B);
        System.out.println("Conversion from float to String: " + s1);
    }
}
