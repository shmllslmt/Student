import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String id;
    private String name;
    private String phoneNo;
    private String email;
    private String programme;
    private double gpa;
    private double cgpa;
    private ArrayList<String> subjects = new ArrayList<String>();

    // overloading constructors
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

    void introduce() {
        System.out.println("Hello, I am " + name);
        System.out.println("My student ID is " + id);
        System.out.println("I study in " + programme);
    }

    void enrollCourse(String subject) {
        subjects.add(subject);
    }

    void withdrawCourse(String subject) {
        subjects.remove(subject);
    }

    public ArrayList<String> getSubjects() {
        return subjects;
    }

    public void calcGPA() {
        Scanner input = new Scanner(System.in);
        String grade;
        float totalpoint = 0;
        float gpa = 0;

        for(String s: subjects) {
            System.out.println("What is the grade that you received for " + s + "?");
            grade = input.next();

            if (grade.equals("A")) {
                totalpoint += (4.0 * 3);
            } else if (grade.equals("B")) {
                totalpoint += (3.0 * 3);
            } else if (grade.equals("C")) {
                totalpoint += (2.0 * 3);
            } else if (grade.equals("D")) {
                totalpoint += (1.0 * 3);
            } else {
                totalpoint += 0;
            }
        }

        gpa = totalpoint / (subjects.size()*3);

        System.out.println(name + "'s GPA is " + gpa);
    }

    // Find the average of all GPA that you have received so far
    public void calcCGPA() {
        Scanner input = new Scanner(System.in);
        int sem;
        double gpa = 0.0;
        double cgpa = 0.0;

        // Prompt user how many semesters have they passed? 6
        System.out.println("Hello, how many semesters have you passed? ");
        sem = input.nextInt();

        for(int i = 0; i < sem; i++) {
            System.out.println("What is your GPA for Sem " + (i+1) + "? ");
            gpa += input.nextDouble();
        }
        cgpa = gpa / sem;

        System.out.println(name + "'s CGPA is " + String.format("%.2f", cgpa));
    }
}
