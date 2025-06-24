package P1_SOLID_Principles.P1_SRP_Single_Responsibility_Principle.Java_Example_1.Refactored_Code.employee;

public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getSalary() {
        return this.salary;
    }

    // Responsibility 1: Business logic (employee info)
    public String getDetails() {
        return name + " (" + age + " years) earns ₹" + salary;
    }
}
