
package StringMaking;


public class StringExample2 {
    public static void main(String[] args) {
        String a = "Apurba";
        String b = new String("Debnath");
        a.concat("Debnath");
        System.out.println(a);
        a = "Apu";
        System.out.println(a);
        //There are 3 ways to compare String.
        //This is the 1st way: Using == operator:
        if(a==a){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }
        //This is the 2nd way: Using .equals() method:
        if(a.equals(b)){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }
        //This is the 3rd way: Using .compareTo() method:
        int ab = a.compareTo(b);
        System.out.println(" A is: " + a );
        System.out.println("Length of a : " + a.length());
        System.out.println("B is: " + b);
        System.out.println("Length of b : " + b.length());
        System.out.println("a compare to b: " + (a.length()-b.length()));
        System.out.println(ab);
    }
}
