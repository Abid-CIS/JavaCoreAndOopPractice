
package LoopPractice;


public class DifferBetweenWhileAndDoWhile {
    
    public static void main(String[] args) {
//        int x= 51;//Give here 51, Loop will not work anytime as condition got false.
//        while(x<=50){
//            System.out.println("The value of X: "+ x);
//            x=x+2;
//        }

    int x=51;
        do{
            System.out.println("The value of x is: "+ x);
        }while(x<=50);// Condition false but execute once only.
    }
}
