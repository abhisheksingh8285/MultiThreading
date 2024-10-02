package SimpleThreading;

public class Adder extends Thread{
    @Override
    public void run() {
        //int i=0;
        for (int i=0;i<=1000;i++) {
            System.out.println(i+Thread.currentThread().getName());
        }
    }


}
