package P1_SOLID_Principles.P1_SRP_Single_Responsibility_Principle.Java_Example_2_Ride_Application.Refactored_Code.reporter.impl;

import P1_SOLID_Principles.P1_SRP_Single_Responsibility_Principle.Java_Example_2_Ride_Application.Refactored_Code.UserDetails;
import P1_SOLID_Principles.P1_SRP_Single_Responsibility_Principle.Java_Example_2_Ride_Application.Refactored_Code.reporter.IInvoiceGenerator;

public class EmailInvoiceGenerator implements IInvoiceGenerator {

    private UserDetails user;

    public EmailInvoiceGenerator(UserDetails user) {
        this.user = user;
    }

    public void sendInvoice() {
        System.out.println("Sending invoice email to: " + user.getUserEmail());
        // Email logic (pretend SMTP code here)
    }
}
