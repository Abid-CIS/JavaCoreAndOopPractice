/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraction.ExampleofAbstraction;

/**
 *
 * @author user
 */
public class Rectangle extends Shape {
    
    double height;
    double width;
    Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }
    @Override
    double area(){
    return height*width;
    }
}
