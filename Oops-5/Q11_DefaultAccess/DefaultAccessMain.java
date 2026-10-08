// Default-access (package-private) class: no modifier before "class"
class Pharmacy {
    // Default-access instance variables - no access keyword written
    String medicineName;
    double price;

    // Default-access constructor - no access keyword written
    Pharmacy() {
        medicineName = "Cetirizine";
        price = 15.0;
    }

    // Default-access method - no access keyword written
    void displayMedicine() {
        System.out.println("Medicine: " + medicineName + " | Price: " + price);
    }
}

public class DefaultAccessMain {
    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy();

        // Allowed only because DefaultAccessMain and Pharmacy are in the same
        // package - default access is visible anywhere in the same package.
        System.out.println("Direct access -> " + pharmacy.medicineName + ", " + pharmacy.price);

        pharmacy.displayMedicine();
    }
}
