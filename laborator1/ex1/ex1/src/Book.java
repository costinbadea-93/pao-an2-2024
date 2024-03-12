import java.util.Comparator;

public class Book {
    private String name;
    private String author;

    {
        System.out.println("A");
    }

    static {
        System.out.println("B");
    }

    public Book(String name, String author) {
        System.out.println("C");
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
