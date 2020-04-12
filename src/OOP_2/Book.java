
package OOP_2;


public class Book {
    String Author;
    String Name;
    String version;
    int pageNo;
    
    public void setValue(String a, String n, String v, int page){
        this.Name =  n;
        this.Author =a;
        this.version = v;
        this.pageNo = page;
    }
    public void displayValue(){
        System.out.println("The book's name is: "+Name);
        System.out.println("The book's Author is: "+Author);
        System.out.println("The book's version is: "+version);
        System.out.println("The book's pageNo is: "+pageNo);
        System.out.println();
    }
    
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setValue("Apu", "Histroy-1", "344-1", 222);
        b1.displayValue();
    }
}
