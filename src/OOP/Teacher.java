
package OOP;

public class Teacher {
    String name;
    int age;
    String telephone;
    String designation;
    
    void setInformation(String n, int m, String tele, String des){
     name= n;
     age=m;
     telephone= tele;
     designation=des;
    
    }
    
    void displayInfo(){
        System.out.println("Name: "+ name );
        System.out.println("Age: "+ age);
        System.out.println("Telephone: "+telephone);
        System.out.println("designation: " +designation);
        System.out.println();
    
    }
    
}
