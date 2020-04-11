
package StringDemo.SubString;


public class CharAt {
    public static void main(String[] args) {
        String s1 = "Apurba";
        char a = s1.charAt(0);
        char b = s1.charAt(1);
        char c = s1.charAt(2);
        char d = s1.charAt(3);
        char f = s1.charAt(4);
        char g = s1.charAt(5);
        System.out.println("single char print: " + a);
        System.out.println("single char print: " + b);
        System.out.println("single char print: " + c);
        //ek sathe print korchi ebar:
        System.out.println(a+b+c);/*
        output will return ASCII value of A , p, u er than jog korbe 
        than ekti integer number return korbe
        
        */ 
    }
}
