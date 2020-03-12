
package OOP;


public class Book {
    String name;
    String category;
    String author;
    int page;
//    Book(String a, String b, String c, int d){
//            name=a;
//            category=b;
//            author=c;
//            page=d;
//        
//    }
   void setinfo(String n, String c, String a, int pa){// cannot use same name as variable;
       name=n;
       category= c;
       author=a;
       page=pa;
   }
   void displayInfo(){
       
       System.out.println("The book name is "+ name);
       System.out.println("The book name is "+ category);
       System.out.println("The book name is "+ author);
       System.out.println("The book name is "+ page);
       System.out.println();
   }
    
}
