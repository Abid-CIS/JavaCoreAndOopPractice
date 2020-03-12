/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecimalFormating;

import java.text.DecimalFormat;
public class A {
    public static void main(String[] args) {
        /*
            There are two ways for formating any decimal vaule after decimal point 
        */
        //DecimalFormat class er object create kore er modhe value pass kore kora jai
        //Printf function use kore -> "% .2f"
        DecimalFormat obj1 = new DecimalFormat("0.00");
        DecimalFormat obj2 = new DecimalFormat("0.000");
        DecimalFormat obj3 = new DecimalFormat("0.0000");
        DecimalFormat obj4 = new DecimalFormat("0.0");
        DecimalFormat obj5 = new DecimalFormat("0.00000000");
        
        double x= 34.567899865;//34.57
        double y= 34.56789000345;
        double z= 34.567898676589;
        double p= 34.5698695887789;
        double q= 34.5642336676789;
        
        System.out.println("Decimal: vale of x: "+obj1.format(x));
        System.out.println("Decimal: vale of y: "+obj2.format(y));
        System.out.println("Decimal: vale of z: "+obj3.format(z));
        System.out.println("Decimal: vale of p: "+obj4.format(p));
        System.out.println("Decimal: vale of q: "+obj5.format(q));
        
        //Like c programming language :
        //Using printf function:
        
        System.out.printf("Decimal: vale of p: %.2f\n",p);
      
    }

    
}
