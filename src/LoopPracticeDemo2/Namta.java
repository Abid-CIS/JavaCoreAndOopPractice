
package LoopPracticeDemo2;

import java.util.Scanner;


public class Namta {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the value you want");
        int n = input.nextInt();
        int multiply = 1;
        for(int i =1; i<=10; i++){
            multiply = n*i;
            System.out.println( n + " X " + i + " = " + multiply);
        }
        
    }
}
