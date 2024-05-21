package threads;

public class R1 implements Runnable{
    private Task task;

    public R1(Task task) {
        this.task = task;
    }
    @Override
    public void run() {
        task.iterate();
    }
}
