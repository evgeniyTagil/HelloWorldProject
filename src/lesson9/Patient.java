package lesson9;

public class Patient {
    private String name;
    private int age;
    private int medicalPlan;
    //это то к какому врачу собираемся отправить поциента
    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Patient() {
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getMedicalPlan() {
        return medicalPlan;
    }

    public void setMedicalPlan(int medicalPlan) {
        this.medicalPlan = medicalPlan;
    }

    public String getName() {
        return name;
    }
}
