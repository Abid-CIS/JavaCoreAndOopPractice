
package MathClassPractice;


public class MaxiMiniValueCheck {
    
    public static void main(String[] args) {
        int a= 70;
        int b= 60;
        int s= -30;
        double e= 34.567;
        int absolute; double round;
        round = Math.round(e);
        System.out.println("The round value of e: " + round);
        absolute = Math.abs(s);
        System.out.println("The absolute value is "+ absolute);
       //int max, min;
         //max= Math.max(a,b);
        System.out.println("The maximum vlue is: "+ Math.max(a,b));
        //min= Math.min(a,b);
        System.out.println("The minimum value is: "+Math.min(a,b));
        System.out.println("The absolute value of b "+ Math.abs(b));
        System.out.println(" The asign value is " + Math.asin(e));
        System.out.println(" The atan value is " + Math.atan(e));
        System.out.printf(" The cuberoot value is %.2f\n", Math.cbrt(e));
        System.out.println(" The cos value is " + Math.cos(e));
        System.out.println(" The random value is " + Math.random());
    }
}
