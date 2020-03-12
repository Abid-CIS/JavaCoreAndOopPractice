
package LoopPractice;


public class DoWhileLoopDemo {
    
    public static void main(String[] args) {
        int i=1;
        do{
            System.out.println("The vlue of \'i\' is : " +i);//1,3,5,7,9
            i=i+2;//1+2= 3, 3+2=5, 5+2=7,7+2=9, 9+2=11
        }while(i<=10);// Checking 3 is less than 10 than go to do...
                      //Checking 5 is less than 10 than go to do..and so on
    }                   //Checking 7 is less than 10 than go to do..and so on
                        //Checking 9 is less than 10 than go to do..and so on
}                       // Checking 11 is greater than 10 and loop will stop here.
