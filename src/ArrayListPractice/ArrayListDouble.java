
package ArrayListPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class ArrayListDouble {
    public static void main(String[] args) {
        ArrayList<Double> A = new ArrayList<Double>();
        
        A.add(-2.5);
        A.add(-0.5);
        A.add(-1.5);
        A.add(1.5);
        A.add(6.5);
        A.add(70.5);
        A.add(22.5);
        
        //Before sorting value printing using iterator method.
        Iterator objItr = A.iterator();
        while(objItr.hasNext()){
            System.out.print(" "+ objItr.next());
        }
        System.out.println();
        
        //After sorting (value printing using iterator method)
        Collections.sort(A);
        objItr = A.iterator();
        System.out.println("Ascending Order:");
        while(objItr.hasNext()){
            System.out.print(" "+ objItr.next());
        }
        System.out.println();
        //After sorting (value printing using iterator method)
        Collections.sort(A, Collections.reverseOrder());
        objItr = A.iterator();
        System.out.println("Decending Order:");
        while(objItr.hasNext()){
            System.out.print(" "+ objItr.next());
        }
        System.out.println();
    }
}
