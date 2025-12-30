# Command Design Pattern — Learnings & Implementation Notes

## 📌 Overview
The **Command Design Pattern** is a behavioral design pattern that encapsulates a request as an object, thereby allowing:
- Parameterization of clients with different requests
- Queuing and logging of requests
- Support for undo/redo operations

This repository demonstrates a **Smart Home Remote Control** example refactored step-by-step to correctly apply the Command Pattern.

---

## ❌ Initial Problems (Without Command Pattern)

Before applying the Command Pattern, the design suffered from:

- ❌ Tight coupling between the remote and device classes
- ❌ Large conditional blocks (`if-else` / `switch`)
- ❌ Difficult to add new devices or actions
- ❌ No undo/redo support
- ❌ Violates **Open/Closed Principle**

Example smell:
```java
if(button == LIGHT_ON) {
    light.turnOn();
} else if(button == FAN_ON) {
    fan.start();
}
```

---

## ✅ Refactored Design Using Command Pattern

### Core Participants

| Role | Responsibility | Implementation |
|----|----|----|
| Client | Creates and wires commands | `Main` |
| Invoker | Triggers commands | `SmartRemote` |
| Command | Declares execution interface | `ICommand` |
| ConcreteCommand | Binds action to receiver | `LightOnCommand`, `FanOffCommand` |
| Receiver | Performs actual work | `Light`, `Fan`, `AirConditioner` |

---

## 🧩 Key Design Decisions & Learnings

### 1️⃣ Each Action = One Command
- `LightOnCommand` and `LightOffCommand` are **separate classes**
- Avoids boolean flags and conditional logic
- Improves readability and extensibility

---

### 2️⃣ Invoker Is Completely Decoupled
```java
remote.pressButton(CommandType.LIGHT_ON);
```
- Remote knows **nothing** about devices
- New commands can be added without modifying `SmartRemote`

---

### 3️⃣ Undo Support via Command History
```java
Stack<ICommand> commandHistory;
```

- Every executed command is stored
- Undo operation simply replays `undo()` on commands
- Invoker does **not** know how undo works internally

---

### 4️⃣ Undo Must Be Logical Inverse
**Important Learning:**
> `undo()` must reverse exactly what `execute()` did

| Command | execute() | undo() |
|------|---------|------|
| LightOnCommand | turnOn | turnOff |
| FanOffCommand | stop | start |
| AC Increase | increaseTemp | decreaseTemp |

Undo should **not** be a reset or power-off unless that is the inverse action.

---

### 5️⃣ Commands May Store State
- Especially important for incremental operations (e.g. AC temperature)
- Storing previous state inside the command is valid and expected

---

## ✅ Benefits Achieved

- ✔ Open/Closed Principle followed
- ✔ Easy to add new devices or commands
- ✔ Undo support without modifying invoker
- ✔ Clean separation of concerns
- ✔ Highly testable design

---

## 🔁 Possible Enhancements

- Redo functionality
- MacroCommand (execute multiple commands together)
- Null Object Command
- Command persistence (logging / replay)

---

## 🎯 Interview Takeaway

> “The Command Pattern encapsulates a request as an object, decoupling the invoker from the receiver and enabling extensibility, undo/redo, and clean abstractions.”

This example represents a **textbook, interview-ready implementation** of the Command Design Pattern.

---

## 🏁 Final Thoughts

Implementing Command Pattern shifts thinking from *procedural control flow* to *object-oriented behavior modeling*.  
It replaces conditionals with polymorphism and enables scalable, maintainable designs.

Happy Designing 🚀


