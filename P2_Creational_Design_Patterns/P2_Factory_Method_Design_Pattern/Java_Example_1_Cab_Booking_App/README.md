
# Cab Booking System – Factory Method Pattern (Evaluated)

This project demonstrates the Factory Method Design Pattern applied to a cab booking system.

## ✅ Summary of Design

- **Product Interface**: `IRide` defines the ride abstraction.
- **Concrete Products**: `Mini`, `Sedan`, `SUV`, `Auto` – each implements `IRide`.
- **Abstract Factory**: `RideBookingFactoryService` defines the factory method `createRide()`.
- **Concrete Factories**: Each ride type has its own factory that implements the abstract method.
- **Dynamic Selection**: A new `RideTypeEnum` and `RideBookingFactoryProvider` allow dynamic ride selection at runtime.
- **Main Class**: Prompts user input to dynamically select and book a ride.

## ✅ Key Strengths

- **Factory Method Pattern**: Clean and correctly implemented.
- **Open/Closed Principle**: New ride types can be added without modifying existing factories or logic.
- **Enum-Based Dispatch**: `RideTypeEnum` combined with a simple factory (`RideBookingFactoryProvider`) allows dynamic runtime selection.
- **Clean Code Practices**:
  - No `if`/`else` or `switch` in client (`Main`) logic.
  - Scanner is properly closed.
  - Exceptions are handled gracefully.

## 🟡 Suggestions for Improvement

- **Input Hint**: Display available enum values for better UX.
- **Enum Map Refactor**: Replace `switch` in the factory provider with a `Map<RideTypeEnum, Supplier<RideBookingFactoryService>>` for more extensibility.
- **Default Option**: Consider providing a default/fallback ride for invalid inputs.
- **Unit Testing**: Add test coverage for each factory and ride combination.
- **Naming Convention**: `IRide` can be renamed to `Ride` (Java best practice avoids prefixing interfaces).

## ✅ Final Verdict

This is a strong and extensible example of the Factory Method Pattern. The addition of enum-based dynamic dispatch shows a strong grasp of low-level design. Ready for production use or extension into a Spring Boot microservice.

**Great work!**
