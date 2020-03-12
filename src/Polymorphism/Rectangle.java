
package Polymorphism;

public class Rectangle extends Shape {
    double length, width;
    Rectangle(double length, double width){
        this.length= length;
        this.width= width;
        System.out.println("From rectangle constructor");
    
    }
    @Override
    double area(){
    return length*width;
    }
    
}
