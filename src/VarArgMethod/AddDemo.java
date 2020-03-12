
package VarArgMethod;


public class AddDemo {
    /*
    NO need to declared again and agin this parameter for receiving same type of data.
    */
//    void add(int num1, int num2){
//        System.out.println("The value is: "+(num1+num2));
//    }
//    void add(int num1, int num2, int num3){
//        System.out.println("The value is: "+(num1+num2+num3));
//    }
//    void add(int num1, int num2, int num3,int num4,int num5,int num6){
//        System.out.println("The value is: "+(num1+num2+num3));
//    }
//    void add(int num1, int num2, int num3, int num4, int num5){
//        System.out.println("The value is: "+(num1+num2+num3));
//    }
    //wasting of time to create and declared more parameter for receiving arguments length
    // all are same type of variable
    /*
    we can use array..
    as like it there is another way for efficient programming,
    these are "var-arg" method
    
    */ 
    //Here (dataType 3dots one variable name(arryType))
    //Example for var-arg(dataType ... n1)
    void add(int ... num){
        int sum=0;
        //int[] n=num;//suppose values are 10, 20, 30 , 40
        //num =10-> ei 10 chole jabe x e..
        //I have used for each loop here.
        for (int x: num) {
            sum= sum+x;
            System.out.println("The value of sum" +sum);
        }
        System.out.println("sum is "+ sum);
    }
}
