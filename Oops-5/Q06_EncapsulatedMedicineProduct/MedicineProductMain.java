// Non-public domain class: MedicineProduct
class MedicineProduct {
    // Private - cannot be reached directly from outside this class
    private String medicineName;
    private String batchNo;
    private double price;

    MedicineProduct(String medicineName, String batchNo, double price) {
        this.medicineName = medicineName;
        this.batchNo = batchNo;
        this.price = price;
    }

    // Public getters - controlled read access
    public String getMedicineName() { return medicineName; }
    public String getBatchNo() { return batchNo; }
    public double getPrice() { return price; }

    // Public setters - controlled write access
    public void setMedicineName(String medicineName) { this.medicineName = medicineName; }
    public void setBatchNo(String batchNo) { this.batchNo = batchNo; }
    public void setPrice(double price) { this.price = price; }

    void displayProduct() {
        System.out.println("Product : " + medicineName + " | Batch: " + batchNo + " | Price: " + price);
    }
}

public class MedicineProductMain {
    public static void main(String[] args) {
        MedicineProduct product = new MedicineProduct("Ibuprofen", "B2026-114", 45.0);
        product.displayProduct();

        // Reading a field only through its getter
        System.out.println("Current price (via getter): " + product.getPrice());

        // Updating a field only through its setter
        product.setPrice(50.0);
        product.displayProduct();

        // product.price would NOT compile here - the field is private
    }
}
