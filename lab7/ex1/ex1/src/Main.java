import ex3examen.R;
import ex3examen.Task;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        //grouping by
        //collectors to map
        AtomicInteger counter = new AtomicInteger();
        String filePath1  = "C:\\Users\\cbadea\\OneDrive - ENDAVA\\Desktop\\pao_an2024\\lab7\\ex1\\ex1\\src\\ex3examen\\data.txt";
        String filePath2  = "C:\\Users\\cbadea\\OneDrive - ENDAVA\\Desktop\\pao_an2024\\lab7\\ex1\\ex1\\src\\ex3examen\\data.txt";
        String filePath3  = "C:\\Users\\cbadea\\OneDrive - ENDAVA\\Desktop\\pao_an2024\\lab7\\ex1\\ex1\\src\\ex3examen\\data.txt";

//        Task task = new Task();
//        System.out.println(task.countWord(filePath, "salut"));
        R r1 = new R(filePath1, "salut", counter);
        R r2 = new R(filePath2, "salut", counter);
        R r3 = new R(filePath3, "salut", counter);

        Thread thread1 = new Thread(r1);
        Thread thread2 = new Thread(r2);
        Thread thread3 = new Thread(r3);

//        r1.run();
//        r2.run();
//        r3.run();
        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println(counter.get());

    }
}
