# Ride Invoice System - SRP Refactoring

This project demonstrates the application of the **Single Responsibility Principle (SRP)** from the SOLID principles in a simulated ride invoice system (like Uber/Ola).

---

## ✅ Refactoring Summary

The original `RideInvoice` class violated SRP by handling:
- Fare calculation
- Database persistence
- Email delivery

Each responsibility has now been moved to its own class/module, making the system more modular, maintainable, and extensible.

---

## 📁 Project Structure

```
Refactored_Code/
├── Main.java                         # Driver class to coordinate everything
├── FareCalculator.java              # Calculates fare based on distance and time
├── RideDetails.java                 # POJO for ride data
├── UserDetails.java                 # POJO for customer data (e.g., email)
├── reporter/
│   ├── IInvoiceGenerator.java       # Interface for invoice delivery
│   └── impl/
│       └── EmailInvoiceGenerator.java # Email implementation of invoice generation
├── persistence/
│   ├── IDBPersistence.java          # Interface for DB persistence
│   └── impl/
│       └── RideDBPersistence.java   # Concrete implementation of DB logic
```

---

## 🧠 SRP Evaluation

| Class | Responsibility | Status |
|-------|----------------|--------|
| `RideDetails` | Holds ride data | ✅ Clean separation |
| `UserDetails` | Holds customer data | ✅ SRP-aligned |
| `FareCalculator` | Calculates fare | ✅ Excellent |
| `IInvoiceGenerator` + `EmailInvoiceGenerator` | Handles invoice sending | ✅ Proper SRP |
| `IDBPersistence` + `RideDBPersistence` | Handles DB persistence | ✅ Separation achieved |
| `Main` | Orchestrates responsibilities | ✅ SRP upheld |

---

## 💡 Suggestions

- Add appropriate `package` declarations in each class file.
- Consider renaming:
  - `RideDetails` → `Ride`
  - `UserDetails` → `Customer`
- This setup is now well-prepared to be extended using the **Open/Closed Principle** (e.g., add PDFInvoiceGenerator or CloudPersistence).

---

## 🏁 Status

✅ **SRP Evaluation: PASS**

You're now ready to move to the next SOLID principle: **Open/Closed Principle (OCP)**.
