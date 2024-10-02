package SimpleThreading;

public class Client {
    //private static Object adder;

    public static void main(String[] args) {
        System.out.println("hello world printed by "+Thread.currentThread().getName());
        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        //this is extend method calling
        Adder adder = new Adder();
        //this is run method calling
        Thread thread1 = new Thread(helloWorldPrinter);
        Thread thread2 = new Adder();
        thread1.start();
        thread2.start();

    }
}