
package MethodOverloading;


public class MethodOverloading {
    
    void add(int a, int b){
        System.out.println(a+b);
        System.out.println();
    }
    void add(){
        
        System.out.println("Fuck you baby!");
    }
    void add(int a, int b, int c){
        System.out.println((a-(b+c)));
        System.out.println();
    }
    void add(double a, double b){
        System.out.println(a-b);
        System.out.println();
    }
    void add(double a, double b, double c){
        System.out.println(a*b*c);
        System.out.println();
    }
//    public static void main(String[] args) {
//        MethodOverloading obj1= new MethodOverloading();
//        obj1.add(10, 20);
//        obj1.add(10.7, 20.9,56.10);
//        obj1.add(10, 20, 90);
//        obj1.add(10.0, 20.9);
//        
//    }
}
