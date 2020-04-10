//There are 3 ways to compare string in java:
//Using these:
//1. equals(), compareTo(), == operator
package StringComparison2;


public class StringCompare {
    
    public static void main(String[] args) {
        String s1 = "apurba";
        String s2 = "apurba";
        String s3 = "ApUrBa";
        //String Comparison1: 
        /*
        Note:\
        java string class provides 2
        methods for compare equality between two string.
        1. equals() 2. equalsIgnoreCase();
        */ 
        boolean a = s1.equals(s2);// it will return a boolean value
        boolean  b = s2.equals(s3);
        boolean c = s2.equalsIgnoreCase(s3);// true
        System.out.println(" Checking original content of both string.: "+a);// true
        System.out.println(" Checking original content of both string.: "+b);// false
        System.out.println("c is: " + c);
         //String Comparison2: 
         /*
         == operator is used to compare reference of two string.
         */
         System.out.println("Comparison using == operator: ");
         if(s1==s2){
             //s1 and s2 provides different references.
             System.out.println("Equal");
         }else{
             System.out.println("Not equal");
         }
        
    }
}
