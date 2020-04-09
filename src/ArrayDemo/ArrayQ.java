
package ArrayDemo;

import java.util.Scanner;


public class ArrayQ {
    public static void main(String[] args) {
        int [] arr = new int[5];
        Scanner input = new Scanner(System.in);
        int i = 0;
        while(i < 5){
            System.out.printf("arr[%d]= ", i);
            arr[i] = input.nextInt();
        i++;
        
        }
        System.out.println("Printing values: ");
        int k = 0;
        while(k < 5){
            System.out.print(" " + arr[k] );
            
        k++;
        
        }
        System.out.println();
    }
}
