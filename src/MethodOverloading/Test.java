
package MethodOverloading;


public class Test {
    
    public static void main(String[] args) {
        MethodOverloading obj1= new MethodOverloading();
        obj1.add(10, 20);
        obj1.add(10.7, 20.9,56.10);
        obj1.add(10, 20, 90);
        obj1.add(10.0, 20.9);
        obj1.add();
        
    }
}
