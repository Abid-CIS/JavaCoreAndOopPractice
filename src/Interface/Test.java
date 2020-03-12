
package Interface;


public class Test {
    public static void main(String[] args) {
        
        Animal a1; 
        a1=new Cat();// Only reference variable can be used , can not create any object of an interface
        //as it is 100% abstract class.
        //It only contains abstract methods, 
        //no intance variable only static final variable(constant variable)
        //One interface can be implements by one class
        //Interface to Interface -> extends(Relationship)
        //class-class-> extends(Relationship)
        //But Interface-class-> implements;(Remember this word);
        
        /*
        ..One class implements by one interface..
        */
        
        a1.call();
        a1.display();
        a1.play();
        a1.talk();
        
        Cat c2 = new Cat();
        c2.g();
        c2.display();
        c2.play();
        c2.talk();
        
    }
}
