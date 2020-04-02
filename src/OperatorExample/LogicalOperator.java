
package OperatorExample;

import java.util.Scanner;


public class LogicalOperator {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter you like!");
        
        char ch = input.next().charAt(0);
        // Using logical OR operator here.
//        if(ch == 'a' || ch == 'A'){
//            System.out.println("Vowel");
//        }else if(ch == 'e' || ch == 'E'){
//            System.out.println("Vowel");
//        }else if(ch == 'i' || ch == 'I'){
//            System.out.println("Vowel");
//        }else if(ch == 'o' || ch == 'O'){
//            System.out.println("Vowel");
//        }else if(ch == 'u' || ch == 'U'){
//             System.out.println("Vowel");
//        }else{
//            System.out.println("Consonent");
//        }
        
        if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("Vowel");
        }else if(ch == 'A' || ch == 'E' || ch == 'i' || ch == 'O' || ch == 'U' ){
            System.out.println("Vowel");
        }else{
            System.out.println("Consonent");
        }
        
    }
}
