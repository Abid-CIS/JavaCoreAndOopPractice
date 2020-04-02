
package SwitchPractice;

import java.util.Scanner;


public class LetterSpelling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a small letter");
        char ch = input.next().charAt(0);
        
        switch(ch){
            case 'a':
                System.out.println("aaaa");
                break;
            case 'b':
                System.out.println("biieee");
                break;
            case 'c':
                System.out.println("siiii");
                break;
            case 'd':
                System.out.println("deeee");
                break;
            case 'e':
                System.out.println("eeiii");
                break;
            case 'f':
                System.out.println("affff");
                break;
            default:
                System.out.println("Not form a to f");
        }
        
    }
}
