
package Modifier;


public class B extends A {
    void fuck(){
        play();
        name="fuck";
        age=45;
        color="yellow";
        display();//Protected method or member can be used in the same package.
        
    }
    public void display(){
    
    };
}
