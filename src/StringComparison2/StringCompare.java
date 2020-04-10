
package StringComparison2;


public class StringCompare {
    
    public static void main(String[] args) {
        String s1 = "apurba";
        String s2 = "apurba";
        String s3 = "ApUrBa";
        
        boolean a = s1.equals(s2);// it will return a boolean value
        boolean  b = s2.equals(s3);
        System.out.println(" Checking original content of both string.: "+a);// true
        System.out.println(" Checking original content of both string.: "+b);// false
        
        
    }
}
