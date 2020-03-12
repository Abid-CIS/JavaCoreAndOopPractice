
package Inheritance.PrivateMember;


public class Dog extends Animal{
    //Except constructor ->> (Methods, instance variables)
    //int wings;// Data binding(fields hides another fields)
    //wings;
   int speed;
   Dog(int wings, int speed, String name, String color, String category ){
        
        super(wings);
        this.speed=speed;
        this.setName(name);
        this.setColor(color);
        this.setCategory(category);
        
        System.out.println("from dog constructor");
   }
   @Override
    int runingSpeed(int decrement){
    return decrement += speed;
    }
   @Override
   void displayInfo(){
        System.out.println("Name: "+ getName());
        System.out.println("Color: "+ getColor());
        System.out.println("category: "+ getCategory());
        System.out.println("wings "+ wings);
        System.out.println();
    }
    
    
    
}
