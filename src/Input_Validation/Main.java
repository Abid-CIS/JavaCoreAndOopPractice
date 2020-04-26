
package Input_Validation;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A, B, Avg;
        
        A = 0; B = 0; Avg = 0;
        int count = 1;
        int i = 0;
        while( i == 0 ){
        System.out.println("Enter num to A:");
        A = input.nextInt();
        do{
            if(A < 0 || A >10){
            
                System.out.println("OOps! please enter 0 to 10");
                count =2;
                
            }
        }while(count == 1);
        i++;
        }  
   }
        
}

