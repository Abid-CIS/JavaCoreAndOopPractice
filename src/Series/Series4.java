
package Series;

import java.util.Scanner;


public class Series4 {
    //1^2+2^2+3^2+4^2+---+n^2
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the last number");
        int n = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " X " + i );
            sum = sum +i*i;
        }
        System.out.println();
        System.out.println("Total: " + sum);
    }
}
