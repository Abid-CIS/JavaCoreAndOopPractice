
package StaticKeyword;


public class Static_Block {
    
    static int id;
    static String name;
    // Here, Static variables gulo k initialized korar jonno static block use kora hoy
    //Ststic block are used for initializing static variables..
    static{
        id= 101;
        name="Anis";
    }
    void display(){
        System.out.println("The id is "+ id);
        System.out.println("The name "+ name);
    }
}
