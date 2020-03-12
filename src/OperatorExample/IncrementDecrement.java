
package OperatorExample;


public class IncrementDecrement {
    
    public static void main(String[] args) {
        int x,y;
        x=25;
        y=x++;//postfix Increment//25
        System.out.println("Y = "+ y);
        y=++x;//prefix Increment // 27
        System.out.println("Y = "+ y);
        y=--x;//pre Decrement//26
        System.out.println("Y = "+ y);
        y=x--;//post decrement//26
        System.out.println("Y = "+ y);
        y=--x;//pre decrement//24
        System.out.println("Y = "+ y);
        y=x++;//post decrement//24
        System.out.println("Y = "+ y);
        y=x; //25
        System.out.println("Y = "+ y);
    }
}
