package threads;

import java.util.concurrent.Callable;

public class C1 implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for(int i = 0 ; i < 10 ; i ++) {
            System.out.println("Executing " + i);
            sum += i;
        }

        return sum;
    }
}
