
package LoopPracticeDemo2;

import java.util.Scanner;


public class ForLoopDemo {
    
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Say how much time you want to see Bangladesh : ");
         int count = input.nextInt();
         int i;// initialization
         for(i = 1; i <= count; i++){
             System.out.println(i + " Bangladesh");
         }
    }
}
