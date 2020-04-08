
package ArrayListPractice;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayListSorting {
    public static void main(String[] args) {
        ArrayList<Integer>  A = new ArrayList<Integer>(); 
        //value assigning of ArrayList A;
        A.add(0,20);//0,1,2,3,4,5
        A.add(1,12);
        A.add(2,24);
        
        A.add(3,26);
        A.add(4,-7);
        A.add(5,-1);
        //Sorting ArrayList using Collections class:
        Collections.sort(A);
        //After sort , by default Ascending Order
        System.out.println("Ascending Order: " + A);
        //Decending Order: 
        Collections.sort(A, Collections.reverseOrder());
        System.out.println("Decending Order: " + A);
    }
}
