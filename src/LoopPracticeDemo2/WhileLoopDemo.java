
package LoopPracticeDemo2;
import java.util.Scanner;


public class WhileLoopDemo {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to show it's factorial!");
        int n = input.nextInt();
        int count = 1;
        int i = 1;
        while(n >= i){
            System.out.println("The value is: " + i);
            count = count*i;
            i++;
            
        }
        System.out.println("The factorial of " + n +" : " + count);
    }
}
