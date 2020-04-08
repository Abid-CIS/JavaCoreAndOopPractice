
package ArrayListPractice;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        ArrayList<String> names = new ArrayList<String>(); 
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(1, 50);// assigning one value in multiple area();
        
        System.out.println("Printing values of arrayList->> \n");
        
        for(int x: num){
            System.out.print(" "+ x);
        }
        System.out.println();
        //----------------------names--------------
        //String Arraylist Declarations();
        names.add("Apurba");// Now we are going to priint all index's value
        names.add("Puja");//So, we have required a loop;
        names.add("Shuvra");
        names.add("Rothosri");
        names.add("Shuvs");
        //Using for each loop for printing array items:
        System.out.println("String Array printing: \n");
        for(String nam: names){
            System.out.print(" "+nam);
        }
        System.out.println("\n\n");
        //Using iterator() method for printing array items:
        System.out.println("Using Iterator: ");
        System.out.println("\n");
        Iterator itr = names.iterator();
        while(itr.hasNext()){
            System.out.print(" "+ itr.next());
        }
        System.out.println();
        System.out.println("Before remove arraylist size: " + names.size());
        boolean s =names.isEmpty();// return a boolean either true or false
        System.out.println("arraylist empty: "+s);
        
        names.remove(4);
        System.out.println("After remove: ");
        
        for(String x: names){
            System.out.print(" "+ x);
        }
        System.out.println();
        System.out.println("After remove size is: "+names.size());
        
        
        names.clear();
        System.out.println("After clear : ");
        boolean s1 =names.isEmpty();
        System.out.println("arraylist empty: "+s1);
    }
    
}
