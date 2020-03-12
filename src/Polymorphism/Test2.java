
package Polymorphism;


public class Test2 {
    public static void main(String[] args) {
//        Shape s1 = new Shape();
//Runtime polymorphism(Dynamic method dispatch)
//        Shape s2= new Rectangle(24, 25);
//        Shape s3 = new Triangle(32,34);

    Shape[] s = new Shape[5];
    
    s[0] = new Shape();
    s[1]= new Rectangle(24.0, 25.0);
    s[2]= new Triangle(32.0,34.0);
    s[3]= new Triangle(38.0,378.98);
    s[4]= new Triangle(32.678,399.45);
    
//    /*
//        Here,
//        Shape[]= dataType array (non premative) class
//        s= array name
//        new()= allocate new area in  shape class area
//        new shape() = shape class object 
//        but here new shape[3], 
//        here 3 is the lenngth of array;
//    */
///*Bar bar kn super class er 
//object create korba hmm, 
//ekta array use kore korlai to paro*/
        
//        System.out.println(s[0].area());
//        System.out.println(s[1].area());
//        System.out.println(s[2].area());
    //Here index no->> 0 to 4;
        for (int i = 0; i<=4; i++) {
            System.out.printf("Area: %.2f\n",s[i].area());
        }
        
        
    }
}
