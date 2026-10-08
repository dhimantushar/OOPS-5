// Non-public domain class: Medicine
class Medicine {
    String medicineName;
    int ageLimit;

    Medicine(String medicineName, int ageLimit) {
        this.medicineName = medicineName;
        this.ageLimit = ageLimit;
    }

    // The eligibility decision is made here, inside the method, not in main
    String checkEligibility(int patientAge) {
        String result; // local variable to hold the decision
        if (patientAge >= ageLimit) {
            result = "Eligible";
        } else {
            result = "Not Eligible";
        }
        return result;
    }
}

public class EligibilityMain {
    public static void main(String[] args) {
        Medicine medicine = new Medicine("Ibuprofen", 12);

        System.out.println("Age 8  -> " + medicine.checkEligibility(8));
        System.out.println("Age 25 -> " + medicine.checkEligibility(25));
    }
}
