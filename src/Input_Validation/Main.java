
package Input_Validation;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A, B, C, D, Avg;
        int count = 0;
        A = 0; B = 0; C = 0; D = 0; Avg = 0;
        do{
            System.out.println("Enter the first double value:");
            if(input.hasNextInt()){
                A = input.nextInt();
                count++;
            }
        
        }while(count == 0);
    }
}
