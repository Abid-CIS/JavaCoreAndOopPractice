package ArrayDemo;

import java.util.Scanner;

public class Array2loop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] number = new double[5];

        System.out.println("Please enter 5 numbers: ");
        int i = 0;
        double sum = 0;
        double avarage;
        while (i <= 4) {
            number[i] = input.nextDouble();
            System.out.print(number[i] + " ");
            sum = sum + number[i];
            i++;
        }
        System.out.println();
        System.out.println("The sum is: " + sum);
        avarage = sum / 5;
        //Maximum and minimum number calculation.
        double max = number[0];
        double min = number[0];
        for (int j = 1; j < 5; j++) {
            if( number[j] > max){
             max = number[j];
            }
        }
        for (int j = 1; j < 5; j++) {
            if( number[j] < min){
             min = number[j];
            }
        }
        System.out.println("Maximum number is: " + max);
        System.out.println("Minimum number is: " + min);
        System.out.println("The avarage no is: " + avarage);
    }

}
