package classwork.c19.Threads;

public class ThreadC19 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world");
        Thread.currentThread().setName("MEGA THREAD"); //переименовать поток
        System.out.println("Thread name: " + Thread.currentThread().getName());
        System.out.println(Thread.currentThread().isAlive()); // работает ли поток
        System.out.println(Thread.currentThread().isInterrupted()); // завершиося ли поток
        //Thread.sleep(5000); поток заснёт на 5 сек
        Thread.currentThread().setName("MEGA POTOK");
        System.out.println("Hello world2");
    }
}
