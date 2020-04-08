
package ArrayListPractice;

import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListDemo2 {
    
    public static void main(String[] args) {
        /*
        here we will learn different types of methods for arrayList
        .size(), .clear(),.remove(), .removeAll(), .contains(), .add(), isEmpty() etc.
        .set(indexNo, value)-for replace value.
        .get(indexNo, value)-for getting that value
        .contain(value)-Is this value exits or not.
        */
        ArrayList<Integer> num1 = new ArrayList<Integer>();
        
        num1.add(10);
        num1.add(20);
        num1.add(30);
        num1.add(40);
        num1.add(50);
        //For printing value from an ArrayList
        //Using for each loop;
        for(int x1: num1){
            System.out.println(" "+x1);
        
        }
        //num1.clear();//.clear() method used to clear all items from an arraylist
       int x =num1.set(4,56);
       System.out.println(" Value replaced"+num1.get(4));
        //Using iterator() method ArrayList items printing:
        
        System.out.println();
        System.out.println("Using iterator() method ArrayList items printing:");
        
        Iterator it = num1.iterator();
        while(it.hasNext()){
            System.out.println("num1 : "+it.next());
        
        }
        
        
        
        //For replace//set(indexNo, value)
//        int x4 =num1.set(4,56);
//        System.out.println(" Value replaced"+num1.get(4));
        //For get value//.get()
       System.out.println("Index of 4:"+num1.get(4));// ekhn 4 no index e 56 bosche.
        
        //ArrayList size//.size();
        int y = num1.size();
        System.out.println("The size of arrayList: "+ y);
        //Is a value contains in that arrayList or not--> .contains(value);
        boolean check = num1.contains(90);/*it will return a boolean datatype true or false*/
        System.out.println("Is this value exist in the arraylist?: "+check);
        //isEmpty()->Is the arrayList empty or not
        boolean u = num1.isEmpty();
        System.out.println("Is the arrayList empty or not: "+u);
    }
}
