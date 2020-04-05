
package ArrayDemo;

import java.util.Scanner;


public class Array2loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double [] number = new double[5];
        System.out.println("Please enter 5 numbers: ");
        int i = 0; 
        double sum = 0;
        while( i <= 4){
        number[i] = input.nextDouble();
        System.out.print(number[i] + " ");
        sum = sum + number[i];
        i++;
        }
        System.out.println();
        System.out.println("The sum is: " + sum);
        
    }
    
}
