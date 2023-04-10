package lesson7.computer;

public abstract class Comp{
    private String hdd;
    private String ram;

    protected String userName;

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public Comp(String hdd, String ram, String userName) {
        this.hdd = hdd;
        this.ram = ram;
        this.userName = userName;
    }

    public abstract void printDisplay();

    @Override
    public String toString() {
        return "Comp{" +
                "hdd='" + hdd + '\'' +
                ", ram='" + ram + '\'' +
                '}';
    }
}
