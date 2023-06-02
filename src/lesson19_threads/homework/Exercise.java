package lesson19_threads.homework;

public class Exercise {
    public static void main(String[] args) throws InterruptedException {
        NewThread first = new NewThread("first");
        NewThread second = new NewThread("second");
        NewThread third = new NewThread("third");
        third.start();
        third.join();
        second.start();
        second.join();
        first.start();
        first.join();
    }
}