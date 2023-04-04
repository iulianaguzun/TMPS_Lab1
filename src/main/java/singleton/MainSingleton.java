package singleton;

import java.util.List;

public class MainSingleton {

  public static void main(String[] args) {
    Book book1 = new Book("The Lord of the Rings", "J.J.Tolkien");
    Book book2 = new Book("Hansel and Gretel", "Grimm");

    BookRepository bookRepository = BookRepository.getInstance();

    bookRepository.saveBook(book1);
    bookRepository.saveBook(book2);

    List<Book> bookList = bookRepository.getAllBooks();
    for (Book book : bookList) {
      System.out.println(book.getAuthor() + ":" + book.getName());
    }
  }
}
