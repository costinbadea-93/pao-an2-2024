import enums.Anotimp;
import model.Book;
import service.FileService;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //try with resources
        // java io
        // java nio
        FileService fileService = new FileService();
//        fileService.readFileV1();
//        fileService.readFileV2();
//        fileService.readFileV3();
//        fileService.writeFileV1("Salut din nou!!!\n");
//        fileService.writeFileV1("ce mai faceti?!!!");
//         fileService.writeFileV2("\ncontent nou!");
//        Book book = new Book("B1", "A1");
//        fileService.writeObjectToFile(book);
//        fileService.writeObjectToFile(book);
//        System.out.println(fileService.readObjectFromFile());
//        System.out.println(fileService.readObjectFromFile());
//        System.out.println(fileService.readObjectsFromFile());
//        List<Book> books = Arrays.asList(
//          new Book("B1", "A1"),
//          new Book("B2", "A2"),
//          new Book("B3", "A3")
//        );
//
//        fileService.generateReport(books);

        for(Anotimp a: Anotimp.values()){
            System.out.println(a.name() + " " + a.ordinal());
            System.out.println(a.getTemperatura());
            a.printWeather();
        }


    }
}
