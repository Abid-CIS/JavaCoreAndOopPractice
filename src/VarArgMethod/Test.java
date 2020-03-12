
package VarArgMethod;


public class Test {
    public static void main(String[] args) {
        AddDemo obj1 = new AddDemo();
        obj1.add(10,10);
        obj1.add(10,20,30);
        obj1.add(10,20,30);
        obj1.add(10,20,30,60,90,80);
        obj1.add(10,20,30,60,90,80, 78, 90, 87, 6, 90,6);
        obj1.add(10,20,30,60,90,80,9090, 78, 8, 90, 6, 8, 9, 8, 0, 4, 3);
        obj1.add(10,20,30,60,90,80);
        
        
    }
}
