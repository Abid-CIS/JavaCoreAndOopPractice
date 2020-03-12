
package LoopPractice;


public class BreakContinue3 {
    public static void main(String[] args) {
        for(int d=1; d<=20; d=d+1){
            if(d==8){
                continue;
            }
            if(d>18){
                break;
            }
            System.out.println("The values are "+d);
        }
    }
}
