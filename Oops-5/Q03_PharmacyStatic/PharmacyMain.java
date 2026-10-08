// Non-public domain class: Pharmacy
class Pharmacy {
    String pharmacyName;      // instance variable - each object has its own copy
    String location;          // instance variable

    static int pharmacyCount; // class variable - shared by every Pharmacy object

    Pharmacy(String pharmacyName, String location) {
        this.pharmacyName = pharmacyName;
        this.location = location;
        pharmacyCount++; // one shared counter, incremented for every object created
    }

    void displayPharmacy() {
        System.out.println("Pharmacy : " + pharmacyName + ", Location: " + location);
    }

    void displayPharmacyCount() {
        System.out.println("Total pharmacies registered so far: " + pharmacyCount);
    }
}

public class PharmacyMain {
    public static void main(String[] args) {
        Pharmacy p1 = new Pharmacy("City Pharmacy", "Roorkee");
        Pharmacy p2 = new Pharmacy("Health Plus", "Haridwar");
        Pharmacy p3 = new Pharmacy("MedCare", "Dehradun");

        p1.displayPharmacy();
        p2.displayPharmacy();
        p3.displayPharmacy();

        // pharmacyCount belongs to the class, not to main; read through the object
        p1.displayPharmacyCount();
    }
}
