
package AreaFindOut;

import java.util.Scanner;


public class AreaTriangle {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the base of Triangle: ");
        double base = input.nextDouble();
        
        System.out.println("Enter the height of Triangle");
        double height = input.nextDouble();
        
        double triangleArea = 0.5*base*height;
        System.out.println("Area of \'Triangle\' is: " + triangleArea);
    }
}
