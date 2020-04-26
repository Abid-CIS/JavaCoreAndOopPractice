
package Reverse_Input;

import java.io.IOException;
import java.util.Scanner;


public class Avarage_Cal {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        double A, B, C , Avg;
        A = 0;
        B = 0;
        C = 0;
        boolean LoopResult;
        //do-while loop start:
        do{
            System.out.println("Please enter the first double number: ");
            //If-Else loop start from here:
            if(input.hasNextDouble()){
                A = input.nextDouble();
                LoopResult = true;
            }else{
                System.out.println("Oops!! Correction Please, enter a double number: ");
                LoopResult = false;
                input.next();
            }
        
        }while(!(LoopResult));
        //for second value:
        do{
            System.out.println("Please enter the Second double number: ");
            //If-Else loop start from here:
            if(input.hasNextDouble()){
                B = input.nextDouble();
                LoopResult = true;
            }else{
                System.out.println("Oops!! Correction Please, enter a double number: ");
                LoopResult = false;
                input.next();
            }
        
        }while(!(LoopResult));
        //for third value:
        do{
            System.out.println("Please enter the third double number: ");
            //If-Else loop start from here:
            if(input.hasNextDouble()){
                C = input.nextDouble();
                LoopResult = true;
            }else{
                System.out.println("Oops!! Correction Please, enter a double number: ");
                LoopResult = false;
                input.next();
            }
        
        }while(!(LoopResult));
        
        Avg = (A*B*C)/3;
        System.out.println("Avarage is: "+ Avg);
    }
}
