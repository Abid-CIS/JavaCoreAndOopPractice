
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
   void setinfo(String name, String c, String a, int pa){// cannot use same name as variable;
       this.name=name;
       category= c;
       author=a;
       page=pa;
   }
   void displayInfo(){
       
       System.out.println("The book name is "+ name);
       System.out.println("The book category is "+ category);
       System.out.println("The book author is "+ author);
       System.out.println("The book page is "+ page);
       System.out.println();
   }
    
}
