package lesson19_threads;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    private int count;
    private AtomicInteger intCount;
    private final Object lock = new Object();
    private volatile int counter; //



    public void increment() throws InterruptedException { //синхронизация на часть метода
        synchronized (lock) {
            setCount(getCount() + 1);
        }
        intCount.incrementAndGet();
        intCount.addAndGet(10);
        intCount.decrementAndGet();
        intCount.getAndIncrement();
        System.out.println("egegegei");
        Thread.sleep(100);
    }
//    public synchronized void increment() throws InterruptedException { //синхронизация на весь метод
//        setCount(getCount() + 1);
//        System.out.println("egegegei");
//        Thread.sleep(1000);
//    }


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
