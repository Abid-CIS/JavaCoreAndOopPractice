
package Inheritance.PrivateMember;


public class BabyDog extends Dog{
    // babydog extends running speed method;
    
    String babyName;
     BabyDog(int wings, int speed, String name, String color, String category,String babyName ){
        
        
        super(wings,speed, name, color, category);
        this.speed=speed;
        this.setName(name);
        this.setColor(color);
        this.setCategory(category);
        
        System.out.println("from dog constructor");
   }
    @Override
     void displayInfo(){
        System.out.println("Name: "+ getName());
        System.out.println("Color: "+ getColor());
        System.out.println("category: "+ getCategory());
        System.out.println("wings: "+ wings);
        System.out.println("Baby Name: "+ babyName);
        System.out.println();
    }
}
