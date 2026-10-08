// Non-public domain class: Medicine
class Medicine {
    String medicineName;
    String batchNo;
    double price;

    // Parameterized constructor - 'this' distinguishes fields from parameters
    Medicine(String medicineName, String batchNo, double price) {
        this.medicineName = medicineName;
        this.batchNo = batchNo;
        this.price = price;
    }

    void displayMedicine() {
        System.out.println("Medicine Name : " + this.medicineName);
        System.out.println("Batch No      : " + this.batchNo);
        System.out.println("Price         : " + this.price);
    }
}

public class MedicineMain {
    public static void main(String[] args) {
        Medicine m1 = new Medicine("Paracetamol", "B2026-114", 25.50);
        Medicine m2 = new Medicine("Amoxicillin", "B2026-207", 60.00);

        m1.displayMedicine();
        m2.displayMedicine();
    }
}
