
package OperatorExample;


public class BitwiseShiftOperator {
    
    public static void main(String[] args) {
        int a, b, c;
        a=32;
        b= a>>2;// 32/2 =16, 16/2 = 8, result will be 8;
        System.out.println("Bitwise Shift right of (a >> 2)"+b);
        c= a<<3;// 32*2 =64, 64*2= 128, 128*2=256; Result will be 256;
        System.out.println("Bitwise Shift left of (a << 2)"+c);
        
    }
}
