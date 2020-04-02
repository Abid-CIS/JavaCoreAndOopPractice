
package LoopPracticeDemo2;


public class ForEachLoopPractice {
    
    public static void main(String[] args) {
        int arr [] = {34, 30, 45, 42, 37, 36, 45};
        int sum = 0;
        for( int store : arr){
            System.out.println(store);
            sum = sum + store;
        }
        System.out.println("Total is: " + sum );
    }
}
