package model;

//clasa imutabila

//-constructor cu parametrii
//-geters pt metode
//-toate campurile sunt final
//-metodele de equals si hashcode
//public record Book(String autor) {
//}

//public final class Book {
//    private final String autor;
//
//    public Book(String autor) {
//        this.autor = autor;
//    }
//
//    public String getAutor() {
//        return autor;
//    }
//}

public class Book {

    private String autor;
    private String nume;
    private double price;
    private Integer rating = 0;

    public Book(String autor, String nume, double price, Integer rating) {
        this.autor = autor;
        this.nume = nume;
        this.price = price;
        this.rating = rating;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Book{" +
                "autor='" + autor + '\'' +
                ", nume='" + nume + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}
