# 🚖 Ride Fare Calculation System - SOLID Principle: Open/Closed Principle (OCP)

This project demonstrates the **Open/Closed Principle (OCP)** from the SOLID principles using a real-world example from a ride-hailing app (like Uber or Ola). It shows how to design a system where fare calculation for different ride types can be extended **without modifying existing code**.

---

## 🔍 Problem Statement

Originally, the fare calculation logic used a long `if-else` block inside a `FareCalculator` class to calculate fares based on the ride type. Every time a new type (e.g., "Luxury", "Electric") was introduced, the core class had to be changed — **violating the OCP**.

---

## ✅ Refactored Design Summary

To follow OCP, the logic was refactored as follows:

### ✅ Interface

- `IFareCalculator`: Defines a contract for fare calculation.

### ✅ Implementations

- `StandardFareCalculator`: Calculates fare for standard rides.
- `LuxuryFareCalculator`: Calculates fare for luxury rides (adds a surcharge).
- `ElectricFareCalculator`: Calculates fare for electric rides (adds a discount).

Each implementation is independent and adheres to the `IFareCalculator` interface.

### ✅ Factory

- `FareCalculatorFactory`: Returns the appropriate fare calculator based on a ride type string. This allows new ride types to be plugged in with zero changes to the consumer code.

### ✅ Main

- `Main.java`: Demonstrates usage by calculating fares for all supported ride types through the factory.

---

## 📁 Project Structure

```
Refactored_Code/
├── Main.java                          # Entry point
├── IFareCalculator.java              # Interface for fare calculation
├── StandardFareCalculator.java       # Implements standard ride logic
├── LuxuryFareCalculator.java         # Implements luxury ride logic
├── ElectricFareCalculator.java       # Implements electric ride logic
└── FareCalculatorFactory.java        # Encapsulates object creation
```

---

## 🧠 OCP Evaluation

| Component | Responsibility | SRP | OCP |
|-----------|----------------|-----|-----|
| `IFareCalculator` | Abstraction | ✅ | ✅ |
| `StandardFareCalculator`, etc. | Concrete fare logic | ✅ | ✅ |
| `FareCalculatorFactory` | Object creation | ✅ | ✅ |
| `Main` | Application coordinator | ✅ | ✅ |

---

## 🏆 Result

- New ride types can be added easily without modifying existing code.
- Main program is decoupled from fare calculation logic.
- Follows **Open/Closed Principle** with clean, testable structure.

✅ **OCP Evaluation: PASS**

You're now ready for Class 3: **Liskov Substitution Principle (LSP)**!
