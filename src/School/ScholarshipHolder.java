package School;

public class ScholarshipHolder extends Student{
    private float Scholarship;

    public void renewScholarship() {
        System.out.println("\n" + this.getName() + ", your scholarship has been renewed\n");
    }

    public float getScholarship() {
        return Scholarship;
    }

    public void setScholarship(float scholarship) {
        Scholarship = scholarship;
    }

    @Override
    public void payMonthly() {
        System.out.println("\nHi scholarship holder " + this.getName() + ", your monthly fee has been paid\n");
    }
}
