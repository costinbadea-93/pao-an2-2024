package threads;

public class T1 extends Thread{

    @Override
    public void run() {
        for(int i = 0; i < 10; i ++) {
            try {
                Thread.sleep(500);
                System.out.println("Printing " + i + " " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
