
package PalinDromeChecking;


public class PalinDromeDemo {
    public static void main(String[] args) {
        String S1= new String("MADAM");
        //String ke direct reverse kora jabe na,
        //StringBuffer e pass kore than para jabe
        StringBuffer s3 = new StringBuffer(S1);
        String S2= s3.reverse().toString(); 
        if(S2.equals(S1)){
            System.out.println("The give String is: Palindrome ");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}
