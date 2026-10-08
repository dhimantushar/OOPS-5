// Non-public domain class: Hospital
class Hospital {
    // public - reachable directly from any other class, including Main
    public String hospitalName;
    public String hospitalCode;

    public Hospital() {
        hospitalName = "COER City Hospital";
        hospitalCode = "H-001";
    }

    public void displayHospital() {
        System.out.println("Hospital Name: " + hospitalName + " | Code: " + hospitalCode);
    }
}

public class PublicAccessMain {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        // Allowed because hospitalName and hospitalCode are public:
        // any other class can read or write them directly.
        System.out.println("Direct access -> " + hospital.hospitalName + ", " + hospital.hospitalCode);
        hospital.hospitalName = "COER Multispeciality Hospital";

        hospital.displayHospital();
    }
}
