
package Interface;


public interface Animal {
    
    String name="Dog";// Only constant variable that means Static final
    String color="Black";// No instance variable in interface
    int age = 40;//
    /*
    Information about interface;
    Interface-> 100% abstract class
    Interface-> only implements classes.
    Interface-> Relationalship betweeen Interface to interface is extends
    Interface-> After extend child Interface will get all abstract methods from parent interface.
    Interface-> class stc- class classname{} but interface interfaceName{}
    Interface-> Interface will have only abstract methods.(without body) 
    and only constant variables.
    Interface-> as it works as 100% abstract class interface doesn't have any object.
    That object can not be created for an interface;
    But only reference variable can be initialized and used for it's implimented classes.
    //Kono interface k kono class implements korle oi interface er sob gulo methods e override
    korte hbe oi class er or error dekhabe.
    //dynamic (Runtime polymorphism applied here)
    //
    ->>>Only 'Interface" supports multiple inheritance..
    but class doesn't support multiple inheritance..
    BY default sob method e ->> abstract Method.
    BY Defaut sob varible e ->> constant variable. Mane (static final) 
    Interface doesn't contain --(constructor);
    Interface cann't have any instance variable only constant variable(static fianl)
    */
   public void display();
   public void call();
   public void talk();
   public void play();
    
}
