
package BitwiseOperator;

import java.util.Scanner;


public class BitwiseOperatorAnd {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        
        System.out.print("Enter the first digit: \n");
        a = input.nextInt();
        System.out.print("Enter the second digit: \n");
        b = input.nextInt();
        
        c = a & b;
        // here ( a integer and b also integer )
        /*
        At first, 
        a will converted to binary number ;
        b will also converted to binary number;
         than a(binary formate) will multiply with b(binary formate) 
        then retuirned binary number will converted to decimal format 
        and it will display as a result.
        */
        // and done multiply between binary numbers.
        System.out.println("A Bitwise B: c is-> " + c);
    }
}
