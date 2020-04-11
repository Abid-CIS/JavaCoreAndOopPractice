
package StringDemo.SubString;


public class SubstringInJava {
    
    public static void main(String[] args) {
        String sub1 = "Barefoot";
        /*
        B-index-0
        a-index-1
        r-index-2
        e-index-3
        f-index-4
        o-index-5
        o-index-6
        t-index-7
        .substring(startIndexNo, EndIndexNo(exclusive));
        */ 
        String sub2 = sub1.substring(0,1);// subtring will return a string;
        String sub3 = sub1.substring(0,2);//Ba
        //2nd way for substring : 
        String sub4 = sub1.substring(4); //4 is consider as starting index and will go to until end index
        System.out.println(sub2);
        System.out.println(sub3);
        System.out.println(sub4);//f to all--> output -> foot
        
        
        //Another example of substring:
        String A = "Apurba Debnath Shuvra Debnath"; //A-0,p-1, ----
        String subString1 = A.substring(0,6);// 0 theke suru 6 er ag porjonto
        System.out.println("subString1 :"+ subString1);
    }
}
