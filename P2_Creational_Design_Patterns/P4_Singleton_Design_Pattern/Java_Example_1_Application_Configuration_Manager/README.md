# Application Configuration Manager – Singleton Pattern

## 📌 Overview
This project demonstrates **why and how to use the Singleton Design Pattern**
using a realistic **Application Configuration Manager** example.

The refactor ensures:
- Configuration is loaded **only once**
- A **single shared instance** is used across the application
- Thread-safe, lazy initialization

This is a **classic and valid Singleton use case**, commonly discussed in LLD interviews.

---

## ❌ Problem in Original Design
Before refactoring:
- Each service created its own `AppConfig` instance
- Configuration was loaded multiple times
- Extra I/O and memory usage
- No guarantee of global consistency

---

## ✅ Refactored Design (Singleton Pattern)

### 🎯 Design Goals
- Single instance across JVM
- Lazy initialization
- Thread safety
- Controlled object creation

---

## 🧱 Core Class: `AppConfig`

```java
public class AppConfig {

    private static volatile AppConfig instance = null;
    private static final Lock mutexLock = new ReentrantLock();

    private Map<String, String> configs = new HashMap<>();

    private AppConfig() {
        loadConfigs();
    }

    public static AppConfig getInstance() {
        if (instance == null) {
            mutexLock.lock();
            try {
                if (instance == null) {
                    instance = new AppConfig();
                }
            } finally {
                mutexLock.unlock();
            }
        }
        return instance;
    }

    private void loadConfigs() {
        System.out.println("Loading configuration from file...");
        configs.put("db.url", "jdbc:mysql://localhost:3306/appdb");
        configs.put("db.user", "admin");
        configs.put("timeout", "5000");
    }

    public String get(String key) {
        return configs.get(key);
    }
}
```

---

## 🔐 Why `volatile` Is Required
- Prevents instruction reordering
- Ensures visibility across threads
- Mandatory for correct double-checked locking

---

## 🔁 Singleton Technique Used
**Double-Checked Locking with explicit Lock**
- Improves performance by avoiding unnecessary locking
- Ensures correctness in multithreaded environments

---

## 🧠 How Services Use the Singleton

```java
AppConfig config = AppConfig.getInstance();
String dbUrl = config.get("db.url");
```

All services receive the **same shared instance**.

---

## 🧪 Thread Safety Guarantee
- `ReentrantLock` ensures mutual exclusion
- Lock released safely using `finally`
- Instance created exactly once

---

## 🧠 Design Principles Applied
- Singleton Design Pattern
- Encapsulation
- Lazy Initialization
- Thread Safety
- Controlled global access

---

## 🚨 Interview Talking Points
- Why Singleton is appropriate here
- Why `static` methods are not enough
- Singleton vs Dependency Injection
- How to break Singleton (reflection, serialization)
- When NOT to use Singleton

---

## 🚀 Possible Enhancements
- Use Static Inner Helper Class
- Use Enum Singleton
- Add protection against reflection
- Externalize configuration source
- Integrate with DI framework (Spring)

---

## 📚 Conclusion
This refactor demonstrates a **correct, thread-safe Singleton implementation**
using a **real-world configuration manager** scenario.

---

**Author:** Surajit Rana  
**Topic:** Singleton Design Pattern (LLD Interview Prep)
