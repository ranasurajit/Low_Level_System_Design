package P1_SOLID_Principles.P2_OCP_Open_Closed_Principle.Java_Example_1_Fare_Calculator.Refactored_Code.factory;

import P1_SOLID_Principles.P2_OCP_Open_Closed_Principle.Java_Example_1_Fare_Calculator.Refactored_Code.service.IFareCalculator;
import P1_SOLID_Principles.P2_OCP_Open_Closed_Principle.Java_Example_1_Fare_Calculator.Refactored_Code.service.impl.ElectricFareCalculator;
import P1_SOLID_Principles.P2_OCP_Open_Closed_Principle.Java_Example_1_Fare_Calculator.Refactored_Code.service.impl.LuxuryFareCalculator;
import P1_SOLID_Principles.P2_OCP_Open_Closed_Principle.Java_Example_1_Fare_Calculator.Refactored_Code.service.impl.StandardFareCalculator;

public class FareCalculatorFactory {
    public static IFareCalculator getCalculator(String type) {
        IFareCalculator calculator = null;
        switch (type) {
            case "Standard":
                calculator = new StandardFareCalculator();
                break;
            case "Luxury":
                calculator = new LuxuryFareCalculator();
                break;
            case "Electric":
                calculator = new ElectricFareCalculator();
                break;
            default:
                throw new IllegalArgumentException("Unsupported ride type: " + type);
        }
        return calculator;
    }
}
