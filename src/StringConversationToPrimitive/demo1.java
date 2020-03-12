
package StringConversationToPrimitive;


public class demo1 {
    public static void main(String[] args) {
        
        //String to Primitive
        //Primitive to String
        
        // Here, we have to use wrapper classes;
        
        //->>Conversion from Primitive to string:
        
        double d = 34.56;
        //now we are going to make this double as String
        String s1 = Double.toString(d);
        System.out.println("The String is: "+s1);
        System.out.println();
        
        //Now we want to convert an integer to string
        int c = 56;
        String g = Integer.toString(c);//ekhane class ti type hisabe use hoche;
        System.out.println("The string is: "+g);
        //float to string
        float f = 34.09f;
        String h = Float.toString(f);
        System.out.println("The String is: "+f);
        
        //String to primitive dataType:
        String t1 = "89";
        int y = Integer.parseInt(t1);//one way->>.parseInt(), .parseDouble()
        int s3 = Integer.valueOf(t1);//2nd way >> wrapperClass.valueOf();
        System.out.println("After conversion String to integer: "+y);
        
        //Binary , octal, hexaDecimal to decimal;
        
        //Binary to decimal;
        String f1 = "1010";
        int deci = Integer.parseInt(f1, 2);
        System.out.println("Binary to decimal: "+deci);//Here, Base is 2;
        
        //Octal to decimal;
        String octal1 = "635";
        int deci2 = Integer.parseInt(octal1, 8);//Here, Base is 8;
        System.out.println("The octal to decimal number is: "+deci2 );
        //Hexadecimal to decimal
        String hexA = "A";
        int deci3 = Integer.parseInt(hexA,16);//Here, base is 16
        System.out.println("HexaDecimal to Decimal   " + deci3);
        
        //Hexadecimal to decimal
        String hexF = "F";
        int deci4 = Integer.parseInt(hexF,16);//Here, base is 16
        System.out.println("HexaDecimal to Decimal   " + deci4);
        
        
    }
}
