package P2_Creational_Design_Patterns.P4_Singleton_Design_Pattern.Java_Example_1_Application_Configuration_Manager.Violated_Code.services;

import P2_Creational_Design_Patterns.P4_Singleton_Design_Pattern.Java_Example_1_Application_Configuration_Manager.Violated_Code.configs.AppConfig;

public class DatabaseService {
    private AppConfig config = new AppConfig();

    public void connect() {
        System.out.println("Connecting to DB: " + config.get("db.url"));
    }
}
