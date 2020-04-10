//There are 3 ways to compare string in java:
//Using these:
//1. equals(), compareTo(), == operator
package StringComparison2;


public class StringCompare {
    
    public static void main(String[] args) {
        String s1 = "apurba";
        String s2 = "apurba";
        String s3 = "ApUrBa";
        String s4 = new String("apurba");// S4 refers to an instance created in non pool.
        String s6 = new String("apurba");// different instance created in non pool.
        String s5 = "Sazib";
        //String Comparison1: 
        /*
        Note:\
        java string class provides 2
        methods for compare equality of content(values) between two string.
        1. equals() 2. equalsIgnoreCase();
        */ 
        boolean a = s1.equals(s2);// it will return a boolean value
        boolean  b = s2.equals(s3);
        boolean c = s2.equalsIgnoreCase(s3);// true
        boolean d = s2.equals(s4);//true
        System.out.println(" Checking original content of both string.: "+a);// true
        System.out.println(" Checking original content of both string.: "+b);// false
        System.out.println("c is: " + c);//true
        System.out.println("d is: " + d);//true
        System.out.println("s4 and S5: " + s4.equals(s5));//false
         //String Comparison2: 
         /*
         == operator is used to compare reference of two string not values.
         */
         System.out.println("Comparison using == operator: ");
         if(s1==s4){
             //s1 and s4 provides different references.
             System.out.println("Equal");
         }else{
             System.out.println("Not equal");
         }
         // here, A reference instance of pool object will returned as S2
         //reason2: As, String value already exist in the pool(String constant pool)
         // in heap memory;
         System.out.println("String value already exist in the pool:");
         if(s1==s2){
             //s1 and s2 provides same references because reason2
             System.out.println("Equal");
         }else{
             System.out.println("Not equal");
         }
         //String value already exist in the pool
         System.out.println("Check:---");
         if(s4==s6){
             //s4 and s6 provides different references as they are differnt obj.
             System.out.println("Equal");
         }else{
             System.out.println("Not equal");
         }
         /*
         note:
         comparison3 :
         Using compareTo() mthod
            here, compareTo() method compare values of 2 
            strings laxicographically and return an integer vaule 
            based on :
            1st string is less than, equal to or 
            greater than second string(The way words are alphabetically ordered)
            Suppose S1 and S2 are two string variables: if:
            s1 == s2;// will return 0
            s1 > s2: positive value//such as 1
            s1 < s2; will return negative value -1
            
         
         */
         
         String a1 = "Sachin";// length 6
         String a2 = "Sachin";
         String a3 = "Ratan";
         String a4 = "Rahimull";// length 7
         String a5 = new String("Sachin");
         
         //compare values laxicographically;
         System.out.println(a1.compareTo(a2));// return 0
         System.out.println(a1.compareTo(a3));// return 1 as a1 > a2
         
         System.out.println(a4.compareTo(a1));// return -1 as a1 < a2
         
         
         
        
    }
}
