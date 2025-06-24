package P1_SOLID_Principles.P4_ISP_Interface_Segregation_Principle.Java_Example_1_Cab_Driver_Operations.Refactored_Code.factory;

import P1_SOLID_Principles.P4_ISP_Interface_Segregation_Principle.Java_Example_1_Cab_Driver_Operations.Refactored_Code.IUser;
import P1_SOLID_Principles.P4_ISP_Interface_Segregation_Principle.Java_Example_1_Cab_Driver_Operations.Refactored_Code.impl.AdminUser;
import P1_SOLID_Principles.P4_ISP_Interface_Segregation_Principle.Java_Example_1_Cab_Driver_Operations.Refactored_Code.impl.Customer;
import P1_SOLID_Principles.P4_ISP_Interface_Segregation_Principle.Java_Example_1_Cab_Driver_Operations.Refactored_Code.utils.UserTypeEnum;

public class UserFactory {
    public static IUser getUser(UserTypeEnum type) {
        IUser user = null;
        switch (type) {
            case CUSTOMER:
                user = new Customer();
                break;
            case ADMIN:
                user = new AdminUser();
                break;
            default:
                throw new IllegalArgumentException("Invalid driver type passed : " + type);
        }
        return user;
    }
}
