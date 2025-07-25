# Factory Method Pattern - Report Generation System

## 🧠 Problem Statement
Design a reporting system that can generate reports in different formats (PDF, Excel, CSV) using the **Factory Method Design Pattern**. The system should be open for extension (to add new formats) but closed for modification of existing logic.

## ✅ Final Design Summary

This implementation applies the **Factory Method Pattern** by:

- Using an abstract class `ReportFactory` that defines a `generateReport()` method with the invariant flow.
- Defining a `createReport()` method that each subclass must implement.
- Each concrete factory (`PdfReportFactory`, `ExcelReportFactory`, `CsvReportFactory`) is responsible for creating a specific type of `Report`.
- A `ReportFactoryProvider` acts as a registry for resolving factories.

## 🔍 Key Classes

- `ReportFactory` (abstract): Template method and abstract creator.
- `PdfReportFactory`, `ExcelReportFactory`, `CsvReportFactory`: Concrete creators.
- `Report` (interface): Product interface.
- `PdfReport`, `ExcelReport`, `CsvReport`: Concrete products.
- `ReportFactoryProvider`: Maps `ReportTypeEnum` to concrete factories.

## 🧪 Sample Output
```
Generating PDF Report: LLD Notes
Generating Excel Report: Design Patterns Summary
Generating CSV Report: LLD Notes
```

## 🏁 Verdict by LLD Tutor

You have:
✅ Understood and applied the Factory Method Design Pattern correctly.  
✅ Reduced tight coupling between client code and concrete classes.  
✅ Used inheritance to encapsulate object creation logic.  
✅ Promoted Open/Closed Principle.

📈 You're progressing well in your LLD interview preparation.

---

Next Suggestion: Move to the **Abstract Factory Pattern** or start integrating **Strategy Pattern** with this reporting system.
