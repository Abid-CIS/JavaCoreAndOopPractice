
package StringDemo;


public class Stringdemo2 {
    
    public static void main(String[] args) {
        //trim() method will remove first and last gap
        String s1 ="     Apurba Debnath         ";
        String s2= s1.trim();
        System.out.println(s2);
        
        //replace()
        String s4= "Shuvra Shsrus";
        String s5 = s4.replace('S', 'T');
        System.out.println("Using replace method: "+s5);
        
        //split()-> (One regular expression as a String)
        String name= "Apurba_Debnath_Apu_Partho";
        String[] n1 = name.split("_");
        
        for(String n:n1){
            System.out.println("After split: "+n);
        
        }
        //contains()
        String n3=  new String("Shuvra Apurba");
        String n4 = new String("Shuvra Apurba");
        String n5 = "Love you";
        
        boolean b1 = n5.contains("shu");
        System.out.println(b1);
        
        //charAt()
        String e1 = "Shuvra Debnath";
        char c = e1.charAt(3);// charAt(indexNo);
        System.out.println("Character is: "+c);
        
        //codePointAt();
        String e2 = "ShBuvra Debnath";
        int e4 = e2.codePointAt(2);
        System.out.println("The ASCII Value is: "+e4);
        
        //for length checking-> length.
        int e5 = e2.length();
        System.out.println("Length of String: "+ e5);
        
        //equality checking in two ways.
        String n6=  new String("Shuvra Apurba");
        String n7 = new String("Shuvra Apurba");//-capital
        String n10 = new String("shuvra apurba");//all small letter//content aren't same , case fact
        String n8 = "Love you";
        String n9 = "Love you";
        //endsWith()
        boolean bb= n9.endsWith("you");
        System.out.println("The value of bb: "+ bb);
        //startsWith()
        boolean bw= n6.startsWith("Shu");//case fact here.
        System.out.println("The value is: "+ bw);
        
        //equals()
        boolean b4 = n6.equals(n7);
        System.out.println("IS equal: "+b4);//true
        
        boolean b5 = n7.equals(n8);
        System.out.println("IS equal: "+b5);//false
        
        boolean b6 = n9.equals(n6);
        System.out.println("IS equal: "+b6);//fasle
        
        //equalsIgnorecase() //where case fact-->>
        
        boolean b7 = n6.equals(n10);
        System.out.println("IS equal: "+b7);//False
        
        boolean b8 = n7.equalsIgnoreCase(n10);
        System.out.println("IS equal: "+b8);//true
        
        //indexOf()->> checking index of char in a string//return index no of a char
        String name3 = "Asdrtuirfgheii youdi";
        int v = name3.indexOf('r');
        int t = name3.lastIndexOf('i');//last indext of 'i' will be returned.
        System.out.println("The last index is: "+t);
        System.out.println("The index of this char value is: "+v);
        
        //String concat();
        String y = "I ";
        String z="Love ";
        String i = " Bangladesh";
        String result= y.concat(z).concat(i);
        System.out.println("The result is: "+ result);
        
        
        
    }
}
