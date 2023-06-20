package School;

public class VocationalStudent extends Student{
    public int professionalRegister;

    public int getProfessionalRegister() {
        return professionalRegister;
    }

    public void setProfessionalRegister(int professionalRegister) {
        this.professionalRegister = professionalRegister;
    }

    public void toPraticate() {
        System.out.println(this.getName() + "is practicing");
    }
}
