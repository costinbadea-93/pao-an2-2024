package ex3examen;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

public class R implements Runnable{

//    private Task task;
    private String filePath;
    private String word;
    private AtomicInteger counter;

    public R (String filePath, String word, AtomicInteger counter){
        this.filePath = filePath;
        this.word = word;
        this.counter = counter;
//        this.task = task;
    }

    @Override
    public void run() {
        Task t = new Task();
        try {
            System.out.println(Thread.currentThread().getName());
            System.out.println(t.countWord(filePath, word, counter));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
