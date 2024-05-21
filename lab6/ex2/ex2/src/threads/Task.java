package threads;

public class Task {
    public synchronized void iterate() {
        for(int i = 0; i < 10; i ++) {
            try {
                Thread.sleep(50);
                System.out.println("Printing " + i + " " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
