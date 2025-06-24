package P1_SOLID_Principles.P3_LSP_Liskov_Substitution_Principle.Java_Example_1_Ride_Calculator_With_Promo.Refactored_Code;

import P1_SOLID_Principles.P3_LSP_Liskov_Substitution_Principle.Java_Example_1_Ride_Calculator_With_Promo.Refactored_Code.factory.RideFactory;
import P1_SOLID_Principles.P3_LSP_Liskov_Substitution_Principle.Java_Example_1_Ride_Calculator_With_Promo.Refactored_Code.utils.RideEnum;

public class Main {
    public static void main(String[] args) {
        FareRide standardRide = (FareRide) RideFactory.getRide(RideEnum.STANDARD, 10, 15);
        System.out.println("Standard Ride Fare: ₹" + standardRide.calculateFare());

        Ride freePromoRide = RideFactory.getRide(RideEnum.PROMO, 10, 15);
        System.out.println("Hope, you've enjoyed your free promo ride for distance "
                + freePromoRide.distanceInKm + " kms");
    }
}
