# Adapter Design Pattern – Learning Notes (Payment System Example)

## 📌 Problem Statement
The payment system needed to support multiple payment mechanisms:
- Credit Card
- PayPal (third-party API)
- UPI (third-party API)

Each payment gateway exposed **different method signatures**, making it impossible to use them interchangeably without modifying client code.

---

## ❌ Initial Design Issues (Without Adapter)
- Client code tightly coupled to gateway implementations
- No common interface
- Adding new gateways required code changes
- Violates Open/Closed Principle

---

## ✅ Refactored Design Using Adapter Pattern

### 1️⃣ Target Interface
```java
public interface PaymentProcessor {
    void processPayment(double amount);
}
```

---

### 2️⃣ Client
```java
public class PaymentService {
    private PaymentProcessor processor;

    public void pay(double amount) {
        processor.processPayment(amount);
    }
}
```

---

### 3️⃣ Adaptees (Third-Party APIs)
- PayPalGateway
- UPIGateway

These APIs could not be modified.

---

### 4️⃣ Abstract Adapter
```java
public abstract class PaymentProcessAdapter implements PaymentProcessor {
    protected String key;

    public PaymentProcessAdapter(String key) {
        this.key = key;
    }
}
```

✔ Shared state  
✔ Reduced duplication  

---

### 5️⃣ Concrete Adapters
- PayPalGatewayAdapter
- UPIGatewayAdapter

Each adapter converts the system call into gateway-specific API calls.

---

### 6️⃣ No Adapter for Credit Card
```java
public class CreditCardPayment implements PaymentProcessor
```

✔ Already matches target interface  
✔ Adapter would be unnecessary  

---

## 🎯 Key Learnings

- Adapter Pattern solves interface mismatch
- Use adapters only when required
- Client code remains unchanged
- Third-party APIs stay isolated

---

## 💡 Design Principles Reinforced
- Open/Closed Principle
- Dependency Inversion Principle
- Single Responsibility Principle

---

## 🏁 Outcome
- Clean extensible design
- Easy onboarding of new payment gateways
- Interview-ready Adapter Pattern example



