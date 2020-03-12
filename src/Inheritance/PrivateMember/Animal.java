
package Inheritance.PrivateMember;


public class Animal {
    private String name;
    private String color;
    private String category;
    int wings;
    Animal(int wings){
        this.wings= wings;
    }
    public void setName(String name){
        this.name= name;
    }
    public String getName(){
        return name;
    }
    public void setColor(String color){
        this.color= color;
    }
    public String getColor(){
        return color;
    }
    public void setCategory(String category){
        this.category= category;
    }
    public String getCategory(){
        return category;
    }
    
    int runingSpeed(int decrement){
    return decrement += decrement;
    }
    void displayInfo(){
        System.out.println("From the animal constractor");
        System.out.println("Name: "+ name);
        System.out.println("Color: "+ color);
        System.out.println("category: "+ category);
        System.out.println("wings: "+ wings);
        System.out.println();
    }
}
