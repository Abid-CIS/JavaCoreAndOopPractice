
package ArrayDemo;


public class ArrayDemo1 {
    public static void main(String[] args) {
       int [] number; // Array Declaration
       number = new int[5];// Array creation using new keyword
       number[0] = 10;// Assigning value to array.
       number[1] = 20;
       number[2] = 30;
       number[3] = 40;
       number[4] = 50;
       
       int sum = number[0] + number[1] + number[2] + number[3] + number[4];
       
       System.out.println("The Size of array: " + number.length);
       System.out.println("sum is: " + sum);
       
        
    }
 
}
