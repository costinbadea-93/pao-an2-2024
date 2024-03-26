package service;

import model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookService implements BookServiceInterface{
    private List<Book> books =  new ArrayList<>();
    private StringBuffer sb = new StringBuffer();
    private BookService() {
    }

    @Override
    public void addBook(Book book) {
        books.add(book);
        sb.append(String.format("addBook %s", book.getNume())).append("\n");
    }

    @Override
    public void rateABook(Book book) {
        book.setRating(book.getRating() + 1);
        sb.append(String.format("rateABook %s", book.getNume())).append("\n");
    }

    @Override
    public void listBookOrderByRating() {
        this.books.sort((c1, c2) -> c1.getRating().compareTo(c2.getRating()));
        System.out.println(this.books);
        sb.append("listBooksOrderByRating\n");
    }

    @Override
    public void listBookOrderByName() {
        this.books.sort((c1, c2) -> c1.getNume().compareTo(c2.getNume()));
        System.out.println(this.books);
        sb.append("listBooksOrderByName\n");
    }

    @Override
    public void listAuditOperations() {
        System.out.println(sb);
    }

    private static final class SINGLETON {
        private static BookService INSTANCE = new BookService();
    }

    public static BookService getInstance() {
        return SINGLETON.INSTANCE;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
