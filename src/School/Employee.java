package School;

public class Employee extends Person{
    private String sector;
    private boolean working;

    public void changeWork() {
        this.setWorking(!this.isWorking());
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }
}
