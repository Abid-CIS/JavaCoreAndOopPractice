
package Abstraction;


public class Karim extends MobileUser {
    @Override 
    //Here I have used abstract method sendMessage by overrriden it.
    //Override kore amara eke normal class er moton body bebohar korte pari
    //call(), sendMessage();      
    void sendMessage(){
        System.out.println("Hi! I am Karim.....");
    }
}
