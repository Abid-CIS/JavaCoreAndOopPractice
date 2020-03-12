
package ProblemSolving;

import java.util.Scanner;


public class MultiplicationOfMToN {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the highest digit");
        int a = input.nextInt();
        System.out.println("Enter the lowest digit");
        int b = input.nextInt();
        int mul=1;
        for(int i=b; i<=a; i++){
            System.out.println(" i "+i);
            mul = mul*i;
        
        }
        System.out.println("The multiplication is: " +mul);
    }
}
