package P2_Creational_Design_Patterns.P4_Singleton_Design_Pattern.Java_Example_1_Application_Configuration_Manager.Refactored_Code.services;

import P2_Creational_Design_Patterns.P4_Singleton_Design_Pattern.Java_Example_1_Application_Configuration_Manager.Refactored_Code.configs.AppConfig;

public class ApiService {
    private AppConfig config = AppConfig.getInstance();

    public void callApi() {
        System.out.println("API timeout: " + config.get("timeout"));
    }
}
