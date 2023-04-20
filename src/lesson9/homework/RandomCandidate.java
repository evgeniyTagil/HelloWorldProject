package lesson9.homework;

public class RandomCandidate extends Voter{
    private int counterRandomCandidate;

    public void countRandomCandidate() {
        this.counterRandomCandidate++;
    }

    public int getCounterRandomCandidate() {
        return counterRandomCandidate;
    }

    public void setCounterRandomCandidate(int counterRandomCandidate) {
        this.counterRandomCandidate = counterRandomCandidate;
    }
}
