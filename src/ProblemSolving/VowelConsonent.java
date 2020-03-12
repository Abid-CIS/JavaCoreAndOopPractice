
package ProblemSolving;
import java.util.Scanner;

public class VowelConsonent {
    
    public static void main(String[] args) {
        
        System.out.println("Enter a letter");
        Scanner input = new Scanner(System.in);
        char userInput = input.next().charAt(0);
        
        if(userInput=='a' || userInput=='A'){
        
            System.out.println("Vowel");
        }else if(userInput=='e'|| userInput=='E' ){
        
            System.out.println("Vowel");
        }
        else if(userInput=='i' || userInput=='I'){
        
            System.out.println("Vowel");
        }
        else if(userInput=='o' || userInput=='O'){
        
            System.out.println("Vowel");
        }
        else if(userInput=='u' || userInput=='U'){
        
            System.out.println("Vowel");
        }
        else if(userInput <='0' || userInput >='0'){
            System.out.println("You enter a number");
        }
        else {
        
            System.out.println("Consonent");
        }
    }
}
