package P2_Creational_Design_Patterns.P4_Singleton_Design_Pattern.Java_Example_1_Application_Configuration_Manager.Violated_Code;

import P2_Creational_Design_Patterns.P4_Singleton_Design_Pattern.Java_Example_1_Application_Configuration_Manager.Violated_Code.services.ApiService;
import P2_Creational_Design_Patterns.P4_Singleton_Design_Pattern.Java_Example_1_Application_Configuration_Manager.Violated_Code.services.DatabaseService;

public class Main {
    public static void main(String[] args) {
        DatabaseService dbService = new DatabaseService();
        dbService.connect();

        ApiService apiService = new ApiService();
        apiService.callApi();
    }
}
