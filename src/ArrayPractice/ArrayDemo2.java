package ArrayPractice;

import java.util.Scanner;

public class ArrayDemo2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[5];
        int sum = 0;
        int avg;
        System.out.println("Please enter 5 digit");
//     a[0]=input.nextInt();
//     a[1]=input.nextInt();
//     a[2]=input.nextInt();
//     a[3]=input.nextInt();
//     a[4]=input.nextInt();
        for (int z = 0; z < 5; z++) {
            a[z] = input.nextInt();
        }

        //sum=a[0]+ a[1]+ a[2]+ a[3]+ a[4];
        //System.out.println("sum is: " + sum );
        for (int i = 0; i < 5; i++) {
            sum = sum + a[i];
        }
        System.out.println("sum is: " + sum);
        avg = sum / 5;
        System.out.println("avarage is: " + avg);
        int max = a[0];//2,17,1,7,0
        int min =a[0];
        for(int i=1; i<5; i++){
            if(max<a[i]){
                max=a[i];
            }
            
        }
        System.out.println("Maximum number is: " +max);
        for(int i=1; i<5; i++){
            if(min>a[i]){
                min=a[i];
            
            }
        }
        System.out.println("Minium number is: " +min);
    }
}
