
package StringBuffer1;


public class Palindromechecking {
    public static void main(String[] args) {
        String s1 = "kaka";
        String s2 ="Madam";
        
        StringBuffer sb1 = new StringBuffer(s2);
        String s3 = sb1.reverse().toString();
        //checking value using .equals method.
        if(s3.equalsIgnoreCase(s2)){
            System.out.println("Hi, hi, now Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}
