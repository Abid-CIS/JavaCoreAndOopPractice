
package AreaFindOut;
import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the redius of Circle:");
        double redius = input.nextDouble();
        double circleArea = 3.1416*Math.pow(redius, 2);
        System.out.println("The \'Area of circle\' is : " + circleArea);
    }
}
