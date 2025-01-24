import java.util.ArrayList;

class Book{
    private String title;
    private String author;

    public Book(String title, String author){
        this.title=title;
        this.author=author;
    }

    public void displayBookDetails(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class Library{
    private String libraryName;
    private ArrayList<Book> books;

    public Library(String libraryName){
        this.libraryName=libraryName;
        this.books=new ArrayList<>();
    }

    public void addBook(Book book){
      books.add(book);
    }

    public void showBook(){
        System.out.println("Books in " + libraryName);
        for(Book book : books){
            book.displayBookDetails();
            System.out.println();
        }
    }
}

public class LibraryAndBooks {
    public static void main(String[] args) {
        Book book1=new Book("Java", "J.Gosling");
        Book book2=new Book("Python", "XYZ");
        Book book3=new Book("C programming", "Denis Ritchie");

        Library l1=new Library("City Library");
        Library l2=new Library("Central Library");

        l1.addBook(book1);
        l1.addBook(book2);
        l2.addBook(book3);

        l1.showBook();
        l2.showBook();
    }
}