package lesson19_threads.homework;

public class NewThread extends Thread{
    private String name;

    public NewThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Thread is start, thread name : " + getName());
    }
}
