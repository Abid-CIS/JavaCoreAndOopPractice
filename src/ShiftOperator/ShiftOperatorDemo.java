
package ShiftOperator;


public class ShiftOperatorDemo {
    
    public static void main(String[] args) {
        //left shift
        int a = 32;
        int b = 16;
        int c = a >> 2;// Right shift means 2 dia 2 bar vag(2 die 2 bar vag)
        int d = a << 3; // Left shift means 32 *2*2*2(2 die 3 bar gun)
        
        System.out.println("The value c : "+ c );
        System.out.println("The value c : "+ d );
    }
}
