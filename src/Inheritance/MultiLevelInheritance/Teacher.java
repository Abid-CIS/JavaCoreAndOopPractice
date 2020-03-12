
package Inheritance.MultiLevelInheritance;


public class Teacher extends Person {
 // Here Teacher class, Inherit Person class.
    //(instance variables, methods) of person class comes here ..
    //->>name, age, gender, display1()
  //Instance variable of teacher class.: qualification
 String qualification;
    
    Teacher(String name, int age, String gender, String qualification ){
        super(name, age, gender);
        this.qualification= qualification;
    }
   
   
   
    void display2(){
        display1();
        
        System.out.println("Qualification: "+ qualification);
        System.out.println();
    }
    
}
