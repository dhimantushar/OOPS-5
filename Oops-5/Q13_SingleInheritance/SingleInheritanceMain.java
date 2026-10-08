// Super class: Employee
class Employee {
    protected int employeeId;
    protected String employeeName;
    protected double salary;

    Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    void displayEmployee() {
        System.out.println("ID: " + employeeId + " | Name: " + employeeName + " | Salary: " + salary);
    }
}

// Child class: Pharmacist - single inheritance, one parent (Employee), one child (Pharmacist)
class Pharmacist extends Employee {
    private String licenseNo;

    Pharmacist(int employeeId, String employeeName, double salary, String licenseNo) {
        super(employeeId, employeeName, salary); // initializes the Employee part
        this.licenseNo = licenseNo;
    }

    void displayPharmacist() {
        displayEmployee();       // inherited (super class) behavior
        System.out.println("License No: " + licenseNo); // child-specific data
    }
}

public class SingleInheritanceMain {
    public static void main(String[] args) {
        Pharmacist pharmacist = new Pharmacist(701, "Neha Joshi", 45000, "PH-20260055");
        pharmacist.displayPharmacist();
    }
}
