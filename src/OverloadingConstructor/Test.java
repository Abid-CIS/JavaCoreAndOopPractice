
package OverloadingConstructor;


public class Test {
    
    public static void main(String[] args) {
        Book book1 = new Book("Advance java","sr.Gupta","Java Programming",324,3);
        book1.displayInformation();
        
        Book book2 =new Book("LOl java", "Lol gupta","C#");
        book2.displayInformation();
        
        Book book3 =new Book("Put java", "put gupta");
        book3.displayInformation();
        
        Book book4 =new Book("Ziok", "ziko gupta",324);
        book4.displayInformation();
    }
}
