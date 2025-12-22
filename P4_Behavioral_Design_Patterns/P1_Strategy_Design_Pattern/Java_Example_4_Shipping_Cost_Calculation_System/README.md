# Shipping Cost Calculator – Strategy Pattern Refactor

## 📌 Overview
This project demonstrates how to refactor a **poorly designed shipping cost calculation system**
into a clean, extensible design using the **Strategy Design Pattern**.

The goal is to eliminate conditional logic (`if-else` / `switch`) and make the system:
- Open for extension
- Closed for modification
- Easy to test and maintain

---

## ❌ Problem in Original Design
The original implementation:
- Used `enum + if-else` logic to calculate shipping cost
- Required modifying existing code to add a new shipping type
- Violated **Open–Closed Principle (OCP)** and **Single Responsibility Principle (SRP)**

---

## ✅ Refactored Design (Strategy Pattern)

### Key Idea
Encapsulate **shipping cost calculation algorithms** into separate strategy classes and
delegate the responsibility to them at runtime.

---

## 🧱 Class Design

### 1️⃣ Strategy Interface
```java
public interface IShippingStrategy {
    double calculateShippingCost(Order order);
}
```

---

### 2️⃣ Concrete Strategies
Each shipping type has its own implementation:

- `StandardShippingStrategy`
- `ExpressShippingStrategy`
- `SameDayShippingStrategy`
- `InternationalShippingStrategy`

Example:
```java
public class ExpressShippingStrategy implements IShippingStrategy {
    @Override
    public double calculateShippingCost(Order order) {
        return order.getWeightInKg() * 8 + order.getDistanceInKm() * 1.5;
    }
}
```

---

### 3️⃣ Context Class
```java
public class ShippingService {

    private IShippingStrategy strategy;
    private Order order;

    public ShippingService(IShippingStrategy strategy, Order order) {
        this.strategy = strategy;
        this.order = order;
    }

    public double calculateShippingCost() {
        return strategy.calculateShippingCost(order);
    }
}
```

- Delegates calculation to the selected strategy
- Contains **no conditional logic**

---

### 4️⃣ Client (`Main.java`)
```java
public class Main {
    public static void main(String[] args) {

        Order order = new Order(10.0, 120.0, 5000.0);

        ShippingService standardService =
                new ShippingService(new StandardShippingStrategy(), order);

        double cost = standardService.calculateShippingCost();
        System.out.println("Shipping Cost: ₹" + cost);
    }
}
```

---

## 🔄 How to Add a New Shipping Type
1. Create a new class implementing `IShippingStrategy`
2. Plug it into `ShippingService`
3. **No existing code changes required**

✔ Fully compliant with OCP

---

## 🧠 Design Principles Applied
- **Strategy Design Pattern**
- **SOLID Principles**
    - SRP ✔
    - OCP ✔
    - DIP ✔
- Composition over inheritance

---

## 🎯 Interview Talking Points
- Why Strategy over `if-else`
- How this improves extensibility
- How Factory can be added for strategy selection
- Difference between Strategy and Template Method

---

## 🚀 Possible Enhancements
- Add `ShippingStrategyFactory`
- Make pricing configurable
- Introduce Spring Dependency Injection
- Add unit tests per strategy

---

## 📚 Conclusion
This refactor cleanly demonstrates how **Strategy Pattern** helps in designing
flexible, maintainable, and interview-ready systems.

---

**Author:** Surajit Rana  
**Use Case:** Low Level Design Interview Preparation
