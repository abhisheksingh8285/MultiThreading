package Syncrozination;

public class Adder implements Runnable{
    @Override
    public void run() {
       int value = 0;
       for (int i = 1; i < 1000; i++) {
           value += i;
       }


    }
}
