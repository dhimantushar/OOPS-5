// Non-public domain class: Student
class Student {
    String name;
    int rollNo;
    double marks;

    // No-argument constructor initializing suitable default values
    Student() {
        name = "Aarav Sharma";
        rollNo = 25280055;
        marks = 88.5;
    }

    // All display logic lives here, not in main
    void displayDetails() {
        System.out.println("Name   : " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks  : " + marks);
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student();
        student.displayDetails();
    }
}
