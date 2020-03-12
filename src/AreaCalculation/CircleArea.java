
package AreaCalculation;

import java.util.Scanner;


public class CircleArea {
    //Formula is A= 3.1416*radius*radius
    public static void main(String[] args) {
        double radius,areaCircle;
        
    Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: "); 
        radius=input.nextDouble();
        areaCircle = 3.1416*Math.pow(radius, 2);
        //areaCircle = 3.1416*radius*radius;
        System.out.printf("The area of circle is:%.1f", areaCircle);
        
        
    }
        
}
