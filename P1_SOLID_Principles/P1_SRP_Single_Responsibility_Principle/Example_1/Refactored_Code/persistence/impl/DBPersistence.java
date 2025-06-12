package P1_SOLID_Principles.P1_SRP_Single_Responsibility_Principle.Example_1.Refactored_Code.persistence.impl;

import P1_SOLID_Principles.P1_SRP_Single_Responsibility_Principle.Example_1.Refactored_Code.persistence.IPersistence;

public class DBPersistence implements IPersistence {
    public void save(String name) {
        // Simulated DB operation
        System.out.println("Saving " + name + " to database...");
    }
}
