package P2_Creational_Design_Patterns.P4_Singleton_Design_Pattern.Java_Example_1_Application_Configuration_Manager.Violated_Code.services;

import P2_Creational_Design_Patterns.P4_Singleton_Design_Pattern.Java_Example_1_Application_Configuration_Manager.Violated_Code.configs.AppConfig;

public class ApiService {
    private AppConfig config = new AppConfig();

    public void callApi() {
        System.out.println("API timeout: " + config.get("timeout"));
    }
}
