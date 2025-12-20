# 💳 Payment Processing – Simple Factory Design Pattern (Java)

This project demonstrates how to refactor a tightly coupled payment-processing system into a **Simple Factory Pattern** using Java.  
The example illustrates creating different payment services such as **Credit Card**, **PayPal**, and **UPI**, each encapsulated in its own class.

---

## ❌ Original Problem

Before refactoring, the project contained a single class:

- Performed multiple `if/else` checks
- Created concrete payment types directly
- Mixed responsibilities (logic + validation + printing)
- Violated **Single Responsibility** (SRP)
- Violated **Open/Closed Principle** (OCP)
- Hard to extend for new payment types

Example (before):

```java
if (type.equalsIgnoreCase("credit")) {
    ...
} else if (type.equalsIgnoreCase("paypal")) {
    ...
}
```

Adding a new payment method required modifying this class every time.

---

## ✅ Refactoring Goal

Apply the **Simple Factory Pattern** to:

- Centralize object creation in one place
- Create polymorphic payment service implementations
- Let client code depend on interfaces, not concrete classes
- Improve extensibility and testing

---

## 🏭 Simple Factory Overview

The **factory** decides which payment service object to instantiate based on an input type (Enum).

```java
PaymentFactory.createPaymentService(PaymentTypeEnum.CREDIT);
```

This keeps client code clean and unaware of implementation details.

---

## 📦 Project Structure

```
src/
 └─ Refactored_Code/
     ├─ Main.java
     ├─ factories/
     │   └─ PaymentFactory.java
     ├─ models/
     │   └─ enums/
     │       └─ PaymentTypeEnum.java
     └─ services/
         ├─ IPaymentService.java
         ├─ CreditPaymentService.java
         ├─ PayPalPaymentService.java
         └─ UPIPaymentService.java
```

---

## 🧩 Key Components

### 🟢 `IPaymentService` – The Abstraction
```java
public interface IPaymentService {
    void pay(double amount);
}
```

### 🟦 Concrete Implementations
- `CreditPaymentService`
- `PayPalPaymentService`
- `UPIPaymentService`

Each implements `IPaymentService` with its own behavior.

### 🏭 `PaymentFactory`
```java
public static IPaymentService createPaymentService(PaymentTypeEnum type)
```

Decides which class to create.

### 🧾 Enum for Payment Types
```java
public enum PaymentTypeEnum { CREDIT, PAYPAL, UPI, CRYPTO }
```

---

## 🚀 Usage

```java
IPaymentService creditPayment = PaymentFactory.createPaymentService(PaymentTypeEnum.CREDIT);
creditPayment.pay(500);

IPaymentService paypalPayment = PaymentFactory.createPaymentService(PaymentTypeEnum.PAYPAL);
paypalPayment.pay(250);

IPaymentService upiPayment = PaymentFactory.createPaymentService(PaymentTypeEnum.UPI);
upiPayment.pay(100);

// Unsupported type throws exception
PaymentFactory.createPaymentService(PaymentTypeEnum.CRYPTO);
```

---

## 🖨 Sample Output

```
Connecting to Visa/Mastercard gateway...
Performing fraud checks...
Charging credit card: $500.0
Credit Card Payment processed successfully!

Connecting to PayPal API...
Authenticating token...
Processing PayPal payment: $250.0
PayPal Payment completed!

Connecting to UPI server...
Validating VPA...
Processing UPI payment: $100.0
UPI Payment done!

Exception in thread "main"
java.lang.IllegalArgumentException: Unknown payment type: CRYPTO
```

---

## 🧠 Design Benefits

| Principle | Achieved |
|----------|----------|
| SRP – Single Responsibility | ✔ Cleaner classes |
| OCP – Open/Closed Principle | ✔ Easier to extend |
| DIP – Dependency Inversion | ✔ Code depends on abstraction |
| Maintainability | ✔ |
| Testability | ✔ |

---

## 🆕 Adding New Payment Types

To support **Crypto**, just:

1. Create `CryptoPaymentService implements IPaymentService`
2. Add case in `PaymentFactory`

Client code stays untouched.

---

## 🏁 Next Step: Factory Method

This project can be extended to a **Factory Method Pattern**, where:

- Creation moves to subclasses
- No switch/case modification required
- Stronger alignment with OCP

---

## 👨‍💻 Author
Refactored as part of **Creational Design Patterns practice**.

---

## ⭐ Feedback
Feel free to submit improvements or alternate designs!

