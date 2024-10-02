package SimpleThreading;

public class HelloWorldPrinter  implements Runnable {

    @Override
    public void run() {
        System.out.println("hello i m printing from "+Thread.currentThread().getName());
    }
}
