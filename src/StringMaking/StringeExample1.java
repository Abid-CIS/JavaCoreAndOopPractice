
package StringMaking;


public class StringeExample1 {
    public static void main(String[] args) {
        //String is the sequence of character .
        // String is a array of char.
        String s1 = "Anisul Islam";
        char[] s3 = {'a', 'b', 'c', 'd'};
        System.out.println(s3);// String is the character type array.
        String s2 = new String ("anisul Islam");
        System.out.println(s1+" "+s2);
        
        System.out.println("Length printing of S1 string: ");
        int len = s1.length();
        System.out.println("The Length of S1 " + len);
        //checking Both string are equal or not;
        // == operator reference Value compare korbe na
        //->>compare korbe mane object compare korbe.
        if(s1==s2){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }
        //.equals() value compare kore
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }
        //.contains() method 
        if(s1.contains(s2)){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }
        //check korbo kono value ekti string contains korteche kina
        boolean con = s1.contains("Pakhi");
        System.out.println(con);
    }
}
