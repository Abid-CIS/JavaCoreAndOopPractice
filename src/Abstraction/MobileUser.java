
package Abstraction;


public abstract class MobileUser {
    //This abstract class only contains abstract method , there is no
    //Non-abstract method (So 100% abstraction works here)
    /*
    Now, if there will be one non abstract method than , 
    it cannot be 100% abstraction.
    It will be mixed up. suppose I have created one non-abstract method here,
    
    */
    //Non-abstract:
    void call(){
        System.out.println("calling");
    }
    abstract void sendMessage();// abstract method has no body.
}
