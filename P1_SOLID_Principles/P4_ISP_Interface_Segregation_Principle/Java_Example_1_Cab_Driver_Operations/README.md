# 🚕 Ride Management System – SOLID Principle: Interface Segregation Principle (ISP)

This project demonstrates the Interface Segregation Principle (ISP) from the SOLID design principles. It uses a ride booking system to show how splitting interfaces into smaller, role-specific ones leads to more maintainable and scalable code.

---

## ❌ Initial Problem

Initially, a single interface defined multiple responsibilities like ride handling, billing, and payment management. This forced classes like FreelanceDriver, who only care about accepting and completing rides, to implement unrelated methods like invoice generation or payment setting updates.

Such design violates the ISP, which states:
> "Clients should not be forced to depend on methods they do not use."

---

## ✅ Refactored Design (ISP Compliant)

To fix this, interfaces were broken into small, focused units. Now each interface represents a specific responsibility, and classes implement only the interfaces relevant to their role.

### ✳️ Key Interfaces

- **IDriverOperations**: For ride actions like accepting and rating.
- **IDriverModifierOperations**: Extends IDriverOperations, adds support for canceling rides.
- **IUser**: For managing payment settings.
- **IInvoiceGenerator**: For generating and emailing invoices.

---

## 👥 Implementing Classes

| Class            | Interfaces Implemented              | Responsibility                                   |
|------------------|--------------------------------------|--------------------------------------------------|
| FreelanceDriver  | IDriverOperations                   | Accepts rides and rates customers                |
| ContractDriver   | IDriverModifierOperations           | Accepts, cancels rides, and rates customers      |
| Customer         | IUser                               | Can update payment settings                      |
| AdminUser        | IUser, IInvoiceGenerator            | Can manage payments and generate invoices        |

---

## 🧪 Behavior in Main

The `Main` class creates instances of each role and interacts with them only via the interfaces they implement. No `UnsupportedOperationException` is used. This ensures full adherence to the Interface Segregation Principle.

---

## 📁 Project Structure

- interfaces/
  - IDriverOperations
  - IDriverModifierOperations
  - IUser
  - IInvoiceGenerator
- impl/
  - FreelanceDriver
  - ContractDriver
  - Customer
  - AdminUser
- Main.java

---

## 🧠 Evaluation Summary

| Evaluation Criteria                                | Status |
|----------------------------------------------------|--------|
| No class implements methods it doesn't need        | ✅     |
| Interfaces are highly cohesive and role-based      | ✅     |
| Easily mockable and testable                       | ✅     |
| Models real-world responsibilities accurately      | ✅     |

---

## 🏁 Conclusion

The code now fully respects the Interface Segregation Principle:
- Interfaces are split by role and responsibility
- Classes only implement what they truly need
- The design is now clean, extensible, and maintainable

✅ ISP Evaluation: **PASS**

---

Ready to proceed with ➡️ Class 5: **Dependency Inversion Principle (DIP)**!

