// Top-level super class: Person
class Person {
    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Employee extends Person - Doctor and Pharmacist will reach Person through Employee
class Employee extends Person {
    private int employeeId;
    private double salary;

    // Shared by every Employee object, updated whenever one is constructed
    static int employeeCount;

    Employee(String name, int age, int employeeId, double salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
        employeeCount++;
    }

    public int getEmployeeId() { return employeeId; }
    public double getSalary() { return salary; }

    void displayEmployee() {
        System.out.println("Name: " + name + " | Age: " + age
                + " | Employee ID: " + employeeId + " | Salary: " + salary);
    }
}

// Doctor - descendant of Person through Employee
class Doctor extends Employee {
    private String specialization;

    Doctor(String name, int age, int employeeId, double salary, String specialization) {
        super(name, age, employeeId, salary);
        this.specialization = specialization;
    }

    public String getSpecialization() { return specialization; }
}

// Pharmacist - descendant of Person through Employee
class Pharmacist extends Employee {
    private String licenseNo;

    Pharmacist(String name, int age, int employeeId, double salary, String licenseNo) {
        super(name, age, employeeId, salary);
        this.licenseNo = licenseNo;
    }

    public String getLicenseNo() { return licenseNo; }
}

// Non-public manager class - all the processing/filtering lives here, not in main
class StaffManager {
    void displayStaff(Employee[] staff) {
        System.out.println("-- Hospital Staff (" + Employee.employeeCount + " employees) --");
        for (Employee employee : staff) {
            employee.displayEmployee();

            // Identify role and print role-specific data (filtering condition)
            if (employee instanceof Doctor doctor) {
                System.out.println("  Role: Doctor | Specialization: " + doctor.getSpecialization());
            } else if (employee instanceof Pharmacist pharmacist) {
                System.out.println("  Role: Pharmacist | License No: " + pharmacist.getLicenseNo());
            }
        }
    }
}

public class HospitalStaffMain {
    public static void main(String[] args) {
        // Person: top-level super class
        // Employee: child of Person, and super class for Doctor/Pharmacist
        Employee[] staff = new Employee[]{
            new Doctor("Arvind Rao", 45, 1001, 90000, "Cardiology"),
            new Pharmacist("Neha Joshi", 29, 1002, 45000, "PH-20260055")
        };

        StaffManager manager = new StaffManager();
        manager.displayStaff(staff);
    }
}
