package lesson9.homework;

public class OfficialCandidate extends Voter{
    private int counterOfficialCandidate;

    public void countOfficialCandidate() {
        this.counterOfficialCandidate++;
    }

    public int getCounterOfficialCandidate() {
        return counterOfficialCandidate;
    }

    public void setCounterOfficialCandidate(int counterOfficialCandidate) {
        this.counterOfficialCandidate = counterOfficialCandidate;
    }
}
