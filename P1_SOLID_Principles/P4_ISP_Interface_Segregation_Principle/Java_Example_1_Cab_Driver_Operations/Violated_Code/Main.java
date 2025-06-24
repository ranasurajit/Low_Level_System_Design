package P1_SOLID_Principles.P4_ISP_Interface_Segregation_Principle.Java_Example_1_Cab_Driver_Operations.Violated_Code;

import P1_SOLID_Principles.P4_ISP_Interface_Segregation_Principle.Java_Example_1_Cab_Driver_Operations.Violated_Code.impl.FreelanceDriver;

public class Main {
    public static void main(String[] args) {
        IDriverOperations driver = new FreelanceDriver();

        driver.acceptRide();
        driver.cancelRide();

        try {
            driver.rateCustomer(); // Violates ISP
        } catch (UnsupportedOperationException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        try {
            driver.generateInvoice(); // Violates ISP
        } catch (UnsupportedOperationException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        try {
            driver.updatePaymentSettings(); // Violates ISP
        } catch (UnsupportedOperationException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
