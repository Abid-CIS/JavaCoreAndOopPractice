
package ToStringMethodPractice;


public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("History","sr.Gupta",43);
        Book b2 = new Book("Bangla","sr.Supta",40);
        Book b3 = new Book("History23","sr.Pupta",56);
        
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
