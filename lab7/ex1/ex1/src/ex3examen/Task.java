package ex3examen;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class Task {


    public AtomicInteger countWord(String filePath, String word, AtomicInteger counter) throws IOException {
//        AtomicInteger counter = new AtomicInteger();
        Path path = Paths.get(filePath);
        Files.lines(path)
                .forEach(l -> {
                    Arrays.stream(l.split(" "))
                                    .forEach(w -> {
                                        if(w.equals(word)) {
                                            counter.getAndIncrement();
                                        }
                                    });
                });
        return counter;
    }

}
