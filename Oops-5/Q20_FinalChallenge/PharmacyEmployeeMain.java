// Super class: Employee
class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;

    // protected - lets Pharmacist/StoreManager set and read this directly,
    // which is the genuine benefit of protected access through inheritance
    protected String department;

    // Shared by every Employee object
    static int employeeCount;

    Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        setSalary(salary); // routed through the setter so the negative-salary rule always applies
        this.department = "General";
        employeeCount++;
    }

    public int getEmployeeId() { return employeeId; }
    public String getEmployeeName() { return employeeName; }
    public double getSalary() { return salary; }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Rejected: salary cannot be negative for " + employeeName);
        }
    }

    // Default-access (package-private) method - no access keyword written
    void logActivity(String activity) {
        System.out.println("[LOG] " + employeeName + ": " + activity);
    }

    void displayEmployee() {
        System.out.println("ID: " + employeeId + " | Name: " + employeeName
                + " | Salary: " + salary + " | Department: " + department);
    }
}

// Child class 1: Pharmacist
class Pharmacist extends Employee {
    private String licenseNo;

    Pharmacist(int employeeId, String employeeName, double salary, String licenseNo) {
        super(employeeId, employeeName, salary);
        this.licenseNo = licenseNo;
        this.department = "Pharmacy"; // direct use of the inherited protected field
    }

    public String getLicenseNo() { return licenseNo; }

    void displayPharmacist() {
        displayEmployee();
        System.out.println("  License No: " + licenseNo);
        logActivity("dispensed medicine"); // calling the inherited default-access method
    }
}

// Child class 2: StoreManager
class StoreManager extends Employee {
    private int storeSection;

    StoreManager(int employeeId, String employeeName, double salary, int storeSection) {
        super(employeeId, employeeName, salary);
        this.storeSection = storeSection;
        this.department = "Store"; // direct use of the inherited protected field
    }

    public int getStoreSection() { return storeSection; }

    void displayStoreManager() {
        displayEmployee();
        System.out.println("  Store Section: " + storeSection);
        logActivity("managed store section " + storeSection);
    }
}

// Non-public utility class - all processing, filtering and totals live here, not in main
class PharmacyEmployeeManager {
    void processStaff(Employee[] staff) {
        double totalSalary = 0;   // local variable - running total
        int pharmacistCount = 0;  // local variable - counter

        for (Employee employee : staff) {
            totalSalary += employee.getSalary();

            // Identify the role (condition) and call its specific display method
            if (employee instanceof Pharmacist pharmacist) {
                pharmacist.displayPharmacist();
                pharmacistCount++;
            } else if (employee instanceof StoreManager storeManager) {
                storeManager.displayStoreManager();
            }
        }

        System.out.println("\nTotal employees registered : " + Employee.employeeCount);
        System.out.println("Total salary paid           : " + totalSalary);
        System.out.println("Pharmacists on staff        : " + pharmacistCount);
    }
}

public class PharmacyEmployeeMain {
    public static void main(String[] args) {
        // Employee: super class
        // Pharmacist, StoreManager: child classes
        Employee[] staff = new Employee[]{
            new Pharmacist(2001, "Neha Joshi", 45000, "PH-20260055"),
            new StoreManager(2002, "Ravi Chandran", 52000, 3)
        };

        PharmacyEmployeeManager manager = new PharmacyEmployeeManager();
        manager.processStaff(staff);
    }
}
