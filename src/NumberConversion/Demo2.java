
package NumberConversion;


public class Demo2 {
    //Decimal to Binary, Octal and HexaDecimalNO;
    public static void main(String[] args) {
        int deci1 = 23;
        String s1 = (Integer.toBinaryString(deci1));//It will return a String.
        System.out.println("The Binary Number is: "+s1);
        
        // Demcimal to octal
        int deci2 = 23;
        String s2=Integer.toOctalString(deci2);
        System.out.println("The Octal Number is: "+s2);
        
        //Decimal to HexaDecimal
        int deci3 = 23;
        String s3 = Integer.toHexString(deci3);
        System.out.println("The hexadecimal number is: "+s3);
        
    }
}
