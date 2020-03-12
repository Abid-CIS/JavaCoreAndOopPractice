package TypeCasting;




public class JavaTypeCasting {
    long a=12;
    int b=13;
    long j = a+b;
    //Compatible (Lower dataType to Higher dataType)
    //This conversion is known as explicit conversion which is usually internally done by javac or java compiler;
    //byte->Short->int->long->double(Incompatible conversion or explicit conversion)Lower to higher data type
    //Another name is automatic type promotion in java
    
    int x = 34;
    //byte y=x; same can not converted to byte from int
    //int z=y;// possible loosy conversion from int to long.
    // These type of conversion (widening or Automic conversion)-> lower to higher(without boolean type)
    //Higher to Lower(can be solved by a technique called type casting)
    //This technique called typecasting performs an explicit conversion between incompatible types.
    /*
    compatible conversion's or Automatic type promotion
    1. byte can be promoted to ->short, int,long, float, double.
    2. short can be promoted to->int, long, float, double;
    3. int can be promoted to -> long, float, double.
    4. char can be promoted to-> int, long, float, double.(4)
    5. float-> float, double
    6. double-> none.(only double)
    7. boolean ->none.
    
    
    But Type casting must be done explicitly by the programmer;
    //Compiler will not do it automatically. 
    (type_name)expression;
    here, expression may be a variable, constant or an expression.
    int x;
    long y=90;
    x= (int)y;// Long to integer
    */
    
    long y= (long)56.00;//double to long
    int u =(int)y;//long to int
    //float f = 30.5f;
    long k = 45000000000000000l;
    //int z= (int)f;
    int v=(int)k;
    byte fv=124;
    int yi =56;
    byte hj = (byte)(yi + fv);
    char s='t';
    //int to char
    int in =66;
    char inf = (char)(in+s);//q s er ASCII value int e and n er man 66 mane jog kore df er aschii value jeta ase seta char e convert kore return kore.
    //long to char
    long lo =66l;
    char lf = (char)(lo+s);
//q s er ASCII value int e and n er man 66 mane jog kore df er aschii value jeta ase seta char e convert kore return kore.
    //Float to char
    float f =66;
    char ff = (char)(f+s);//q s er ASCII value int e and n er man 66 mane jog kore df er aschii value jeta ase seta char e convert kore return kore.
    //double to char
    double d =66;
    char df = (char)(d+s);//q s er ASCII value int e and n er man 66 mane jog kore df er aschii value jeta ase seta char e convert kore return kore.
    
    public static void main(String[] args) {
        JavaTypeCasting obj1 = new JavaTypeCasting();
//        byte yt = obj1.hj;
//        char iu = obj1.df;
//        System.out.println(yt);
//        System.out.println(iu);
        System.out.println("int to char:  \n"  + obj1.inf);
        System.out.println("Long to char:  \n"+obj1.lf);
        System.out.println("Float to char:  \n"+ obj1.ff);
        System.out.println("Double to char:  \n"+obj1.df);
        
       
        
    }
    
    
    
    
    
}
