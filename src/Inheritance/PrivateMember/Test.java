
package Inheritance.PrivateMember;


public class Test {
    public static void main(String[] args) {
        
        Dog d1 = new Dog(230,20,"Kaku","Black","Elsesian");
        d1.runingSpeed(23);
        d1.displayInfo();
        
        Dog d2 = new Dog(260,70,"Kaku","Black","Elsesian");
        d2.runingSpeed(23);
        d2.displayInfo();
        
        BabyDog babeDog1 = new BabyDog(30,10,"pusi","Black","Elsesian","Roma");
        babeDog1.displayInfo();
        babeDog1.runingSpeed(34);
    }
}
