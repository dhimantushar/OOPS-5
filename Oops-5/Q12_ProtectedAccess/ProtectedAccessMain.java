// Super class: HospitalStaff
class HospitalStaff {
    // protected - reachable directly inside this class and inside any subclass
    protected int staffId;
    protected String staffName;

    protected HospitalStaff(int staffId, String staffName) {
        this.staffId = staffId;
        this.staffName = staffName;
    }

    protected void displayStaff() {
        System.out.println("Staff ID: " + staffId + " | Name: " + staffName);
    }
}

// Child class: Pharmacist extends HospitalStaff
class Pharmacist extends HospitalStaff {
    private String licenseNo;

    Pharmacist(int staffId, String staffName, String licenseNo) {
        super(staffId, staffName); // initializes the protected fields in the parent
        this.licenseNo = licenseNo;
    }

    void displayPharmacist() {
        // staffId and staffName are reached directly here because they are
        // protected in the parent class and this class inherits from it.
        System.out.println("Staff ID: " + staffId + " | Name: " + staffName + " | License: " + licenseNo);
    }
}

public class ProtectedAccessMain {
    public static void main(String[] args) {
        Pharmacist pharmacist = new Pharmacist(601, "Neha Joshi", "PH-20260055");
        pharmacist.displayPharmacist();
    }
}
