
package AreaCalculation;

import java.util.Scanner;

public class TriangleArea {
    
    public static void main(String[] args) {
        double base, height, area;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the base of Triangle:\t");
        base= input.nextDouble();
        System.out.println("Enter the height of Triangle:\t");
        height= input.nextDouble();
        area= 0.5*base*height;
        
        System.out.print("The area of triangle is:"+ area);
        
    }
    
}
