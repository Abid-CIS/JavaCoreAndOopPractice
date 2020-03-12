
package StaticKeyword;


public class Student {
    
   String name; //These are instance variable
   String id; 
   int age;
   static String universityName ="DIU";// Making this variable as static, I want to mange memory location.
   //This static variable directly related to class not to any object of it.
   //The static variable make some space in class area of memory
   //The static variable is indirectly refered by all objects of this class.
   Student(String n, String m, int d){
        name=n;
        id= m;
        age=d;
        
   
   
   }
    void displayInformation(){
        System.out.println("Student Name is: "+ name);
        System.out.println("Student Name is: "+ id);
        System.out.println("Student Name is: "+ age);
        System.out.println("Student Name is: "+ universityName);
        System.out.println();
    }
            
}
