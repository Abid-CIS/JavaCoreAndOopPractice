
package StringBuffer;


public class StringBuffer2 {
    
    public static void main(String[] args) {
        String sd="Lopa mudra";
        StringBuffer sb1 = new StringBuffer("Anisul Ismal");
        StringBuffer sb2 = new StringBuffer("sd");//we can pass a String directly to the StringBuffer's constructor;
        System.out.println(sb2.capacity());
        //Actaul value
        System.out.println("The value is: "+sb1);
        //append() ->>for concatination of Stringbuffer 
        sb1.append(" Islam");
        sb1.append(" "+45);
        System.out.println("The value after append: "+sb1);
        
        //reverse()
        //String gh1 = sb1.reverse().toString();
        //System.out.println("The reverse value is: "+gh1);   
        
        
        // After append checking capacity of StringBuffer();
        //capacity()//default capacity is 16.
        System.out.println("The capacity is: "+sb1.capacity());
        //delete();//koto index theke koto index delete korte chachi
        String sw= sb1.delete(0, 8).toString();//StringBuffer converted to String
        System.out.println("The value of sw: "+sw);
        
        //ensureCapacity();
        //(default*2)+2=16*2+2=34 er besi hle capcity barbe ai rule anujai;
        
        StringBuffer f1 = new StringBuffer();
        int check1 = f1.capacity();
        System.out.println("The default capacity of f1 is: "+check1);
        f1.append("Apurba");
        int check2 = f1.capacity();
        System.out.println("Now capacity after 1st append: "+check2);
        f1.append("Apurba is a good man ");
        int check3 = f1.capacity();
        System.out.println("Now capacity after 1st append: "+check3);
        f1.ensureCapacity(12);// jehetu 12 -34 er modhe exceed kore nai;
        System.out.println(f1.capacity());//34
        f1.ensureCapacity(40);// jehetu 12 -34 er modhe exceed kore nai;
        System.out.println(f1.capacity());//now (old*2)+2= 34*2+2=68=2=70 hbe
        //setLength()
        f1.setLength(5);
        System.out.println("After length set of StringBuffer: "+ f1);
        sb1.setLength(2);
        System.out.println("After length set of StringBuffer: "+sb1);
        
    }
}
