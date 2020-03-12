
package Inheritance.MultiLevelInheritance;


public class Person {
    String name;
    int age;
    String gender;
    
    Person(String name, int age, String gender){
       
        this.name= name;
        this.age= age;
        this.gender= gender;
    
    }
    
    void display1(){
        System.out.println("Method of person");
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Gender: "+ gender);
    }
}
