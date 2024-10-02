package Syncrozination;

public class Subtractor implements Runnable {
    @Override
    public void run() {
        int counter = 0;
        for (int i = 1; i < 1000; i--) {
            counter -= i;
        }
    }
}
