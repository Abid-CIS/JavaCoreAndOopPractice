
package PrimeNoChecking;

import java.util.Scanner;


public class PrimeNoCheckingDemo {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a positive number");
    int m = input.nextInt();
    int count = 0;
    for(int i = 2; m > i; i++ ){
        if(m % i == 0 ){
          
            count++;
            break;
        }
    }
    if(count == 0 ){
        System.out.println("Prime no");
    }else if( count != 0){
        System.out.println("Not a prime no");
    }
        
    }
}
