
package AreaFindOut;

import java.util.Scanner;


public class RectangleArea {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the \'Length\' of Rectangle: ");
        double length = input.nextDouble();
        
        System.out.println("Enter the \'Width\' of Rectangle: ");
        double width = input.nextDouble();
        
        double rectArea = length*width;
        System.out.println("The \'Area\' of RectAngle is: "+ rectArea);
    }
    
}
