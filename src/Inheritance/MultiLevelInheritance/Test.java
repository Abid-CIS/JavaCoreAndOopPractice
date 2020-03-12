
package Inheritance.MultiLevelInheritance;


public class Test {
    
    public static void main(String[] args) {
      Teacher t1 = new Teacher("Apurba",34,"Male","Shuvra's husband");
      t1.display2();
      Person p1 = new Person("Amit",34,"Male");
      p1.display1();
      
      SchoolTeacher sct1 = new SchoolTeacher("Shuvra",26,"feamle","programmer","Matripith");
      sct1.display3();
      
      BabyTeacher babt1 = new BabyTeacher("Shuvra",26,"feamle","programmer","Matripith","Baby");
      babt1.display4();
      
      
      
    }
    
}
