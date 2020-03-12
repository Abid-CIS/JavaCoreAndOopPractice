
package Abstraction;


public class TextAbstraction {
    
    public static void main(String[] args) {
        MobileUser mu1; 
        //new MobileUser();//Abstract class can not be instantiated;
        //ER mane holo, abstract class er object create kora jabe na;
        /*
        Only referance variable declare kora jabe and use kora jabe
        Only referance variable use kore onno class er object create kora jabe..
        */
        
        mu1 = new Rahim();// Dynamic method dispatch(Runtime polymorphism)
        mu1.sendMessage();//Dynamic method dispatch(Runtime polymorphism);
        mu1.call();
        
        mu1 = new Karim();
        mu1.sendMessage();
        mu1.call();
        
        
    }
}
