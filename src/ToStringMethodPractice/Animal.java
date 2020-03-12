
package ToStringMethodPractice;


public class Animal {
    String name;
    int age;
    String color;
    
    Animal(String name, int age, String color){
        this.name= name;
        this.age= age;
        this.color=color;
    }
    public String toString(){
    return "Name: "+name+"\nAge: "+ age+"\nColor: "+ color;
    }
}
