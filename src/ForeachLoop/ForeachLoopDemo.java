
package ForeachLoop;


public class ForeachLoopDemo {
    public static void main(String[] args) {
        String [] fruits ={"Mango", "Apple", "Orange", "Banana", "Papaya"};
        
//        for( int i = 0; i < fruits.length; i++){
//            System.out.println(fruits[i]);
//        }

        for(String x : fruits){
            System.out.print(x + " , ");
        }
        System.out.println();
    }
}
