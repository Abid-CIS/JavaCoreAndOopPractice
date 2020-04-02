
package LoopPracticeDemo2;

import java.util.Scanner;


public class FoorLoopDemo2 {
    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter the destination number you want");    
    int d = input.nextInt();
    int Totalcount=0;
    
    for( int i = 0; i <= d; i = i+1){
        System.out.println(" i = " + i);
        Totalcount = Totalcount+i;
        System.out.println("Totalcount : " + Totalcount);
    }
        System.out.println("Total: " + Totalcount);
    }
}
