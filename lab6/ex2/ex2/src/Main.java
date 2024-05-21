import threads.C1;
import threads.R1;
import threads.T1;
import threads.Task;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {


    public static void main(String[] args) {
//        T1 t1 = new T1();
//        t1.start();
//
//        R1 r1 = new R1();
//        r1.run();

       // ExecutorService
       // ForkJoin
        Task task = new Task();
        R1 execTask1 = new R1(task);
        R1 execTask2 = new R1(task);
//
//        Thread t1 = new Thread(execTask1);
//        Thread t2 = new Thread(execTask2);
//
//        t1.start();
//        t2.start();
//
//        C1 c1 = new C1();
//        ExecutorService executorService = Executors.newFixedThreadPool(5);
//        executorService.submit(execTask1);
//        Future<Integer> result  = executorService.submit(c1);
//        try {
//            System.out.println(result.get());
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        } catch (ExecutionException e) {
//            throw new RuntimeException(e);
//        }


        ExecutorService executorService = Executors.newCachedThreadPool();
        long start = System.currentTimeMillis();
        for(int i =0; i < 20; i++) {
            executorService.submit(new R1(task));
        }
        long end = System.currentTimeMillis();

        executorService.
    }

}
