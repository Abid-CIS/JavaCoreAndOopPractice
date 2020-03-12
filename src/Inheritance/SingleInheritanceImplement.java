package Inheritance;

public class SingleInheritanceImplement {

    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        Teacher t2 = new Teacher();
        Teacher t3 = new Teacher();
        Teacher t4 = new Teacher();
        Teacher t5 = new Teacher();
        Person p1 = new Person();

        p1.setName("Rothosri");
        p1.setAge(34);
        p1.setPhone("017678098");
        p1.setSex("Male");
        p1.setProfession("Person");
        p1.displayInfo();
        
        
        
        
        //now we are going to assign value in instance variables of one object
        t5.setName("apurba");
        t5.setAge(25);
        t5.setPhone("01749417609");
        t5.setSex("Male");
        t5.setProfession("Teacher5");
        t5.displayInfo();
        

        t4.setName("Sagor");
        t4.setAge(45);
        t4.setPhone("01749417608");
        t4.setSex("Male");
        t4.setProfession("Teacher4");
        t4.displayInfo();
        
        t3.setName("Apu");
        t3.setAge(25);
        t3.setPhone("01749417606");
        t3.setSex("Male");
        t3.setProfession("Teacher3");
        t3.displayInfo();
        
        System.out.println(t1 instanceof Person);
        System.out.println(p1 instanceof Person);
        System.out.println(t3 instanceof Teacher);
        System.out.println(t3 instanceof Person);

    }

}
