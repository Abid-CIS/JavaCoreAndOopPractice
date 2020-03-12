
package ToStringMethodPractice;


public class Book {
    String nameOfBook;
    String authorOfBook;
    int PageNo;
    Book(String name, String author, int page){
        nameOfBook=name;
        authorOfBook=author;
        PageNo=page;
    }
    //Object super class er ekta method toString
    //obj1 er modher sob value print korte toString Method call dite hoy
    //toString method ti already sob class er jonno thake tai override kore use korte hoy.
    //toString Method er ->> return type holo String
    //object autometically toString method k call dai.
    @Override
    public String toString(){
    return "Book Name: "+nameOfBook+"\nAuthor of this Book: "+ authorOfBook+"\nTotal Page No: "+PageNo;
    } 
}
