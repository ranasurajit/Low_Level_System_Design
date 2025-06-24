package P1_SOLID_Principles.P4_ISP_Interface_Segregation_Principle.Java_Example_1_Cab_Driver_Operations.Refactored_Code.impl;

import P1_SOLID_Principles.P4_ISP_Interface_Segregation_Principle.Java_Example_1_Cab_Driver_Operations.Refactored_Code.IDriverModifierOperations;

public class ContractDriver implements IDriverModifierOperations {
    @Override
    public void acceptRide() {
        System.out.println("Contractual Driver accepted a ride.");
    }

    @Override
    public void cancelRide() {
        System.out.println("Contractual Driver canceled the ride.");
    }

    @Override
    public void rateCustomer() {
        System.out.println("Contractual Driver rated the customer.");
    }
}
