package Syncrozination;

public class Client {
    private static Runnable Subtractor;

    public static void main(String[] args) {
        Thread t1 = new Thread(Adder);
        Thread t2 = new Thread(Subtractor);
    }
}
