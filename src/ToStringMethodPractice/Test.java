
package ToStringMethodPractice;


public class Test {
    
    public static void main(String[] args) {
        Animal a1 = new Animal("Dog1",3,"Brown");
        Animal a2 = new Animal("Dog2",4,"Black");
        //Super class Object er modhe toString method ache sob obj er jonno;
        //Sob value print korte hle toString method k call dite hbe;
        System.out.println(a1);
        System.out.println(a2);
    }
}
