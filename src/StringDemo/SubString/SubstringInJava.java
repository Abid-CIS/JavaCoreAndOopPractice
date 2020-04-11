
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
        String subString2 = A.substring(6,14);// 6 theke suru 14 er ag porjonto
        String subString3 = A.substring(15,23);// 15 theke suru 23 er ag porjonto
        String subString4 = A.substring(0,29);// 0 theke suru 29 er ag porjonto
        System.out.println("subString1 :"+ subString1);
        System.out.println("subString1 :"+ subString2);// output : Debnath with space
        System.out.println("subString1 :"+ subString3);// output :Shuvra D
        System.out.println("subString1 :"+ subString4);// output :full string
        //Using only one index : starting indexNo.
        String subString5 = A.substring(0);
        String subString6 = A.substring(15);
        System.out.println("subString5: " + subString5);// 0 theke full 
        System.out.println("subString5: " + subString6);// 0 theke full 
        
    }
}
