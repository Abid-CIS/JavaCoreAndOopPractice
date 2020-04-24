
package Exception_handling_in_java;


public class Test {
    public static void main(String[] args) {
        try {
            Stack st1 = new Stack(3);//Calling Stack class constructor.
            st1.push(12);
            st1.push(23);
            st1.push(34);
            st1.display();
            
            st1.pop();
            st1.display();
            
            st1.pop();
            st1.display();
            System.out.println("Top: "+ st1.peek());
            //now, if we again pop(delete) one value from stack , Stack will be empty, then exception will print
            st1.pop();
            st1.display();
            
        }catch(MyException e){
            System.out.println("stack is Empty! Stack underflow"+ e);
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
