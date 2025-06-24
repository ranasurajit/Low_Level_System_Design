package P1_SOLID_Principles.P1_SRP_Single_Responsibility_Principle.Java_Example_1.Refactored_Code.entity;

public class EntityValidator {
    public boolean isValid(String name, int age, double salary) {
        return name != null && !name.isEmpty() && age > 0 && salary > 0;
    }
}
