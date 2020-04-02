
package LoopPracticeDemo2;

import java.util.Scanner;


public class Namta2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the initial number");
        int m = input.nextInt();
        System.out.println("Enter the final number");
        int n = input.nextInt();
        int multi = 1;
        
        for(int i=m; i <= n; i++){
            
            for (int j = 1; j <= 10; j++) {
                multi = i*j;
                System.out.println( i +" X "+ j + " = " + multi);
            }
            System.out.println("\n\n");
        }
        
    }
}
