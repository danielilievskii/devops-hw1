public class Subject {

    private String name;
    private String code;
    private int credits;

    public Subject(String name, String code, int credits) {
        this.name = name;
        this.code = code;
        this.credits = credits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void displaySubjectDetails() {
        System.out.println("Subject Name: " + name);
        System.out.println("Subject Code: " + code);
        System.out.println("Credits: " + credits);
    }

    public static void main(String[] args) {
        Subject subject = new Subject("DevOps", "F18L3S118", 6);
        subject.displaySubjectDetails();

        subject.setName("Continous integration and delivery");
        subject.setCode("F23L3S118");
        subject.displaySubjectDetails();
    }
}