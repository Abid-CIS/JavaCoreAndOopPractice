
package NumberConversion;


public class Demo1 {
    
    public static void main(String[] args) {
        //Binary, Octal, HexaDecimal To->>>>>(Decimal)
        
        String s1 = "10110110";
        int dec1 = Integer.parseInt(s1, 2);// The second portion is for Base
        System.out.println("Binary number to Decimal Number conversation: ");
        System.out.println(" Decimal Number : "+ dec1);
        
        //Octal to Binary 
        String s2 = "656";
        int dec2 = Integer.parseInt(s2,8);
        System.out.println("The number from octal to decimal: "+ dec2);
        //HexaDecimal to Binary
        String s4 ="A";
        int dec3 = Integer.parseInt(s4,16);
        System.out.println("The decimal from HexaDecimal is : "+dec3);
    }
}
