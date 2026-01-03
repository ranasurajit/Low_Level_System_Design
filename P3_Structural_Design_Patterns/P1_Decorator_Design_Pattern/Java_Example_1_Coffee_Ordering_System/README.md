# Decorator Design Pattern – Refactoring Learnings

## 📌 Problem Overview
The original Coffee Ordering System used boolean flags to represent add-ons like Milk, Sugar, Caramel, etc.
This approach led to poor design and violated core OOP principles.

---

## ❌ Issues in the Original Design
- Use of multiple boolean flags (`milk`, `sugar`, `caramel`, ...)
- Violated **Open–Closed Principle**
- Adding a new add-on required modifying:
  - Constructor
  - Cost calculation
  - Description logic
- Led to rigid and non-extensible code
- No runtime composition

---

## ✅ Why Decorator Pattern Fits Perfectly
Decorator Pattern is ideal when:
- Responsibilities are optional
- Behaviors need to be combined dynamically
- Object behavior should be extended without modifying existing code

---

## 🧩 Final Refactored Design (Using Decorator)

### Pattern Roles Mapping
| Role | Class |
|----|------|
| Component | `Beverage` |
| Concrete Component | `Coffee` |
| Abstract Decorator | `BeverageDecorator` |
| Concrete Decorators | `MilkDecorator`, `SugarDecorator`, `WhippedCreamDecorator`, `CaramelDecorator` |
| Client | `Main` |

---

## 🔑 Key Design Improvements

### 1️⃣ Runtime Composition
```java
Beverage coffee =
    new MilkDecorator(
        new SugarDecorator(
            new WhippedCreamDecorator(
                new CaramelDecorator(new Coffee())
            )
        )
    );
```
- Add-ons applied dynamically
- Order-sensitive decoration
- No conditionals or flags

---

### 2️⃣ Is-a + Has-a Relationship
Each decorator:
- **Is a** `Beverage`
- **Has a** `Beverage`

This preserves polymorphism and enables recursive wrapping.

---

### 3️⃣ Open–Closed Principle
- New add-ons require **new decorators only**
- No changes to existing code
- System is fully extensible

---

### 4️⃣ Single Responsibility
- Each decorator handles only its own behavior
- Cost and description logic are localized

---

## 🧠 SOLID Principles Applied
- **SRP**: One responsibility per class
- **OCP**: Open for extension, closed for modification
- **LSP**: Decorators interchangeable with base component
- **DIP**: Client depends on abstraction (`Beverage`)

---

## ⚠️ Trade-offs of Decorator Pattern
- Increased number of small classes
- Order of decorators matters
- Debugging can be slightly harder due to nesting

---

## 🎯 Interview Takeaway
> “Decorator Pattern allows adding responsibilities dynamically to objects without modifying their structure, making the system flexible, extensible, and compliant with OCP.”

---

## ✅ Final Outcome
- Clean and extensible design
- No code smells
- Interview-ready implementation
- Production-quality structure

---

## 🚀 Possible Enhancements
- DiscountDecorator
- Size-based pricing decorator
- Receipt/Logging decorator
- Combination validation rules

---

**Decorator Pattern mastered ✔️**


