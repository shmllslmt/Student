public class Main {
    public static void main(String[] args) {
        Student kuzibin = new Student("DIT0001B", "Ku Zi Bin");
        kuzibin.setProgramme("Diploma in Information Technology");
        kuzibin.introduce();

        kuzibin.enrollCourse("Object-Oriented Programming");
        kuzibin.enrollCourse("Human Computer Interaction");
        kuzibin.enrollCourse("Operating System");

//        kuzibin.calcGPA();
        kuzibin.calcCGPA();
    }
}