
package ControlStatementPractice;

import java.util.Scanner;


public class EvenOddChecking {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive number");
        int number = input.nextInt();
        
        if(number % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        
        
    }
}
