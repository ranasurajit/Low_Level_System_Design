
# 📡 Weather Monitoring System — Observer Design Pattern

This project is a refactored implementation of the **Observer Design Pattern** using a weather monitoring system domain. It replaces tightly coupled components with loosely coupled observer logic.

---

## ✅ Project Structure

```
Refactored_Code/
├── Main.java
├── observers/
│   ├── WeatherObserver.java
│   └── impl/
│       ├── DataLogger.java
│       ├── DisplayUnit.java
│       └── HeatAlert.java
└── subjects/
    ├── WeatherSubject.java
    └── impl/
        └── WeatherStation.java
```

---

## 🧪 Observer Design Pattern Components

### 🔹 `WeatherSubject` Interface
Defines the contract for adding, removing, and notifying observers.

### 🔹 `WeatherObserver` Interface
Generic `update(int temperature, int humidity)` method used by all observers.

### 🔹 Concrete Observers
- `DisplayUnit`: Prints temperature and humidity.
- `DataLogger`: Logs data (simulated via console).
- `HeatAlert`: Alerts if temperature exceeds a threshold.

### 🔹 `WeatherStation` Class
Implements `WeatherSubject` and maintains a set of observers. Notifies them when data changes.

---

## ✅ Feedback Summary

| Area                     | Status | Notes |
|--------------------------|--------|-------|
| Interface Design         | ✅     | Clean, extensible naming (`update`) |
| Decoupling Achieved      | ✅     | Well-separated responsibilities |
| Subject Implementation   | ✅     | Efficient and correct |
| Observer Flexibility     | ✅     | Reusable and interchangeable |
| Naming & Clarity         | ✅     | Clear and idiomatic |
| Testability              | ⚠️     | Suggest adding JUnit tests |

---

## 🛠 Suggestions for Improvement

1. **Method Naming**  
   Rename `showAlert` → `update` in `WeatherObserver` for generality. ✔️ *Already Done*

2. **Encapsulation**  
   Mark `observers` as `private` and possibly `final`.

3. **Variable Naming**  
   Use `observers` instead of `observersSet` — avoid leaking implementation detail.

4. **Optional Enhancements**
   - Use `WeatherData` object instead of raw temperature/humidity.
   - Allow dynamic removal of observers.
   - Add test coverage using JUnit.
   - Use `List` instead of `Set` if notification order matters.
   - Consider thread safety for concurrent environments.

---

## 🧠 Suggested Next Steps

- Add unregister-after-N-alerts logic.
- Refactor to pass a `WeatherData` DTO.
- Set up Maven/Gradle and add JUnit test scaffolding.
- Visualize the observer tree via simple CLI or UI.
