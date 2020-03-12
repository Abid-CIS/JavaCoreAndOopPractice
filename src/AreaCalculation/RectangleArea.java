
package AreaCalculation;

import java.util.Scanner;


public class RectangleArea {
    
    public static void main(String[] args) {
        double length, width, areaRect;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the \'length\' of Rectangle: ");
        length= input.nextDouble();
        
        System.out.println("Enter the \'width\' of RectTangle: ");
        width = input.nextDouble();
        
        areaRect= length*width;
        
        System.out.println("The area of Rectangle is: "+ areaRect);
        
        
        
        
    }
}
