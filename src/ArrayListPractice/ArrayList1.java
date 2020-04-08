
package ArrayListPractice;

import java.util.ArrayList;


public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        ArrayList<String> names = new ArrayList<String>(); 
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(0, 50);
        
        System.out.println("Printing values of arrayList->>");
        for(int x: num){
            System.out.print(" "+ x);
        }
        System.out.println();
        
        names.add("Apurba");// Now we are going to priint all index's value
        names.add("Puja");//So, we have required a loop;
        names.add("Shuvra");
        names.add("Rothosri");
        names.add("Shuvs");
        
        for(String nam: names){
            System.out.print(" "+nam);
        }
        System.out.println();
    }
    
}
