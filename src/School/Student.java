package School;

public class Student extends Person{
    private String course;
    private int registration;

    public void unsubscribe() {
        System.out.println("\n" + this.getName() + ", your registration will be canceled\n");
    }

    public void payMonthly() {
        System.out.println("\n" + this.getName() + ", your monthly fee has been paid successfully\n");
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getRegistration() {
        return registration;
    }

    public void setRegistration(int registration) {
        this.registration = registration;
    }
}