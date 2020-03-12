
package ArrayListPractice;

import java.util.ArrayList;
public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        //Value of list1:
        list1.add(23);
        list1.add(20);
        list1.add(25);
        list1.add(26);
        list1.add(29);
        
        System.out.println("List1: "+ list1);
        //Value of list2:
        list2.add(33);
        list2.add(30);
        list2.add(35);
        list2.add(36);
        list2.add(39);
        
        System.out.println("List2: "+ list1);
        //added all items to list3 from list1
        list3.addAll(list1);//jar value add korbo se prothom bondhonir modhe hbe..
        System.out.println("List2: "+ list1);
        
        //Checking list1==list3 or not using equals() methods.
        //Using equals()
        
       boolean check =list3.equals(list1);
       System.out.println("List3 == List1: "+check);
        
    }
}
