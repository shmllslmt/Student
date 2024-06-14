public class Student {
    private String id;
    private String name;
    private String phoneNo;
    private String email;
    private String programme;
    private double gpa;
    private double cgpa;

    // no-argument constructor
    // to initializes the attributes with default values
    public Student() {
        id = "D000001B";
        name = "John Doe";
    }

    // parameterized constructor
    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public String getProgramme() {
        return programme;
    }

    public double getGpa() {
        return gpa;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
}
