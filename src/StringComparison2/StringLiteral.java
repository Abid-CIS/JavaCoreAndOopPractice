
package StringComparison2;

import StringMaking.*;


public class StringLiteral {
    public static void main(String[] args) {
        //How to create String in java?
        /*
        Java string is immutable or Unmodifiable or Unchangeable
        Onec string object is created it's data or state cann't be changed. 
        There are 2 ways to create String in java?
        1. By String literal.
        2. By new keyword.
        */
        String s = "Sachin";//By string literal.
        s.concat("Tendulkar"); //appends the string at the end.
        //a new object is created with "Sachin Tendulkar" in Heap (string constant pool)
        System.out.println("S : " + s );
        // assing values to s reference variable.  
        s=s.concat("Tendulkar");
        System.out.println("After calling referance variable of s object: \n"+ s);
        
        //Creating string using new Keyword:
        /*
        Here, One new object will be  created by new keyword. 
        non-pool in heap memory.(an object will create by new keyword)
        */
        String s2 = new String("Sachin");
        System.out.println(s2);
        String s3 = new String("Tendulkar");
        System.out.println(s3);
        //converting / passing charecter array to string:
        char[] ch = {'a', 'p', 'u', 'r', 'b', 'a'};
        String s4 = new String(ch);
        System.out.println("s4 is: " + s4);
        char[] ch2 = {'p', 'a', 'r','t','h','o'};
        String s5 = "ch2";
        System.out.println("s5 is: " + s5);//result: ch2
        
    }
}
