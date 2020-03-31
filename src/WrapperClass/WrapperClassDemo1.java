
package WrapperClass;


public class WrapperClassDemo1 {
    
    public static void main(String[] args) {
        //Primitive data type to object 
        //Object to primitive data Type
        //Conversion from (primitive dataType to Object)
        int x = 10;
        Integer z = Integer.valueOf(x);//Here, Integer is wrapper class;
        Integer z1 = x;// compiler bujhe nay j Integer.valueOf();//autoboxing 
        System.out.println("The object x: "+z1);
        System.out.println("The object x: "+z);
        //Conversion from Object to primitive datatype;
        Double d = new Double(89.7);
        double x2 = d;//unboxing
        
        double ze = d.doubleValue();
        System.out.println("value after conversion: "+ x2);
        System.out.println("value after conversion: "+ d);
        
    }
}
