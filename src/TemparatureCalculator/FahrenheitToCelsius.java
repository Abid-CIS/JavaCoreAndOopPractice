
package TemparatureCalculator;

import java.util.Scanner;


public class FahrenheitToCelsius {
    //required a main method first.
    //Rules Fahrenheit to celsius F=9/5*c+32; c= 5/9(F-32);
    
    public static void main(String[] args) {
        double cel, fah;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the celsius value:");
        cel= input.nextDouble();
        
        fah= (9/5)*cel+32;
        System.out.println("The fahrenheit value is "+ fah);
    }
}
