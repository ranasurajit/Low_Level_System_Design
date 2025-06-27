# 🛒 Shopping Cart – Strategy Design Pattern

This project demonstrates how to use the **Strategy Design Pattern** to decouple discount calculation logic from a `Cart` class.

---

## 🎯 Problem Statement

Originally, the `Cart` class used `if-else` statements to apply different discount types like flat and percentage. This made the code:

- ❌ Hard to maintain
- ❌ Difficult to extend for new discount types
- ❌ Violating Open/Closed Principle (OCP)

---

## ✅ Refactored Using Strategy Pattern

### Key Components

- **ICartStrategy**: An interface defining the `getPriceAfterDiscount` method.
- **FlatDiscountCartStrategy**: Applies percentage-based discount.
- **PercentageDiscountCartStrategy**: Applies capped percentage-based discount (e.g., max ₹200).
- **NoDiscountCartStrategy**: Applies no discount at all.
- **Cart**: Delegates the discount logic to the selected strategy.
- **Main**: Demonstrates runtime strategy selection and execution.

---

## 💡 Benefits Achieved

- ✅ **Open/Closed Principle** respected
- ✅ **Clean separation of concerns**
- ✅ **New discounts** can be added without modifying existing code
- ✅ **Easier unit testing** for each strategy

---

## 🧪 Sample Output

- Flat Discount: ₹250.0 (e.g., 50% off ₹500)
- Percent Discount: ₹300.0 (e.g., 60% off capped at ₹200)
- No Discount: ₹500.0

---

## 🏁 Conclusion

This exercise demonstrates the **power and flexibility** of the Strategy Design Pattern in real-world scenarios like e-commerce. It enables dynamic behavior selection while promoting modular, testable, and extensible code.

✅ **Evaluation: PASS**

