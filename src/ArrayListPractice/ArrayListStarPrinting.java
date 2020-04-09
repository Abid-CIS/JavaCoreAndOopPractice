
package ArrayListPractice;

import java.util.ArrayList;


public class ArrayListStarPrinting {
    public static void main(String[] args) {
        
        ArrayList<Character> ch = new ArrayList<Character>();
        ch.add('*');
        ch.add('*');
        ch.add('*');
        ch.add('*');
        ch.add('*');
        ch.add('*');
        ch.add('*');
        ch.add('*');
        ch.add('*');
        ch.add('*');
        
        for(char c: ch){
            System.out.print(" "+ c);
        }
        System.out.println();
    }
}
