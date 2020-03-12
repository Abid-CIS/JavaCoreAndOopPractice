
package LoopPractice;

public class BreakContinuePractice {
    public static void main(String[] args) {
        for(int x=1; x<=100; x=x+3){
            if(x==10){
                System.out.println("Dukchi break dimu ekhoni");
                break;
            }
            System.out.println("Value = "+x);//1,4,7
        
        }
    }
}
