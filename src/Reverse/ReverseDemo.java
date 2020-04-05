
package Reverse;
import java.util.Scanner;
public class ReverseDemo {
    
    public static void main(String[] args) {
        
        int num, r, temp, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter some digits you like! : ");
        num = input.nextInt();
        
        temp = num;
        
       while(temp != 0){
            r = temp % 10;
            sum = sum * 10 + r;
            temp = temp/10;
       }
        System.out.println(sum);
    }
}
