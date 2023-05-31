package classwork.c19.Threads;

import java.util.Random;

public class MyThread extends Thread{

    public MyThread(String name){
        super(name);
    }
    private int count;



    public int getCount() {
        return count;
    }

    @Override
    public void run() {
        System.out.println("Start of my thread with name " + getName());
        count = new Random().nextInt();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {

        }
        System.out.println("End of my thread with name " + getName());

    }
}
