package P1_SOLID_Principles.P4_ISP_Interface_Segregation_Principle.Java_Example_1_Cab_Driver_Operations.Refactored_Code.impl;

import P1_SOLID_Principles.P4_ISP_Interface_Segregation_Principle.Java_Example_1_Cab_Driver_Operations.Refactored_Code.IInvoiceGenerator;
import P1_SOLID_Principles.P4_ISP_Interface_Segregation_Principle.Java_Example_1_Cab_Driver_Operations.Refactored_Code.IUser;

public class AdminUser implements IUser, IInvoiceGenerator {
    @Override
    public void updatePaymentSettings() {
        System.out.println("Payment mode changed!");
    }

    @Override
    public void generateInvoice() {
        System.out.println("Generating invoice and sending to registered email address");
    }
}
