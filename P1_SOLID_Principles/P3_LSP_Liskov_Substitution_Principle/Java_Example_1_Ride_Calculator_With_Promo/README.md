# 🚕 Ride Fare System - SOLID Principle: Liskov Substitution Principle (LSP)

This project demonstrates the **Liskov Substitution Principle (LSP)** from the SOLID principles in a cab ride system involving standard paid rides and free promo rides.

---

## ❌ Problem Statement (Before Refactoring)

The system used a base class `Ride` with a method `calculateFare()`. A subclass `FreePromoRide` overrode that method to **throw an exception**, which broke the behavioral contract of the base class.

### 🔥 Violation Example

```java
public class FreePromoRide extends Ride {
    @Override
    public double calculateFare() {
        throw new UnsupportedOperationException("Free rides do not calculate fare.");
    }
}
```

This is a classic **LSP violation** — because a subclass (`FreePromoRide`) cannot safely replace its base class (`Ride`) in all scenarios.

---

## ✅ Refactored Design

To follow LSP, the design was refactored as follows:

### 🧱 Class Hierarchy

| Class | Role |
|-------|------|
| `Ride` | Abstract base class for all ride types (shared fields only) |
| `FareRide` | Abstract subclass for rides that support fare calculation |
| `StandardRide` | Extends `FareRide`, provides actual fare logic |
| `FreePromoRide` | Extends `Ride` only, doesn't implement fare logic |

### 🏭 Factory Class

- `RideFactory` creates `StandardRide` or `FreePromoRide` based on `RideEnum`.

### 🧪 Usage in Main

- `Main.java` calls `calculateFare()` **only** on instances of `FareRide`.
- Promo rides are treated differently and safely displayed without invoking fare logic.

---

## 📁 Project Structure

```
Refactored_Code/
├── Main.java
├── Ride.java
├── FareRide.java
├── StandardRide.java
├── FreePromoRide.java
├── RideEnum.java
└── RideFactory.java
```

---

## 🧠 LSP Evaluation

| Contract | Class | Result |
|----------|-------|--------|
| `calculateFare()` | `StandardRide` | ✅ Implements correctly |
| `calculateFare()` | `FreePromoRide` | ❌ Not implemented — but not required! ✅ LSP preserved |
| `RideFactory.getRide()` | Returns correct type | ✅ |
| `Main.java` | Treats rides correctly | ✅ |

---

## ✅ Result

- Only fare-capable rides expose the `calculateFare()` method.
- No exceptions or contract violations at runtime.
- Perfect compliance with the **Liskov Substitution Principle**.

✅ **LSP Evaluation: PASS**

You're now ready for **Class 4: Interface Segregation Principle (ISP)**!
