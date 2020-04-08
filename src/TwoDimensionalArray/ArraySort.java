
package TwoDimensionalArray;

import java.util.Arrays;


public class ArraySort {
    public static void main(String[] args) {
        int[] A = {-2,-1, 78, 32,12 , 8};
        //Arrays class er modhe sort method ache
        //Eta use kore ascending ba choto theke boro print korte pari..
        Arrays.sort(A);
        System.out.println("Ascending order of Array \'A\': \n");
        for (int i = 0; i < 6; i++) {
            System.out.print(" "+A[i]);
        }
        System.out.println();
        System.out.println("Decending order of Array \'A\': \n");
        for (int j = 5; j >= 0; j-- ){
            System.out.print(" "+A[j]);
        }
    }
}
