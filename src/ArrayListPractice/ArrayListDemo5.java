
package ArrayListPractice;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayListDemo5 {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> num1 = new ArrayList<Integer>();
        //Sorting arraylist:
        num1.add(2);
        num1.add(-10);
        num1.add(30);
        num1.add(40);
        num1.add(-5);
        System.out.println("Num1: "+num1);
        
        // Ascending order(small to large)
        
        Collections.sort(num1);
        System.out.println("After ascending sorting: "+ num1);
        //Decending sorting (Large to samll)
        Collections.sort(num1,Collections.reverseOrder());
        System.out.println("After decending sorting: "+ num1);
                
                
    }
}
