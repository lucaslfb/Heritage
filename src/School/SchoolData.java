package School;

public class SchoolData {
    public static void main(String[] args) {
        Student s0 = new Student();
        s0.setName("Candace");
        s0.setAge(22);
        s0.setSex("F");
        s0.setCourse("Information Tecnology");
        s0.setRegistration(140238);
        System.out.println(s0.toString());
        s0.payMonthly();

        Teacher t0 = new Teacher();
        t0.setName("Michaela");
        t0.setAge(37);
        t0.setSex("F");
        t0.setWage(2500.75f);
        t0.setLicense("IT Security");
        System.out.println(t0.toString());

        Employee e0 = new Employee();
        e0.setName("Sophia");
        e0.setAge(28);
        e0.setSex("F");
        e0.setSector("Stock");
        System.out.println(e0.toString());

        Visitor v0 = new Visitor();
        v0.setName("Alex");
        v0.setAge(18);
        v0.setSex("M");
        System.out.println(v0.toString());

        ScholarshipHolder h0 = new ScholarshipHolder();
        h0.setName("Natan");
        h0.setAge(20);
        h0.setSex("M");
        h0.setRegistration(335628);
        h0.setScholarship(33.3f);
        System.out.println(h0.toString());
        h0.payMonthly();
        h0.renewScholarship();

        VocationalStudent c0 = new VocationalStudent();
        c0.setName("Linda");
        c0.setAge(24);
        c0.setSex("F");
        c0.setRegistration(228362);
        c0.setProfessionalRegister(5567);
        c0.setCourse("Infrastructure");
        System.out.println(c0.toString());
    }
}
