
package StringBuffer;


public class StringBufferDemo3 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Apurba Debnath");
        StringBuffer sb1 = new StringBuffer("Apurba Debnath");
        //replace();
        sb.replace(1, 5,"JAVARTYU");//A JAVARTYU a Debnath
        sb1.replace(0, 4, "Baba");//Bababa ..correct
        System.out.println(sb1);
        System.out.println(sb);
        /*
        NOte:
        replace(strating index, index length, one string in double quotes);
        
        1-5 means -0,1,2,3,4 (starting point is =1) 
        And 
        area will covered is (0to4) means 5);
        
        */
        //insert(); 
        //insert(position_no,"String");
        //insert method insert the given string with this string with the given position;
        StringBuffer h1 = new StringBuffer("AFUCK IS");//AFJAVAS wrong it will not replace just placed
        //AFJAVAUCK IS
        h1.insert(2, "JAVA");// jai no dibo tar ag dia dukbe purta..1 dile 1 er agdia than full string..
        System.out.println("After Insertions: "+ h1);
        String df ="APURBA";
        StringBuffer sdr = new StringBuffer(df);//Passing the string df here..
        sdr.insert(3,"uaremine");//3 no index e dukbe....
        System.out.println("After 3rd insertation: "+ sdr);
        
    }
}
