
package FromateSpecifier;

public class FormateSpecifierDemo {
    public static void main(String[] args) {
        boolean b = true;
        char c = 'S';
        short s = 234;
        byte by = 23;
        int d = 3456;
        long l = 458969898975585L;
        /*
        we need to put suffix as L to treat the literal 
        2147483648 as long type by java compiler.
        */
        float f = 0.895f;
        double g = 67.890;
        
        System.out.printf("The boolean value is: %b\n" , b);
        System.out.printf("The Char value is: %c\n" , c);
        System.out.printf("The byte value is: %d\n" , by);
        System.out.printf("The Short value is: %c\n" , s);
        System.out.printf("The Integer value is: %d\n" , d);
        System.out.printf("The Long value is: %d\n" , l);
        System.out.printf("The float value is: %f\n" , f );
        System.out.printf("The Double value is: %f\n " , g);
    }
}
