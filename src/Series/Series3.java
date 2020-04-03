
package Series;
import java.util.Scanner;

public class Series3 {
    //1.5+2.5+3.5+4.5+...+n
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the last number: ");
        double n = input.nextDouble();
        double sum = 0;
        for (double i = 1.5; i <= n; i++) {
            System.out.println(i);
            sum = sum+i;
        }
        System.out.println();
        System.out.printf("Total: %.2f\n",sum);
        
    }
}
