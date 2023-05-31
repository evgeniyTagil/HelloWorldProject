package lesson19_threads;

import lesson19_threads.Runnable.MyRunnable;

public class CounterMain {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        MyRunnable myRunnable = new MyRunnable(counter);
        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);
        Thread thread3 = new Thread(myRunnable);
        thread1.start();
        thread2.start();
        thread3.start();
        thread1.join();
        thread2.join();
        thread3.join();
        System.out.println(counter.getCount());
    }
}
