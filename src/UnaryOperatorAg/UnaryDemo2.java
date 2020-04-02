
package UnaryOperatorAg;


public class UnaryDemo2 {
    //Increment ++, decrement--, 
    //Postfix increment , Prefix increment
    //Postfix decrement, prefix decrement
    
    public static void main(String[] args) {
        
        int x = 10;//int y = ++x;// agai bere jabe 1 kore// here, y = 11;
        int y;
        y = x++;//int y = x++;// pore berbe x pele 1 kore// here, y = 10;
        int z =x+1;//11+1=12
        
        // now we are going to decrement 
        int c = x--; 
        int d= x+5;//11-1= ekhane x =10, //10+5 : 15 
        System.out.println("y is: " + y);
        System.out.println("Z is: " + z);
        System.out.println("c is :" + c);// c = 11 e thakbe, pore kombe abar x pele. 
        System.out.println("d is : " + d);
        
        
    }
}
