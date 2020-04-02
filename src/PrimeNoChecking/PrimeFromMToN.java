
package PrimeNoChecking;

import java.util.Scanner;


public class PrimeFromMToN {
    
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            
            System.out.println("Enter the initial number: ");
            int m = input.nextInt();
            
            System.out.println("Enter the final number: ");
            int n = input.nextInt();
            
            int count = 0;
            int totalprime = 0;
            
            for(int i = m; i <= n ; i++){
                
                for(int j =2; j < i; j++ )
                {
                    if(i % j == 0)
                    {
                    count++;
                    break;
                    }
                
                }
                if(count == 0)
                {
                   
                   System.out.println("Prime no: " + i);
                   
                   totalprime++;
               }
               count =0;
            }
             
            System.out.println("Total prime: " + totalprime);
            
    }
    
    
}
