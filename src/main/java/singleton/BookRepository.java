package singleton;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {

  private static BookRepository INSTANCE;

  private final List<Book> bookList = new ArrayList<>();

  private BookRepository(){}

  public static BookRepository getInstance() {
    synchronized (BookRepository.class) {
      if (INSTANCE == null) {
        return new BookRepository();
      }
    }
    return INSTANCE;
  }

  public List<Book> getAllBooks(){
    return bookList;
  }

  public void saveBook(Book book){
    bookList.add(book);
  }
}
