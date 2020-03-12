
package StaticKeyword;


public class StaticMethod {
    
    void displayinfo(){
        System.out.println("This is non-static method");
        
    }
    static void display2(){
        System.out.println("This is static method");
        
    }
    
    public static void main(String[] args) {
        //Non-Static method k use korte object create korte hbe
        StaticMethod obj1 = new StaticMethod();
        obj1.displayinfo();
        StaticMethod.display2();
        
    }
}
