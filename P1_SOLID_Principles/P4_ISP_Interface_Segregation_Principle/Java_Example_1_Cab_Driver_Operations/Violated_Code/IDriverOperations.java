package P1_SOLID_Principles.P4_ISP_Interface_Segregation_Principle.Java_Example_1_Cab_Driver_Operations.Violated_Code;

public interface IDriverOperations {
    void acceptRide();

    void cancelRide();

    void rateCustomer();

    void generateInvoice();

    void updatePaymentSettings();
}
