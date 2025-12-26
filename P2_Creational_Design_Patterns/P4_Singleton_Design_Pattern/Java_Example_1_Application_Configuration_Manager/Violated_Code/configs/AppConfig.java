package P2_Creational_Design_Patterns.P4_Singleton_Design_Pattern.Java_Example_1_Application_Configuration_Manager.Violated_Code.configs;

import java.util.HashMap;
import java.util.Map;

public class AppConfig {
    private Map<String, String> configs = new HashMap<String, String>();

    public AppConfig() {
        loadConfigs();
    }

    private void loadConfigs() {
        // Simulating expensive I/O
        System.out.println("Loading configuration from file...");
        configs.put("db.url", "jdbc:mysql://localhost:3306/appdb");
        configs.put("db.user", "admin");
        configs.put("timeout", "5000");
    }

    public String get(String key) {
        return configs.get(key);
    }
}
