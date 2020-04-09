
package ArrayListPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class ArrayListPracticeUltimate {
    public static void main(String[] args) {
        ArrayList<Double> db = new ArrayList<Double>(); 
        ArrayList<Double> db1 = new ArrayList<Double>(); 
        ArrayList<Integer> inte = new ArrayList<Integer>();
        
        inte.add(34);
        inte.add(45);
        inte.add(54);
        inte.add(32);
        inte.add(11);
        
        db.add(23.5);
        db.add(24.5);
        db.add(25.5);
        db.add(26.5);
        db.add(27.5);
        //Before sorting double value
        db1.addAll(db);
        //Printing value of db1:
        Iterator itr = db1.iterator();
        System.out.println("Before sorting Double value printing: ");
        while(itr.hasNext()){
            System.out.print(" "+itr.next());
        }
        System.out.println();
        
        Collections.sort(db1);
        Iterator itr1 = db1.iterator();
        //After sorting double value printing:
        System.out.println("After sorting(Accen) double value: \n");
        while(itr1.hasNext()){
            System.out.print(" " + itr1.next());
        }
        System.out.println();
        
        //Decending order:
        Collections.sort(db1, Collections.reverseOrder());
        Iterator itr2 = db1.iterator();
        System.out.println("After sorting(Dccen) double value: \n");
        while(itr2.hasNext()){
            System.out.print(" " + itr2.next());
        }
        System.out.println();
        //Before sorting
        itr = inte.iterator();
        System.out.println("Integer value printing: ");
        while(itr.hasNext())
        {
            System.out.print(" " + itr.next());
        }
        System.out.println();
        //Ascending Order(Sorting Integer value:)
        Collections.sort(inte);
        
        itr = inte.iterator();
        System.out.println("Integer value printing in Accending Order: ");
        while(itr.hasNext())
        {
            System.out.print(" " + itr.next());
        }
        System.out.println();
        //Decending Order(Sorting Integer value:)
        Collections.sort(inte, Collections.reverseOrder());
        
        itr = inte.iterator();
        System.out.println("Integer value printing in Decending Order: ");
        while(itr.hasNext())
        {
            System.out.print(" " + itr.next());
        }
        System.out.println();
    }
}
