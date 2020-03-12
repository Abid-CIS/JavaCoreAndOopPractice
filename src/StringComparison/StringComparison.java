
package StringComparison;


public class StringComparison {
    public static void main(String[] args) {
        String s1 = new String("apu1234");//Object of string class(Non-primitive)
        String s2 = new String("apu1234");// Object of String Class(Non-Primitive)
        //S3and S4 has the same value or content 
        String s3 = "apu1234";//Primitive dataType
        String s4 = "apu1234";//Primitive dataType
        
        /*
        Use of equals() method:
        -->> compare the content between two strings.(Specially used for object comparison)
        */
        System.out.println("Use of equals() method: ");
        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s4));//Compare the content of both strings
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s3));
        System.out.println(s2.equals(s4));
        
        
        /*
        Use of equals operator for premative dataType ==:
        -->> compare the references between two strings.(Specially used for primitive data comparison)
        */
        System.out.println("Use of == operator: ");
        System.out.println(s1 == s2);/*
        s1 refer Non-premative dataType as different object
        s2 refer Non-premative dataType as different object
        Both are different object and also both refered different object
        So, False will return
        */
        System.out.println(s3==s4);
        //Both refer Primitive dataType and also refer same things.
        System.out.println(s1==s4);
        System.out.println(s2==s3);
        
    }
}
