
package Reverse;
import java.util.Scanner;

public class PalindromeCheck {
    //121 after reverse 121(So it is palindrome number)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter some numbers: ");
        int num = input.nextInt();
        int temp, sum=0, r;
        
        temp = num;
        
        while(temp != 0){
            r= temp % 10;
            sum = sum*10 + r;
            temp = temp/10; 
        }
        System.out.println();
        System.out.println("After reverse: " + sum);
        if(num == sum)
        {
            System.out.println("It is a Palindrome Number!!!");
        }
        else
        {
            System.out.println("It is not a palindrome Number!!!");
        }
    }
}
