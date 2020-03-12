
package Encapsulation;


public class Test {
    public static void main(String[] args) {
       Person p1= new Person();
       p1.setName("Apurba Debnath");
       p1.setAge(24);
       p1.setAddress("Dhaka,302/3");
       p1.displaydata();
       
       String ad = p1.getAddress();/*
       
       In oder to use private data form person class(one single unit) 
       we have used getter and setter methods to use it on Test class.
       */ 
       String name= p1.getName();
       int age =p1.getAge();
       
        
        System.out.println("address: "+name);
        System.out.println("address: "+age);
        System.out.println("address: "+ad);
    }
}
