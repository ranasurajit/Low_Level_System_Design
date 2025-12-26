package P2_Creational_Design_Patterns.P4_Singleton_Design_Pattern.Java_Example_1_Application_Configuration_Manager.Refactored_Code.configs;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AppConfig {
    private static volatile AppConfig _instance = null;
    private Map<String, String> configs = new HashMap<String, String>();
    private static final Lock mutexLock = new ReentrantLock();

    private AppConfig() {
        loadConfigs();
    }

    public static AppConfig getInstance() {
        if (_instance == null) {
            mutexLock.lock(); // acquiring the lock
            try {
                if (_instance == null) {
                    _instance = new AppConfig();
                }
            } finally {
                mutexLock.unlock(); // releasing the lock
            }
        }
        return _instance;
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
