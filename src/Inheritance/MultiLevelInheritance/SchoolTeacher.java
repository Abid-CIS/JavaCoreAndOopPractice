
package Inheritance.MultiLevelInheritance;


public class SchoolTeacher extends Teacher  {
    String school;
    SchoolTeacher(String name, int age, String gender, String qualification, String school ){
        super(name,age,gender,qualification);
        this.school =school;
        
    }
    //display2 has hidden here;
    
    void display3(){
        display2();
        System.out.println("School Name: "+ school);
        System.out.println();
    }
}
