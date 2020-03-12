
package LoopPractice;


public class ForEachLoopPractice {
    public static void main(String[] args) {
        int[] a ={23,15,22,14,28,30};
        int sum=0;
//        for(int i=0; i<=5; i++){
//            System.out.println( "Index of: "+i+" here a is: "+ a[i]);
//            sum=sum+a[i];
//    }
//        System.out.println("The sum is "+ sum);
    for(int z: a){
        System.out.println("The vaule is: " + z);
        sum = sum+z;
    }
        System.out.println("The sum is :" + sum);
   }
}
