
package ProblemSolving;

import java.util.Scanner;


public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the highest value");
        int n = input.nextInt();
        int fact = 1;
        for(int i=n; i>=1;i--){
            System.out.println("i "+i);
            fact = fact*i;
            //10*9*8*7*6*5*4*3*2*1
        }
        System.out.println("The factorial value of n is:" +fact);
    }
}
