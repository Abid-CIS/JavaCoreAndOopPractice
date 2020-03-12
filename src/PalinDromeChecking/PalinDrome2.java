
package PalinDromeChecking;


public class PalinDrome2 {
    //After reverse if one string's content same as previous -> Palindrome
    //Ekti String jodi reverse korar por ow same thake tobe take palindrome bole.
    //String k directly reverse kora jai na, tai StringBuffer class er obj er modhe pass kore
    //Than reverse kore, than abar oi String Buffer k toString dara String e convert korte hbe;
    public static void main(String[] args) {
        String se1 ="ASDFGH";
        StringBuffer sb1 = new StringBuffer(se1);
        String st1=sb1.reverse().toString();
        
        if(st1.equals(se1)){
            System.out.println("Palindrome..");
        }else{
            System.out.println("Not a Palindrome..");
        }
        
    }
}
