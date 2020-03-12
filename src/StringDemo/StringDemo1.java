
package StringDemo;


public class StringDemo1 {
    public static void main(String[] args) {
        String s1="Apurba";
        String s="Apurba";
        String s2 = new String("Apurba");
        
        //length()..checking length of String
        int x= s1.length();
        System.out.println("Length of s1 :"+x);//1. length()
        int y = s2.length();
        System.out.println("Length of s2 :"+y);
        System.out.println();
        
        //To Make all charecter UpperCase in a String
        //toUppercase()
        System.out.println("Using toUpperCase() method:");
        String s3 = s2.toUpperCase();
        System.out.println("Upper: "+s3);//2. toUppercase()
        String s4 = s1.toUpperCase();
        System.out.println("Upper: "+s4);
        System.out.println();
        
        //To Make all charecter LowerCase in a String
        //toLowerCase()
        System.out.println("Using toLowerCase() method:");
        String s5 = s2.toLowerCase();
        System.out.println("Upper: "+s5);//3. toLowerCase()
        String s6 = s1.toLowerCase();
        System.out.println("Upper: "+s6);
        System.out.println();
        
        //equals() method-> for comparing content between 2 Strings
        //equalsIgnoreCase()
        boolean check1 = s1.equalsIgnoreCase(s2);//4. equals() and 5. equalsIgnoreCase()
        /*
        It will check either this true or false that means contents are equals or not
        */
        System.out.println("s1.equals(s2)..Content/value checking: "+check1);
        //Using == operator...
        boolean check2=(s1==s2);//6. == operator for reference checking
        /*
        It will check either this true or false that means reference are equals or not
        */
        System.out.println("s1==s2: reference checking: "+check2);
        boolean check3=(s1==s);
        System.out.println("s1==s: reference checking: "+check3);
        
        //7. contains()//Case must fact for equality...
        boolean check4 = s1.contains(s2);
        System.out.println("contents are equal:"+check4);
        //Main value will not be changed
        System.out.println("Main value will not be changed: ");
        System.out.println("s1:"+s1);
        System.out.println("s2:"+s2);
        
        //8.split();
        String phone="+88-01749417609-Apurba";
        
        String[] ph = phone.split("-");
        System.out.println("After spliting the String: ");
        for(String x2: ph){
            System.out.println(x2);
        }
        
        
    }
}
