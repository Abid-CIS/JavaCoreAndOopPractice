
package OOP_2;

public class Teacher {
    String name;
    int age;
    String tele;
    String designation;
    
    public void setInfo(String name, int age, String tele, String desig){
        this.name = name;
        this.age =  age;
        this.tele = tele;
        this.designation = desig;
    }
    public void displayInfo(){
        System.out.println("Nmae: " + name);
        System.out.println("Telephone_No: " + tele);
        System.out.println("Designation: " + designation);
        System.out.println("Age: " + age);
        System.out.println();
        
    }
}
