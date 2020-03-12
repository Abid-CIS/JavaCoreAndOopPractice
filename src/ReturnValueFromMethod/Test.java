
package ReturnValueFromMethod;


public class Test {
    public static void main(String[] args) {
        SquareCalculation obj1 = new SquareCalculation();
        SquareCalculation obj2 = new SquareCalculation();
        SquareCalculation obj3 = new SquareCalculation();
        int v= obj1.square(5);
        int f= obj1.square(8);
        int l= obj1.square(4);
        int object2value= obj2.squareCube(5);
        int object3value= obj3.squareCube(8);
        int object3value1= obj3.squareCube(9);
        //System.out.println("The square value is: " + obj1.square(6));
        System.out.println("The square value is: " +v );
        System.out.println("The square value is: " +f );
        System.out.println("The square value is: " +l );
        System.out.println("The squareCube value is: " +object2value );
        System.out.println("The squareCube value is: " +object3value );
        System.out.println("The squareCube value is: " +object3value1 );
        
    }
}
