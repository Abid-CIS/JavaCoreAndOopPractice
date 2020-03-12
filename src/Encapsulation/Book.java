
package Encapsulation;


public class Book {
    private String bookName;
    private String bookAuthor;
    private String bookVersion;// this process is known as data hiding process.
    private int PageNo;
    
    public void setName(String bookName){
        this.bookName = bookName;
    }
    public String getName(){
        return bookName;
    }
    public void setAuthor(String author){
        this.bookAuthor= author;
    }
    public String getAuthor(){
     return bookAuthor;
    }
    public void setbookVersion(String bookVersion){
        this.bookVersion= bookVersion;
    }
    public String getbookVersion(){
        return bookVersion;
    }
    public void setpageNo(int PageN){
        this.PageNo= PageN;
    
    }
    public int getPageNo(){
    return PageNo;
    }
//    void displayInfo(){
//        System.out.println("Name: "+bookName);
//        System.out.println("Author: " +bookAuthor);
//        System.out.println("Version: "+bookVersion);
//        System.out.println("Page No: "+bookPageNo);
//    }
}
