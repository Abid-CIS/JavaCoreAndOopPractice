/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemSolving;

import java.util.Scanner;

public class CapitalSmallLetter {
    public static void main(String[] args) {
        System.out.println("Enter a letter form a to z");
        Scanner input = new Scanner(System.in);
        char ch = input.next().charAt(0);
        
        if (ch >='a' && ch <='z'){
            System.out.println("small letter");
        }else if(ch >='A' && ch <='Z'){
            System.out.println("Capital letter");
        }else{
            System.out.println("Not a letter");
        }
        
        
        
    }
}
