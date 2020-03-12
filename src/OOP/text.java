
package OOP;

public class text {
    
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        
        teacher1.setInformation("Apurba Debnath", 27,"01749417609","Lecturer");
        
        teacher1.displayInfo();
        
        Teacher teacher2 = new Teacher();
        teacher2.setInformation("Soumen chakraborty", 27,"01721378038", "Professor");
        
        teacher2.displayInfo();
    }
}
