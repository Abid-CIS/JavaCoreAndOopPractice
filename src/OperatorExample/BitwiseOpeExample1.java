
package OperatorExample;


public class BitwiseOpeExample1 {
    
    public static void main(String[] args) {
        int x= 32;
        int y=12;
        int z;
        z= x&y;// Bitwise AND
        System.out.println(" x & y = "+z);//Result will be = 0
        z =x|y;// Bitwise OR
        System.out.println("x | y = "+z);//Result will be = 44
        z =x^y;// Bitwise exor
        System.out.println("x | y = "+z);//Result will be = 44
        
    }
}
