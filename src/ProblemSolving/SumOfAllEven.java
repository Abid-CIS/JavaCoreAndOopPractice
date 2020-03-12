package ProblemSolving;

import java.util.Scanner;

public class SumOfAllEven {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the highest number ");
        int n = input.nextInt();
        System.out.println("Enter the lowest number");
        int m = input.nextInt();
        int sum = 0;
        for (int i = m; i <= n; i =i+1) {
            if (i % 2 == 0){
                System.out.println("i in if "+i);
                sum = sum + i;
            }
            
        }
        System.out.println("The sum of all even number from m to n is " + sum);
    }
}
