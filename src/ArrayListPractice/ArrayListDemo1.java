
package ArrayListPractice;

import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListDemo1 {
    
    public static void main(String[] args) {
        //Declare an ArrayList:
        ArrayList<Double> number1 = new ArrayList<Double>();
        ArrayList<Double> number2 = new ArrayList<Double>();
        
        //Value Assigning in that arrayList 
        //using .add() method in two ways;
        
        number1.add(0,6.98);//.add(index_No, Value);
        number1.add(1,9.98);
        number1.add(2,5.98);
        number1.add(3,7.98);
        number1.add(4,4.98);
        System.out.println("Number1 size: "+number1.size());
        for (double x: number1) {
            System.out.println(" "+x);
            
            
        }
        //Value assigning
        number2.add(3.4);
        number2.add(5.4);
        number2.add(6.4);
        number2.add(7.4);
        
        
        //Printing arrayList items using iterator() method:
        Iterator itr = number2.iterator();
        
        while(itr.hasNext()){
         
        System.out.println(" number2: "+itr.next());
        
        }
        
        System.out.println("Number2 size: "+number2.size());
        number2.remove(2);//Removing an arryList item from using idex_no
        Iterator itr2 = number2.iterator();
        while(itr2.hasNext()){
            System.out.println("--"+ itr2.next());
        }
       
        System.out.println("After remove: Number2 size: "+number2.size());
        number2.clear();//clear method used to clear all arrayList's Items
        number2.isEmpty();//it will return an boolean value;
        System.out.println(number2.isEmpty());//return->false without .clear()
        //now it will return-> true
        
        
        //System.out.println("ArryList of number1: "+ number1);
       //System.out.println("ArryList of number2: "+ number2);
        
        
        
    }
}
