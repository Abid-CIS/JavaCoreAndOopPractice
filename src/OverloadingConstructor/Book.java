
package OverloadingConstructor;

public class Book {
    String name,authorName, bookType;
    int pageNo,version;
    Book(){
        System.out.println("No info inserted yet!");
    }
    Book(String a, String b, String c, int d, int e ){
    name=a;
    authorName=b;
    bookType=c;
    pageNo=d;
    version=e;
    }
    Book(String a, String b){
        name=a;
        authorName=b;
    }
    Book(String a, String b, String c){
        name=a;
        authorName=b;
        bookType=c;
    }
    Book(String a, String b, int d){
        name=a;
        authorName=b;
        pageNo=d;
    }
    
    void displayInformation(){
        
        System.out.println("Book's name "+name);
        System.out.println("Book's authorName "+authorName);
        System.out.println("Book's bookType "+bookType);
        System.out.println("Book's pageNo "+pageNo);
        System.out.println("Book's version "+version);
        System.out.println("\n\n");
    }
}
