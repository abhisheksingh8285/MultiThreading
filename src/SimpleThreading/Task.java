package SimpleThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task implements Runnable{
    private String name;
    public Task(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " executing task : " + name);
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }
        System.out.println(Thread.currentThread().getName() + " fineshed task: " + name);
    }

}
 class ThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 10; i++) {
            Task task = new Task("SimpleThreading.Task " + i);
            executorService.submit(task);
        }
        executorService.shutdown();
    }
}
