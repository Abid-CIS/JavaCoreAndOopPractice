
package ProblemSolving;

import java.util.Scanner;


public class AddDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of m and n");
        double m= input.nextDouble();
        double n= input.nextDouble();
        double sum=0;
        for(double i=m;i<=n; i++){
            System.out.println("i "+i);
            sum=sum+i;
        }
        System.out.println("The sum is: "+sum);
        
        
    }
}
