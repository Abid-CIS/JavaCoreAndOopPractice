
package LoopPracticeDemo2;

import java.util.Scanner;


public class DoWhileLoop {
    
    public static void main(String[] args) {
     
     Scanner input = new Scanner(System.in); 
     System.out.println("Enter a value of n: ");
     int n = input.nextInt();
     int i=1;
     int count = 1;
     do{
     
         System.out.print("i = " + i + " * \b" );
         count = count*i;//2
         System.out.println(" Now count = " + count);
         i++;//2
     }while(i <= n);
        
    }
}
