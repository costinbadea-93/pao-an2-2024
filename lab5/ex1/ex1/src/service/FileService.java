package service;

import model.Book;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import static java.nio.file.StandardOpenOption.APPEND;

public class FileService {

    private static final String FILE_PATH = "C:\\Users\\cbadea\\OneDrive - ENDAVA\\Desktop\\pao_an2024\\lab5\\ex1\\ex1\\src\\audit\\data.txt";
    private final StringBuilder STRING_BUILDER = new StringBuilder();

    public void readFileV1() {
        try(FileReader fileReader = new FileReader(FILE_PATH)){
            int c;
            while((c = fileReader.read()) != -1) {
                System.out.println((char) c);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFileV2() {
        try(FileReader fileReader = new FileReader(FILE_PATH);
            BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }

        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFileV3(){
        Path path = Paths.get(FILE_PATH);
        try {
            Files.lines(path)
                    .forEach(line -> System.out.println(line));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeFileV1(String content) {
        try(FileWriter fileWriter = new FileWriter(FILE_PATH, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(content);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeFileV2(String content) {
        Path path = Paths.get(FILE_PATH);
        try {
            Files.write(path, content.getBytes(), APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeObjectToFile(Book book) {
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE_PATH, true))){
            objectOutputStream.writeObject(book);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public Book readObjectFromFile() {
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_PATH))){
            Book book = (Book) objectInputStream.readObject();
            return book;
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
            return null;
        }
    }

    public List<Book> readObjectsFromFile() {
        List<Book> books = new ArrayList<>();
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_PATH))){
            Book book;
            while ((book = (Book) objectInputStream.readObject()) != null){
                books.add(book);
            }
            return books;
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
            return null;
        }
    }
    public void generateReport(List<Book> books) {
        generateHeader();
        books.forEach(book -> {
            STRING_BUILDER.append(book.getName())
                    .append(",")
                    .append(book.getAuthor())
                    .append("\n");
        });
        try {
            Path reportsPath = Paths.get("C:\\Users\\cbadea\\OneDrive -" +
                    " ENDAVA\\Desktop\\pao_an2024\\lab5\\ex1\\ex1\\src\\audit\\"
                    + "Audit_" + Instant.now().getNano() + ".xls");
            Files.createFile(reportsPath);
            Files.write(reportsPath, STRING_BUILDER.toString().getBytes(), APPEND);
//            STRING_BUILDER = new StringBuilder();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void generateHeader() {
        STRING_BUILDER
                .append("BOOK_NAME")
                .append(",")
                .append("BOOK_AUTHOR")
                .append("\n");
    }

}
