package lesson9.homework;

public class OurHonestVoteAccounter {

    public static void electionResult() {
        OfficialCandidate officialCandidate = new OfficialCandidate();
        IllegalCandidate illegalCandidate = new IllegalCandidate();
        RandomCandidate randomCandidate = new RandomCandidate();

        for (int i = 0; i < 100; i++) {
            int offCan = officialCandidate.vote();
            int illegalCan = illegalCandidate.vote();
            int randomCan = randomCandidate.vote();
            if (offCan > illegalCan && offCan > randomCan) {
                officialCandidate.countOfficialCandidate();
            } else if (illegalCan > offCan && illegalCan > randomCan){
                illegalCandidate.countIllegalCandidate();
            } else {
                randomCandidate.countRandomCandidate();
            }
        }
        System.out.println("Предварительный подсчет голосов показал следующее: ");
        System.out.println("Оффициальный кандидат:" + officialCandidate.getCounterOfficialCandidate());
        System.out.println("Альтернативный кандидат: " + illegalCandidate.getCounterIllegalCandidate());
        System.out.println("Случайный кандидат: " + randomCandidate.getCounterRandomCandidate());

        if (officialCandidate.getCounterOfficialCandidate() <  illegalCandidate.getCounterIllegalCandidate() ||
        officialCandidate.getCounterOfficialCandidate() < randomCandidate.getCounterRandomCandidate()){
            officialCandidate.setCounterOfficialCandidate(80);
            illegalCandidate.setCounterIllegalCandidate(3);
            randomCandidate.setCounterRandomCandidate(17);
        }
        System.out.println("----------------------------");
        System.out.println("Итоговый результат: ");
        System.out.println("Оффициальный кандидат:" + officialCandidate.getCounterOfficialCandidate());
        System.out.println("Альтернативный кандидат: " + illegalCandidate.getCounterIllegalCandidate());
        System.out.println("Случайный кандидат: " + randomCandidate.getCounterRandomCandidate());
    }
}
