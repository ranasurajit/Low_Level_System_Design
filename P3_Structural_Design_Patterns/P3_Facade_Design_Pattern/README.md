# Facade Design Pattern — Learnings & Refactor Journey

## 📌 Problem Context
The goal of this exercise was to design an **Order Placement system** where placing an order requires coordination between multiple subsystems:

- Inventory Service
- Payment Service
- Shipping Service
- Notification Service

Initially, the client (`Main`) risked becoming tightly coupled with these services, leading to:
- High complexity
- Poor readability
- Difficult maintenance

This scenario naturally **demands the Facade Design Pattern**.

---

## ❌ Initial Design Issues (Before Facade)

Without a Facade, the client would have to:

- Know *which* services to call
- Know *in which order* to call them
- Handle partial failures
- Deal with multiple return values / conditions

```java
inventory.checkStock();
payment.makePayment();
shipping.ship();
notification.send();
```

### Problems:
- ❌ Tight coupling
- ❌ Business flow leaked into client
- ❌ Hard to change workflow
- ❌ Difficult to test

---

## ✅ Applying Facade Design Pattern

The **Facade Pattern** provides a *single, unified interface* to a complex subsystem.

### Key Idea:
> "Hide complexity behind a simple method call."

---

## 🏗️ Refactor Journey

### Step 1: Introduced `OrderFacade`

```java
public class OrderFacade {
    private InventoryService inventoryService;
    private PaymentService paymentService;
    private ShippingService shippingService;
    private NotificationService notificationService;

    public OrderFacade() {
        this.inventoryService = new InventoryService();
        this.paymentService = new PaymentService();
        this.shippingService = new ShippingService();
        this.notificationService = new NotificationService();
    }
}
```

✔ Facade now owns subsystem dependencies

---

### Step 2: Centralized Workflow Logic

```java
public void placeOrder(String productId, String orderId, double amount)
        throws OrderPlacementException {

    if (!inventoryService.checkStock(productId)) {
        throw new OrderPlacementException(orderId);
    }

    if (!paymentService.makePayment(amount)) {
        throw new OrderPlacementException(orderId);
    }

    shippingService.shipProduct(productId);
    notificationService.sendOrderConfirmation(orderId);
}
```

✔ Business flow is **fully encapsulated**

---

### Step 3: Introduced Domain-Specific Exception

```java
public class OrderPlacementException extends Exception {
    public OrderPlacementException(String orderId) {
        super("Error encountered while placing order: " + orderId);
    }
}
```

✔ Clean error signaling
✔ Domain-focused exception

---

### Step 4: Simplified Client Code

```java
public class Main {
    public static void main(String[] args) throws OrderPlacementException {
        OrderFacade facade = new OrderFacade();
        facade.placeOrder("P123", "ORD-101", 2500);
    }
}
```

✔ Client knows **only one class**
✔ Zero subsystem awareness

---

## 🧠 Key Learnings

### 1️⃣ Facade Simplifies Usage
- One method replaces multiple service calls
- Client code becomes clean and readable

---

### 2️⃣ Facade Owns Orchestration (Not Client)
- Sequence logic belongs inside Facade
- Client should not coordinate subsystems

---

### 3️⃣ Facade Reduces Coupling
- Client depends on **Facade only**
- Subsystems can change independently

---

### 4️⃣ Fail-Fast Design is Powerful
- Throwing exceptions early avoids partial states
- Cleaner than boolean flags

---

### 5️⃣ Facade ≠ Business Logic Monster
- Facade coordinates
- Subsystems still own their responsibilities

---

## 🆚 Facade vs Other Patterns

| Pattern | Purpose |
|-------|--------|
| Facade | Simplify complex subsystems |
| Adapter | Convert incompatible interfaces |
| Proxy | Control access |
| Command | Encapsulate actions |

---

## 🏁 Final Outcome

✔ Clean architecture
✔ Single responsibility respected
✔ Easy to extend & maintain
✔ Interview-ready implementation

---

## 🚀 When to Use Facade

- Complex workflows
- Multiple dependent services
- Client simplicity is critical
- Public APIs

---

**Status:** ✅ Successfully refactored using Facade Design Pattern


