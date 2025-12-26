package P2_Creational_Design_Patterns.P4_Singleton_Design_Pattern.Java_Example_1_Application_Configuration_Manager.Refactored_Code.services;

import P2_Creational_Design_Patterns.P4_Singleton_Design_Pattern.Java_Example_1_Application_Configuration_Manager.Refactored_Code.configs.AppConfig;

public class DatabaseService {
    private AppConfig config = AppConfig.getInstance();

    public void connect() {
        System.out.println("Connecting to DB: " + config.get("db.url"));
    }
}
