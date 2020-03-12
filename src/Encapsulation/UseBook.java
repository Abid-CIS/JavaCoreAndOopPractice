
package Encapsulation;


public class UseBook {
    public static void main(String[] args) {
        Book b1= new Book();
        Book b2= new Book();
        Book b3= new Book();
        Book b4= new Book();
        
        b4.setName("Rosogolla");
        b4.setAuthor("Apurba");
        b4.setbookVersion("56/b");
        b4.setpageNo(324);
        
        int page = b4.getPageNo();
        System.out.println("b4 pageNo is "+page );
        
    }
}
