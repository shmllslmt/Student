import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    // Attributes
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

    // Getters
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

    public ArrayList<String> getSubjects() {
        return subjects;
    }

    // Setters
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

//    public void calcGPA() {
//        Scanner input = new Scanner(System.in);
//        int marks;
//        float totalPoint = 0;
//
//        for (String s : subjects) {
//            System.out.println("What is the marks that you received for " + s + "?");
//            marks = input.nextInt();
//
//            if (marks >= 80 && marks <= 100) {
//                totalPoint += (4.0 * 3);
//            } else if (marks >= 60 && marks <= 79) {
//                totalPoint += (3.0 * 3);
//            } else if (marks >= 50 && marks <= 59) {
//                totalPoint += (2.0 * 3);
//            } else if (marks >= 40 && marks <= 49) {
//                totalPoint += (1.0 * 3);
//            } else {
//                totalPoint += 0.0;
//            }
//        }
//
//        gpa = totalPoint / (subjects.size() * 3);
//
//        System.out.println(name + "'s GPA is " + String.format("%.2f", gpa));
//    }

    public void calcGPA() {
        Scanner input = new Scanner(System.in);
        int marks;
        String grade = "F";
        float totalpoint = 0;

        for(String s: subjects) {
            // Prompt user for the grades that they received for each subjects
            System.out.println("What is the marks that you received for " + s + "?");
            marks = input.nextInt();

            if (marks >= 80 && marks <= 100) {
                grade = "A";
            } else if (marks >= 60 && marks <= 79) {
                grade = "B";
            } else if (marks >= 50 && marks <= 59) {
                grade = "C";
            } else if (marks >= 40 && marks <= 49) {
                grade = "D";
            } else if (marks >= 0 && marks <= 39){
                grade = "F";
            } else {
                System.out.println("Invalid marks!");
            }

            // Find the grade point based on grades
            switch (grade) {
                case "A":
                    totalpoint += (4.0 * 3);
                    break;
                case "B":
                    totalpoint += (3.0 * 3);
                    break;
                case "C":
                    totalpoint += (2.0 * 3);
                    break;
                case "D":
                    totalpoint += (1.0 * 3);
                    break;
                default:
                    totalpoint += 0;

            }
//            if (grade.equals("A")) {
//                totalpoint += (4.0 * 3);
//            } else if (grade.equals("B")) {
//                totalpoint += (3.0 * 3);
//            } else if (grade.equals("C")) {
//                totalpoint += (2.0 * 3);
//            } else if (grade.equals("D")) {
//                totalpoint += (1.0 * 3);
//            } else {
//                totalpoint += 0;
//            }
        }

        // Find the average of the grade point, which is the GPA
        this.gpa = totalpoint / (subjects.size()*3);

        // Display the GPA
        System.out.println(name + "'s GPA is " + String.format("%.2f", this.gpa));
    }

    // Find the average of all GPA that you have received so far
    public void calcCGPA() {
        Scanner input = new Scanner(System.in);
        int sem;
        double totalgpa = 0.0;

        // Prompt user how many semesters have they passed?
        System.out.println("Hello, how many semesters have you passed? ");
        sem = input.nextInt();

        // For each semester, prompt user the GPA that they have received?
        for(int i = 0; i < sem; i++) {
            System.out.println("What is your GPA for Sem " + (i+1) + "? ");
            totalgpa += input.nextDouble();
        }

        // Find the average of the GPA, which is the CGPA
        this.cgpa = totalgpa / sem;

        // Display the CGPA
        System.out.println(name + "'s CGPA is " + String.format("%.2f", this.cgpa));
    }

    @Override
    public String toString() {
        return "Student ID: " + id +
                "\nName: " + name +
                "\nProgramme: " + programme +
                "\nSubjects: " + subjects;
    }
}
