// Level 1 - top-level super class: Person
class Person {
    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Level 2 - child of Person, and also the intermediate super class for Manager
class Employee extends Person {
    private int employeeId;

    Employee(String name, int age, int employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    // employeeId stays private to Employee; this protected getter is the
    // controlled way a subclass like Manager can still read it.
    protected int getEmployeeId() {
        return employeeId;
    }
}

// Level 3 - final child class, reaches Person through Employee (multilevel chain)
class Manager extends Employee {
    private int teamSize;

    Manager(String name, int age, int employeeId, int teamSize) {
        super(name, age, employeeId);
        this.teamSize = teamSize;
    }

    void displayManager() {
        // name and age are inherited from Person (level 1), employeeId from
        // Employee (level 2) via its getter - this is the multilevel chain.
        System.out.println("Name: " + name + " | Age: " + age);
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Team Size: " + teamSize);
    }
}

public class MultilevelMain {
    public static void main(String[] args) {
        // Person: top-level super class
        // Employee: child of Person, and intermediate super class for Manager
        // Manager: final child class at the bottom of the chain
        Manager manager = new Manager("Sanjay Mehra", 42, 801, 12);
        manager.displayManager();
    }
}
