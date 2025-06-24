package P1_SOLID_Principles.P4_ISP_Interface_Segregation_Principle.Java_Example_1_Cab_Driver_Operations.Violated_Code.impl;

import P1_SOLID_Principles.P4_ISP_Interface_Segregation_Principle.Java_Example_1_Cab_Driver_Operations.Violated_Code.IDriverOperations;

public class FreelanceDriver implements IDriverOperations {

    @Override
    public void acceptRide() {
        System.out.println("Freelance Driver accepted a ride.");
    }

    @Override
    public void cancelRide() {
        System.out.println("Freelance Driver canceled the ride.");
    }

    @Override
    public void rateCustomer() {
        throw new UnsupportedOperationException("Freelance Driver does not rate customers.");
    }

    @Override
    public void generateInvoice() {
        throw new UnsupportedOperationException("Freelance Driver cannot generate invoices.");
    }

    @Override
    public void updatePaymentSettings() {
        throw new UnsupportedOperationException("Freelance Driver cannot update payment settings.");
    }
}
