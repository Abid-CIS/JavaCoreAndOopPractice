
package ArrayListPractice;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> num1 = new ArrayList<Integer>();
        ArrayList<Integer> num2 = new ArrayList<Integer>();
        ArrayList<Integer> num3 = new ArrayList<Integer>();
        
        num1.add(23);
        num1.add(24);
        num1.add(26);
        num1.add(27);
        num1.add(28);
        
        // set value or replace value in num1 array
        //num1.set(indexNo,value);
        //to get that specific value: num1.get(indexNo,value);
        num1.set(0,19);
        System.out.println(num1.get(0));
        System.out.println("The number 1: "+ num1);
        //Using iterator() arrayList items printing..
        System.out.println("Printing Number1 using iterator method: ");
        Iterator ite = num1.iterator();
        while(ite.hasNext()){
            System.out.print(" "+ ite.next());
        }
        System.out.println();
        // use of addAll() method: 
        num3.addAll(num1);
        System.out.println("The number 3: "+ num3);
        // use of all method which returns true
        boolean check = num1.equals(num3);
        System.out.println("Equality checking: "+ check);
        boolean contain = num1.contains(78);
        System.out.println("Existing value: "+contain);
        boolean emCheck = num3.isEmpty();
        System.out.println("Empty: " +emCheck);
        
        System.out.println("Size or length checking: ");
        System.out.println("ArrayList Size: "+ num1.size());
        System.out.println("ArrayList Size: "+ num3.size());
        System.out.println("ArrayList Size: "+ num2.size());
        
        
    }
}
