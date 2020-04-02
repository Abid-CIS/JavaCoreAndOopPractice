
package LoopPracticeDemo2;

import java.util.Scanner;


public class WhileLoopPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int count = input.nextInt();
        
        int initialization = 1;
        
        while( initialization <= count ){
            System.out.println( initialization + " My Bangladesh");
            initialization++;
        }
        
        
    }
  
}
