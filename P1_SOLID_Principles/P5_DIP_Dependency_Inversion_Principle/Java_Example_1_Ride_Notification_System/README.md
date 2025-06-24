# 🚕 Ride Notification System – SOLID Principle: Dependency Inversion Principle (DIP)

This project showcases the **Dependency Inversion Principle (DIP)** using a ride completion notification system in a cab service app.

---

## 📌 What is DIP?

> **"High-level modules should not depend on low-level modules. Both should depend on abstractions."**  
> **"Abstractions should not depend on details. Details should depend on abstractions."**

---

## ❌ Original Problem (DIP Violation)

In the original version:
- `RideService` directly instantiated `EmailNotificationService` and `SMSNotificationService`.
- This tightly coupled the business logic to specific implementations.
- It violated DIP, making it difficult to extend or test.

---

## ✅ Refactored Design (DIP Compliant)

### Key Components:

| Type                   | Name                        | Role                                           |
|------------------------|-----------------------------|------------------------------------------------|
| Interface (Abstraction)| `INotificationService`      | Defines `sendNotification()`                  |
| Concrete Classes       | `EmailNotificationService`, `SMSNotificationService`, `WhatsAppNotificationService` | Implement the interface |
| Enum                  | `NotificationTypesEnum`     | Defines supported notification types           |
| Factory               | `NotificationFactory`       | Creates notification services                  |
| High-level Module     | `RideService`               | Depends only on the abstraction                |
| Composition Root      | `Main.java`                 | Assembles services and injects dependencies    |

---

## 🧠 Dependency Flow

```
Main.java

└── creates List<INotificationService> via NotificationFactory
└── RideService uses constructor injection
└── sendNotification() called on each implementation
```

- `RideService` does **not** know about email, SMS, or WhatsApp directly.
- You can now easily add `PushNotificationService` without touching `RideService`.

---

## ✅ Evaluation Summary

| Principle Criteria                                   | Status |
|-----------------------------------------------------|--------|
| High-level module depends on abstraction            | ✅     |
| Low-level modules implement abstraction             | ✅     |
| No direct dependency on concrete classes            | ✅     |
| Constructor-based dependency injection used         | ✅     |
| Factory pattern handles instantiation logic         | ✅     |
| Easily extensible and testable                      | ✅     |

---

## 🏁 Conclusion

The project now demonstrates a **textbook implementation of DIP** with clean separation between:
- What is done (notification)
- How it’s done (email, SMS, WhatsApp)

✅ **DIP Evaluation: PASS**

You’ve successfully completed all 5 SOLID principles! 🏆

