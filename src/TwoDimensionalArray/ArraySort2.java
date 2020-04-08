
package TwoDimensionalArray;

import java.util.Arrays;
//Java package er Util sub-package er Arrays namok class e.sort method

public class ArraySort2 {
    public static void main(String[] args) {
        String [] names = {"Rahim", "Karim", "Jashim", "Apurba", "Babul"};
        Arrays.sort(names);
        System.out.println("Ascending Order: ");
        for(int i = 0; i < 5; i++){
            System.out.print("\t " + names[i]);
        }
        System.out.println("\n");
        System.out.println("Desecding Order: ");
        for (int i = 4; i >= 0; i--) {
            System.out.print(" \t" + names[i]);
        }
    }
}
