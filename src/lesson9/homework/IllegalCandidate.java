package lesson9.homework;

public class IllegalCandidate extends Voter{
    private int counterIllegalCandidate;

    public void countIllegalCandidate() {
        this.counterIllegalCandidate++;
    }

    public int getCounterIllegalCandidate() {
        return counterIllegalCandidate;
    }

    public void setCounterIllegalCandidate(int counterIllegalCandidate) {
        this.counterIllegalCandidate = counterIllegalCandidate;
    }
}
