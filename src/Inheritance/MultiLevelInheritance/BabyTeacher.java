
package Inheritance.MultiLevelInheritance;


public class BabyTeacher extends SchoolTeacher{
    String babyName;
    BabyTeacher(String name, int age, String gender, String qualification, String school,String babyName){
    
           super(name,age,gender,qualification, school);
           this.babyName=babyName;
    }
    
    void display4(){
        display3();
        System.out.println("Baby Name: "+ babyName);
        System.out.println();
    }
}
