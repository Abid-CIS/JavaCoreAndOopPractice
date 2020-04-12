
package OOP_2;


public class Text3 {
    public static void main(String[] args) {
        Teacher th1 = new Teacher();
        Teacher th2 = new Teacher();
        
        Book b1 = new Book();
        b1.setValue("Mr. Karim", "Sex-History", "33.0", 234);
        b1.displayValue();
        
        
//IF Don't want to assign value is as: In this implementation class.
//        th1.age ="24";
//        th1.name ="Sagor";
//        th1.tele = "01749417609";
//        th1.designation="Principal";
//        
//        System.out.println("Teacher Name is: " + th1.name);
//        System.out.println("Teacher designation is: " + th1.designation);
//        System.out.println("Teacher age is: " + th1.age);
//        System.out.println("Teacher tele is: " + th1.tele);
//        System.out.println();

    th1.setInfo("Mr. Apurba Debnath", 29, "01745434344", "Lecturar");
    th1.displayInfo();
    
    th2.setInfo("Miss. Puja Debnath", 24, "01999999999999", "Lecturer");
    th2.displayInfo();
    }
}
