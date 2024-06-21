public class Main {
    public static void main(String[] args) {
        // Construct a Student object using the parameterized constructor
        Student kuzibin = new Student("DIT0001B", "Ku Zi Bin");

        // Set the value for the programme attribute
        kuzibin.setProgramme("Diploma in Information Technology");

        // Function call to the introduce method
//        kuzibin.introduce();

        // Add course to the subjects ArrayList
        kuzibin.enrollCourse("Object-Oriented Programming");
        kuzibin.enrollCourse("Human Computer Interaction");
        kuzibin.enrollCourse("Operating System");

        // Finding the student's GPA
//        kuzibin.calcGPA();
        // Finding the student's CGPA
//        kuzibin.calcCGPA();

        System.out.println(kuzibin);
    }
}