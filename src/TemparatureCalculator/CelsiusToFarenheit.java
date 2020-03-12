
package TemparatureCalculator;

//Celsius = 5/9*(F-32);

import java.util.Scanner;

public class CelsiusToFarenheit {
    
    public static void main(String[] args) {
        double fah, cel;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the fahrenheit value:");
        fah= input.nextDouble();
        
        cel= 0.56 *(fah-32);
        System.out.printf("The celsius value is %.2f\n", cel);
        
    }
    
}
