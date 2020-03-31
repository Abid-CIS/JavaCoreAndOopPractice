
package Input_Java;
import java.util.Scanner;

public class InputDemoChar {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the first char you like!");
        char c1 = input.next().charAt(1);
        System.out.println("c1 = " + c1);
        
        System.out.println("Enter the 2nd char you like!");
        char c2 = input.next().charAt(2);
        System.out.println("c2 = " + c2);
        //There are two ways to convert char to String
        /*
        Using String class-> String.valueOf(c1);
        Using wrapper class Character-> Character.toString()
        */
        String s1 = Character.toString(c1) + " + " + Character.toString(c2);
        String s2 = String.valueOf(c1) + " + " + String.valueOf(c2);
        System.out.println("s1 : " + s1);
        System.out.println("s2 : " + s2);
        
        
    }
 
}
