
package Encapsulation;


public class Person {
    private String name;
    private int age;
    private String address;
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setAddress (String address){
        this.address= address;
    }
    public String getAddress(){
        return address;
    }
    
    void displaydata(){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Address: "+ address);
        System.out.println();
    }
    
}
