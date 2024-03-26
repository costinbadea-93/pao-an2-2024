import model.Book;
import service.BookService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
////        System.out.println("java 21");
//
//        //mostenire  => is-a
//        //agregare & compozitie => has-a
//        //agregarea -> weak association
//        //compozitia -> strong association
//
//        //agregare
//        Person p1 = new Person("Ionel");
//        House house = new House(p1);
//        System.out.println(house);
//        p1.setNume("Georgel");
//        System.out.println(house);
//
//        //compozitie
//        Room r1 = new Room();
//
//        //===================Imutabilitate====================
//        //String => clasa imutabila
//
//        String s1 = "test";
//        s1.concat("anotherString");
//        System.out.println(s1);
//
//        StringBuilder sb = new StringBuilder("test");
//        sb.append("anotherString");
//        System.out.println(sb);
//
//        StringBuffer stb = new StringBuffer("test");
//        stb.append("anotherString");
//        System.out.println(stb);
//
//        //regex => expresii regulate
//        String s2 = "tes!t";
//        if(s2.matches("^[a-zA-Z0-9_]*$")) {
//            System.out.println("Nu are caractere speciale");
//        }else {
//            System.out.println("Are caractere speciale");
//        }
//
//
//        List<String> list = new ArrayList<>();
//        list.add("test");
//        list.add("test2");
//
//        System.out.println(list);
//
//        list.forEach(e -> System.out.println(e));
//

        /**
         * Exercitiu:
         * -Carte -> nume, autor, rating, pret
         * -sa fie afisat un meniu cu optiunile:
         * 	-adauga carte
         * 	-faceti rate la o carte
         * 	-vizualizare carti ordonate dupa rating
         * 	-vizualizare carti sortate dupa nume(alfabetic)
         *
         * -operatiile permise vor fi adaugate intr un service singleton si expuse printr
         * o interfata prin override
         *
         * -se va folosi o clasa de stringbuilder in care se vor stoca operatiile facute de
         * user
         *
         * * -instructiunile se vor da din linia de comanda
         */

        Book book1 = new Book("A1", "N1", 2000.0, 0);
        Book book2 = new Book("A3", "N3", 3000.0, 0);
        Book book3 = new Book("A2", "N2", 5000.0, 2);

        BookService bookService = BookService.getInstance();
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        bookService.setBooks(books);
        bookService.listBookOrderByRating();
        bookService.listBookOrderByName();

        bookService.addBook(new Book("D", "N4", 5000.0, 19));
        bookService.listBookOrderByRating();

        bookService.listAuditOperations();
//        System.out.println(String.format("Printing a book %s", book));




    }
}


class House {
    private  Person person;
    public House(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "House{" +
                "person=" + person +
                '}';
    }
}

class Person {
    private String nume;

    public Person(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nume='" + nume + '\'' +
                '}';
    }
}

class Room {
    private String tip;
    public Room() {
    }

    public Room(Room room) {
        Room r = new Room();
        this.tip = r.tip;
    }

    @Override
    public String toString() {
        return "Room{" +
                "tip='" + tip + '\'' +
                '}';
    }
}