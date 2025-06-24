package P1_SOLID_Principles.P2_OCP_Open_Closed_Principle.Java_Example_1_Fare_Calculator.Refactored_Code.service.impl;

import P1_SOLID_Principles.P2_OCP_Open_Closed_Principle.Java_Example_1_Fare_Calculator.Refactored_Code.service.IFareCalculator;

public class LuxuryFareCalculator implements IFareCalculator {
    @Override
    public double calculateFare(double distanceInKm, double durationInMinutes) {
        return distanceInKm * 15 + durationInMinutes * 4 + 50; // luxury surcharge
    }
}
