
package Reverse;
import java.util.Scanner;

public class ArmstrongNumber {
    /*
    Note:
    num = 153 = 1^3+2^3+3^3 = 153 hoy tobe ta armStrong number
    ekta input number k alada alada kore qub kore jog korle 
    jodi result ta input number motai hoy tobe ta armstrong number. 
    */
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter some numbers: ");
        int num = input.nextInt();
        int temp, sum=0, r;
        
        temp = num;
        
        while(temp != 0){
            r= temp % 10;
            sum = sum + r*r*r;
            temp = temp/10; 
        }
        System.out.println();
        System.out.println("The sum after isolation: " + sum);
        if(num == sum)
        {
            System.out.println("Hey!! It is a ArmStrong Number!!!");
        }
        else
        {
            System.out.println("No, No !! It is not a ArmStrong Number!!!");
        }
    }
}
