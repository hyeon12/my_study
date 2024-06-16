package object;

public class Book {
    int bookNumber;
    String bookTitle;

    public Book(int bookNumber, String bookTitle) {
        this.bookNumber = bookNumber;
        this.bookTitle = bookTitle;
    }

    public String toString(){
         return bookNumber + ":" + bookTitle;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Book){
            Book book = (Book)obj;
            if(this.bookTitle == ((Book) obj).bookTitle)
                return true;
            else return false;
        }
        return false;
    }
}
