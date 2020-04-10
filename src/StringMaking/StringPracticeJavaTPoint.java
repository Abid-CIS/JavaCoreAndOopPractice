
package StringMaking;


public class StringPracticeJavaTPoint {
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
    }
}
