package lesson9.homework;

import java.util.Random;

public class Voter {
    public int vote() {
        Random random = new Random();
        int voice = random.nextInt(100);
        return voice;
    }
}
