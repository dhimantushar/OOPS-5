// Non-public domain class: Patient
class Patient {
    private String patientName;
    private int age;
    private double weight;

    Patient(String patientName, int age, double weight) {
        this.patientName = patientName;
        this.age = age;
        this.weight = weight;
    }

    public String getPatientName() { return patientName; }
    public int getAge() { return age; }
    public double getWeight() { return weight; }

    public void setPatientName(String patientName) { this.patientName = patientName; }

    // Only accepts a value when age is realistic (not negative)
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Rejected: age cannot be negative (" + age + ").");
        }
    }

    // Only accepts a value when weight is realistic (strictly positive)
    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Rejected: weight must be greater than zero (" + weight + ").");
        }
    }

    void displayPatient() {
        System.out.println("Patient: " + patientName + " | Age: " + age + " | Weight: " + weight + " kg");
    }
}

public class PatientMain {
    public static void main(String[] args) {
        Patient patient = new Patient("Ritu Das", 30, 58.0);
        patient.displayPatient();

        System.out.println("\n-- Valid updates --");
        patient.setAge(32);
        patient.setWeight(60.5);
        patient.displayPatient();

        System.out.println("\n-- Invalid updates (should be rejected) --");
        patient.setAge(-5);
        patient.setWeight(-10.0);
        patient.displayPatient();

        // patient.age = -5; would NOT compile - age is private
    }
}
