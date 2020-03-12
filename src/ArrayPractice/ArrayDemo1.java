
package ArrayPractice;

public class ArrayDemo1 {
    public static void main(String[] args) {
        
        int[]number1 = new int[10];// declaration and creation of array
        int[]number2 = new int[4];
        number2[0]=56;
        number2[1]=76;
        number2[2]=96;
        number2[3]=86;
        int sum2 =0;
        for(int i=0; i<4; i=i+1){
            
            sum2=sum2+number2[i];
        }
        System.out.println("Total of Number2 array "+sum2);
        int length = number1.length;
        int sum=0;
        System.out.println("Length of array is:"+ length);
        //initialization of array:
        number1[0]=20;
        number1[1]=20;
        number1[2]=20;
        number1[3]=20;
        number1[4]=20;
        number1[5]=20;
        number1[6]=20;
        number1[7]=78;
        number1[8]=20;
        number1[9]=20;
        for(int i=0; i<10; i++){
        
            sum= number1[i]+sum;
        }
        System.out.println("Sum is "+sum);
        
        
        
    }
}
