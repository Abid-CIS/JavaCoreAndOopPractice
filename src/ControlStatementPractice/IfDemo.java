
package ControlStatementPractice;

import java.util.Scanner;


public class IfDemo {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter an Integer number");
        int num = input.nextInt();
        
        if(num > 0){
            System.out.println("Positive number");
        }else if(num < 0){
            System.out.println("Negative Number");
        }
        
    }
}
