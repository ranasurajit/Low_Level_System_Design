📦 Notification System – Simple Factory Design Pattern
======================================================

This project refactors a naive notification service using the **Simple Factory Pattern** to improve extensibility and maintainability.

* * *

🚫 Original Problem
-------------------

The original implementation used `if-else` conditions to handle various notification types like EMAIL, SMS, and PUSH.

### Problems:

*   Violated **Open/Closed Principle**
    
*   Adding new types required modifying existing logic
    
*   Hard to test and extend
    
*   Risky and error-prone with growing types
    

* * *

✅ Refactored Design Using Simple Factory
----------------------------------------

### ✨ Key Components

*   `INotificationService` – Interface to send notifications
    
*   Concrete Classes:
    
    *   `EmailNotificationService`
        
    *   `SMSNotificationService`
        
    *   `PushNotificationService`
        
*   `NotificationTypesEnum` – Enum for supported notification types
    
*   `NotificationFactory` – Factory class to return the appropriate implementation
    
*   `Main` – Demonstrates usage with dynamic notification selection
    

* * *

🧠 Key Design Insight
---------------------

### ⚠️ Factory Comment (for maintainability)

css

CopyEdit

`/**  * ⚠️ IMPORTANT:  * Just adding a new value in NotificationTypesEnum (like WHATSAPP)  * does NOT automatically make it supported.  * You must also:  *   1. Create a concrete implementation of INotificationService  *   2. Add its handling in the switch block inside NotificationFactory.  */`

This helps ensure future developers don’t assume enum value = supported logic.

* * *

✅ Evaluation
------------

Criteria

Status

Centralized object creation

✅

Use of interface for abstraction

✅

No `if-else` in client code

✅

Easy to extend and test

✅

Invalid type handling (exception)

✅

* * *

🏁 Conclusion
-------------

You’ve correctly applied the **Simple Factory Pattern**, creating clean, extensible, and modular code. Your implementation is real-world ready and respects SOLID principles.

✅ **Evaluation: PASS**

