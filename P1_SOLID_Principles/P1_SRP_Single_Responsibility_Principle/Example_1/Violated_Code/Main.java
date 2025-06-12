package P1_SOLID_Principles.P1_SRP_Single_Responsibility_Principle.Example_1.Violated_Code;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Siri", 22, 1500000);

        String employeeDetails = employee.getDetails();
        boolean isValid = employee.isValid();
        System.out.println(employeeDetails);
        System.out.println(isValid);
        employee.saveToDatabase();
        employee.generatePDFReport();
    }
}

class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Responsibility 1: Business logic (employee info)
    public String getDetails() {
        return name + " (" + age + " years) earns ₹" + salary;
    }

    // Responsibility 2: Persistence logic (saving to DB)
    public void saveToDatabase() {
        // Simulated DB operation
        System.out.println("Saving " + name + " to database...");
    }

    // Responsibility 3: Reporting logic (export to file)
    public void generatePDFReport() {
        System.out.println("Generating PDF report for " + name);
    }

    // Responsibility 4: Validation logic
    public boolean isValid() {
        return name != null && !name.isEmpty() && age > 0 && salary > 0;
    }
}
