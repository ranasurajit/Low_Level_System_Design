package P1_SOLID_Principles.P4_ISP_Interface_Segregation_Principle.Java_Example_1_Cab_Driver_Operations.Refactored_Code.impl;

import P1_SOLID_Principles.P4_ISP_Interface_Segregation_Principle.Java_Example_1_Cab_Driver_Operations.Refactored_Code.IDriverOperations;

public class FreelanceDriver implements IDriverOperations {
    @Override
    public void acceptRide() {
        System.out.println("Freelance Driver accepted a ride.");
    }

    @Override
    public void rateCustomer() {
        System.out.println("Freelance Driver rated the customer.");
    }
}
