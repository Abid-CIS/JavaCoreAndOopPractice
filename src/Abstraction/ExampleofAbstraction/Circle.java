
package Abstraction.ExampleofAbstraction;


public class Circle extends Shape{
    
    double radius;
    Circle(double radius){
        this.radius= radius;
    }
    
    @Override
    double area(){
    return 3.1416*radius*radius;
    }
    
}
