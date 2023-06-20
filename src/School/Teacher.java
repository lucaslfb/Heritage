package School;

public class Teacher extends Person {
    private String license;
    private float wage;

    public void receiveRaise(float raise) {
        this.setWage(this.getWage() + raise);
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public float getWage() {
        return wage;
    }

    public void setWage(float wage) {
        this.wage = wage;
    }
}
