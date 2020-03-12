
package StaticKeyword;


public class UseOfStatic {
    
    public static void main(String[] args) {
        //As UniversityName's value is same for all student obj , so we can make it static
        //It will saves memory and it will help to make a efficient program
        //It also extra memory for every object's variable initialization
        //It helps to make it more efficient if we will use static keyword
        //static variable will be related to class and it's that variable;
        
        Student st1= new Student("Apurba","0170977",24);
        Student st2= new Student("Soumen","012398",27);
        Student st3= new Student("Dipok","017398",27);
        Student st4= new Student("Piu","019398",27);
        Student st5= new Student("Riya","019798",27);
        
        st1.displayInformation();
        st2.displayInformation();
        st3.displayInformation();
        st4.displayInformation();
        st5.displayInformation();
        
        
        
        
        
        
        
        
        
        
        
        
        
//        st1.name = "Apurba";
//        st1.id= "01749417609";
//        st1.age= 29;
//        st1.universityName= "DIU";
        
//        System.out.println("Student Name is: "+ st1.name);
//        System.out.println("Student Name is: "+ st1.id);
//        System.out.println("Student Name is: "+ st1.age);
//        System.out.println("Student Name is: "+ st1.universityName);
    }
}
