package P1_SOLID_Principles.P3_LSP_Liskov_Substitution_Principle.Java_Example_1_Ride_Calculator_With_Promo.Refactored_Code.factory;

import P1_SOLID_Principles.P3_LSP_Liskov_Substitution_Principle.Java_Example_1_Ride_Calculator_With_Promo.Refactored_Code.Ride;
import P1_SOLID_Principles.P3_LSP_Liskov_Substitution_Principle.Java_Example_1_Ride_Calculator_With_Promo.Refactored_Code.impl.FreePromoRide;
import P1_SOLID_Principles.P3_LSP_Liskov_Substitution_Principle.Java_Example_1_Ride_Calculator_With_Promo.Refactored_Code.impl.StandardRide;
import P1_SOLID_Principles.P3_LSP_Liskov_Substitution_Principle.Java_Example_1_Ride_Calculator_With_Promo.Refactored_Code.utils.RideEnum;

public class RideFactory {
    public static Ride getRide(RideEnum type, double distanceInKm, double durationInMinutes) {
        Ride ride = null;
        switch (type) {
            case STANDARD:
                ride = new StandardRide(distanceInKm, durationInMinutes);
                break;
            case PROMO:
                ride = new FreePromoRide(distanceInKm, durationInMinutes);
                break;
            default:
                throw new IllegalArgumentException("Invalid ride type declared : " + type);
        }
        return ride;
    }
}
