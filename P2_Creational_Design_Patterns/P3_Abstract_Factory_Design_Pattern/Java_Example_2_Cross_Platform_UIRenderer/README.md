# Abstract Factory Design Pattern - GUI Rendering System

## 📝 Problem Statement

You are building a cross-platform GUI rendering system. Depending on the user's OS (Windows or Mac), the application must render appropriate components (Button and TextBox). Each OS provides a different implementation of these components.

Your task was to implement this system using the **Abstract Factory Design Pattern** — a pattern that helps produce families of related objects without specifying their concrete classes.

---

## 🧩 Class Responsibilities

- **Button (interface)**: Abstract representation of a GUI button.
- **TextBox (interface)**: Abstract representation of a GUI textbox.
- **MacButton / WindowsButton**: OS-specific button implementations.
- **MacTextBox / WindowsTextBox**: OS-specific textbox implementations.
- **GUIFactory (interface)**: Abstract factory that creates related components.
- **MacGUIFactory / WinGUIFactory**: Concrete factories to create Mac or Windows UI elements.
- **Application**: Uses the factory to render a complete UI.
- **GUIFactoryProvider**: Factory chooser based on `OsTypeEnum`.
- **Main**: Entry point to collect user input and run the application.

---

## 🏗️ Design Pattern Used

### ✅ Abstract Factory Design Pattern

**Intent**: Provide an interface for creating families of related objects without specifying their concrete classes.

- ✔ Each factory (`MacGUIFactory`, `WinGUIFactory`) produces related objects (`Button`, `TextBox`).
- ✔ Application is unaware of the concrete classes; it just uses the `GUIFactory` interface.
- ✔ UI behavior can be changed dynamically based on `OsTypeEnum` input.

---

## ✅ Mentor Assessment Verdict

**Overall Implementation**: ✅ **EXCELLENT**

### 🔍 Evaluation Checklist

| Criteria                                  | Status | Notes |
|------------------------------------------|--------|-------|
| Clear separation of concerns              | ✅     | Each class has a focused responsibility. |
| Abstract interfaces for product families | ✅     | Button and TextBox interfaces are well-designed. |
| Concrete factories follow the pattern     | ✅     | Follows Abstract Factory rules accurately. |
| No direct dependency on concrete classes  | ✅     | `Application` depends only on abstractions. |
| Extensibility (e.g., add Linux support)   | ✅     | Can add `LinuxGUIFactory` easily. |

**Final Verdict**: 🟢 You’ve shown strong understanding of the Abstract Factory pattern. You're ready to move forward to more advanced creational or structural patterns.

---

## 🚀 Suggested Next Steps

- Add unit tests to verify UI rendering.
- Try implementing an Abstract Factory for a **Database Driver Factory** or **Theme-based UI system**.
- Move to the **Builder Pattern** or **Prototype Pattern** to diversify your LLD knowledge.

---

©️ Guided by ChatGPT – Your LLD Tutor
