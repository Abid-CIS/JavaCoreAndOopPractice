
package Series2;
//1*2*3*4*---n
import java.util.Scanner;


public class Series2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the last number ");
        int n = input.nextInt();
        int sum = 1;
        for (int i = 1; i <= n; i=i+2) {
            System.out.print(i + " x ");
            sum = sum*i;
        }
        System.out.println();
        System.out.println(sum);
    }
}
