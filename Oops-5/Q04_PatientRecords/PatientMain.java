// Non-public domain class: Patient
class Patient {
    int patientId;
    String patientName;
    int age;

    Patient(int patientId, String patientName, int age) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
    }

    void displayPatient() {
        System.out.println("ID: " + patientId + " | Name: " + patientName + " | Age: " + age);
    }
}

// Non-public processing class - the loop over the array lives here, not in main
class PatientManager {
    void displayAllPatients(Patient[] patients) {
        System.out.println("-- Patient Records --");
        for (int i = 0; i < patients.length; i++) { // local loop variable i
            patients[i].displayPatient();
        }
    }
}

public class PatientMain {
    public static void main(String[] args) {
        Patient[] patients = new Patient[]{
            new Patient(101, "Ananya", 8),
            new Patient(102, "Rajesh Kumar", 65),
            new Patient(103, "Priya Singh", 30),
            new Patient(104, "Mohit", 35),
            new Patient(105, "Ritu Das", 50)
        };

        PatientManager manager = new PatientManager();
        manager.displayAllPatients(patients);
    }
}
