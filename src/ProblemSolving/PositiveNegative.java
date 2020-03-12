
package ProblemSolving;

import java.util.Scanner;
public class PositiveNegative {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a digit as you like!");
        int digit = input.nextInt();
        if(digit>0){
            System.out.println("you have entered a positive number!");
        }
        else if(digit<0){
        
            System.out.println("you have entered a negative number!");
        
        }else{
        
            System.out.println("Equal to zero");
        }
       
        }
        
    }
    

