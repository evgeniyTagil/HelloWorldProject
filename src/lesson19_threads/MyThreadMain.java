package lesson19_threads;

import java.time.LocalDateTime;

public class MyThreadMain {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start: " + LocalDateTime.now());
        MyThread thread1 = new MyThread("First");
        MyThread thread2 = new MyThread("Second");
        MyThread thread3 = new MyThread("Third");
        thread3.setDaemon(true);
        thread1.start();
        System.out.println(thread1.isAlive());
        thread2.start();
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.join();// пока не закончит 2ой поток
        System.out.println(thread1.isAlive());
        thread3.start(); // дальше ничего не пойдёт
        thread3.interrupt();
        System.out.println("End: " + LocalDateTime.now());
        System.out.println(thread1.getCount());


    }
}