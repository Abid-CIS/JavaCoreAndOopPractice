
package Series;

import java.util.Scanner;


public class Fabonacci_series {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of series you want to show: ");
        int n = input.nextInt();
        int first_number = 0, second_number = 1, febo;// the constant no always.
        int i = 3;
        while( i <= n){
        febo = first_number + second_number;
        System.out.print(febo + " , ");
        first_number = second_number;
        second_number = febo;
        i++;
        }
        
        
        
        
        
        
        
        
    }
}
