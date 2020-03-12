
package Abstraction.ExampleofAbstraction;


public class Test {
    public static void main(String[] args) {
        Shape sp;
        sp = new Circle(2.0);
        System.out.println("The area of circle is: "+sp.area());
        
        sp = new Triangle(34,56);
        System.out.println("The area of Triangle is: "+sp.area());
        
        sp = new Rectangle(2.0,9);
        System.out.println("The area of Rectangle is: "+sp.area());
    }
    
    
}
