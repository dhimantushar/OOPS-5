// Super class: MedicalStaff
class MedicalStaff {
    protected int staffId;
    protected String staffName;

    MedicalStaff(int staffId, String staffName) {
        this.staffId = staffId;
        this.staffName = staffName;
    }
}

// Child class 1: Doctor - keeps its own data private while using inherited protected data
class Doctor extends MedicalStaff {
    private String specialization;

    Doctor(int staffId, String staffName, String specialization) {
        super(staffId, staffName); // parent part
        this.specialization = specialization;
    }

    void displayDoctor() {
        // staffId and staffName are used directly - they are protected, so
        // this subclass can reach them without any getter.
        System.out.println("Staff ID: " + staffId + " | Name: " + staffName
                + " | Specialization: " + specialization);
    }
}

// Child class 2: Pharmacist - same pattern as Doctor
class Pharmacist extends MedicalStaff {
    private String licenseNo;

    Pharmacist(int staffId, String staffName, String licenseNo) {
        super(staffId, staffName);
        this.licenseNo = licenseNo;
    }

    void displayPharmacist() {
        System.out.println("Staff ID: " + staffId + " | Name: " + staffName
                + " | License No: " + licenseNo);
    }
}

public class MedicalStaffMain {
    public static void main(String[] args) {
        Doctor doctor = new Doctor(901, "Arvind Rao", "Cardiology");
        Pharmacist pharmacist = new Pharmacist(902, "Neha Joshi", "PH-20260055");

        doctor.displayDoctor();
        pharmacist.displayPharmacist();
    }
}
