// Non-public domain class: Employee
class Employee {
    // private - cannot be reached directly from outside this class, not even from Main
    private int employeeId;
    private String employeeName;
    private double salary;

    Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public int getEmployeeId() { return employeeId; }
    public String getEmployeeName() { return employeeName; }
    public double getSalary() { return salary; }

    public void displayEmployee() {
        System.out.println("ID: " + employeeId + " | Name: " + employeeName + " | Salary: " + salary);
    }
}

public class PrivateAccessMain {
    public static void main(String[] args) {
        Employee employee = new Employee(501, "Karan Mehta", 45000);

        // The only way Main can read the data - through public getters/displayEmployee()
        System.out.println("Name (via getter): " + employee.getEmployeeName());
        employee.displayEmployee();

        // employee.salary = 100000; would NOT compile - salary is private to Employee
    }
}
