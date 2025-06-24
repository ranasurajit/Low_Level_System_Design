package P1_SOLID_Principles.P4_ISP_Interface_Segregation_Principle.Java_Example_1_Cab_Driver_Operations.Refactored_Code;

import P1_SOLID_Principles.P4_ISP_Interface_Segregation_Principle.Java_Example_1_Cab_Driver_Operations.Refactored_Code.factory.DriverFactory;
import P1_SOLID_Principles.P4_ISP_Interface_Segregation_Principle.Java_Example_1_Cab_Driver_Operations.Refactored_Code.factory.UserFactory;
import P1_SOLID_Principles.P4_ISP_Interface_Segregation_Principle.Java_Example_1_Cab_Driver_Operations.Refactored_Code.impl.AdminUser;
import P1_SOLID_Principles.P4_ISP_Interface_Segregation_Principle.Java_Example_1_Cab_Driver_Operations.Refactored_Code.utils.DriverTypeEnum;
import P1_SOLID_Principles.P4_ISP_Interface_Segregation_Principle.Java_Example_1_Cab_Driver_Operations.Refactored_Code.utils.UserTypeEnum;

public class Main {
    public static void main(String[] args) {
        IDriverOperations freelanceDriver = DriverFactory.getDriver(DriverTypeEnum.FREELANCE);

        freelanceDriver.acceptRide();
        freelanceDriver.rateCustomer();
        // freelanceDriver cannot cancelRide

        IDriverModifierOperations contractDriver = (IDriverModifierOperations) DriverFactory
                .getDriver(DriverTypeEnum.CONTRACT);

        contractDriver.acceptRide();
        contractDriver.cancelRide();
        contractDriver.rateCustomer();

        IUser customer = UserFactory.getUser(UserTypeEnum.CUSTOMER);
        customer.updatePaymentSettings();
        // customer cannot generateInvoice

        AdminUser adminUser = (AdminUser) UserFactory.getUser(UserTypeEnum.ADMIN);
        adminUser.updatePaymentSettings();
        adminUser.generateInvoice();
    }
}
