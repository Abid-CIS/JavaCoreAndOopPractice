
package StringComparison2.StringConcatenation;

/*
There are two ways to concate string in java:
1. By String + concatination Operator.
2. By concat() method.u
*/
public class Demo1 {
    public static void main(String[] args) {
        String s1 = "Apurba" + " Debnath";
        String s2 = " Shuvra";
        System.out.println("s1 is: " + s1);
        s1= s1.concat(s2);
        System.out.println("s1 is now: " + s1);
        //String concatenation operator (+) can concat not only string but also primitive values:
        String s = 50+30+"Sachin"+89;
        System.out.println("s is: " + s);
        //Using concat() method.
        String s3 = "Shuvra";
        String s4 = " Debnath";
        String s5 = s3.concat(s4);
        System.out.println("s5 is: " + s5);
    }
}
