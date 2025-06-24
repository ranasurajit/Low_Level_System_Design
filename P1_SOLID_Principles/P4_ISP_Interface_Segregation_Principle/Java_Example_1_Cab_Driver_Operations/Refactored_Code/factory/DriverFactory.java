package P1_SOLID_Principles.P4_ISP_Interface_Segregation_Principle.Java_Example_1_Cab_Driver_Operations.Refactored_Code.factory;

import P1_SOLID_Principles.P4_ISP_Interface_Segregation_Principle.Java_Example_1_Cab_Driver_Operations.Refactored_Code.IDriverOperations;
import P1_SOLID_Principles.P4_ISP_Interface_Segregation_Principle.Java_Example_1_Cab_Driver_Operations.Refactored_Code.impl.ContractDriver;
import P1_SOLID_Principles.P4_ISP_Interface_Segregation_Principle.Java_Example_1_Cab_Driver_Operations.Refactored_Code.impl.FreelanceDriver;
import P1_SOLID_Principles.P4_ISP_Interface_Segregation_Principle.Java_Example_1_Cab_Driver_Operations.Refactored_Code.utils.DriverTypeEnum;

public class DriverFactory {
    public static IDriverOperations getDriver(DriverTypeEnum type) {
        IDriverOperations driver = null;
        switch (type) {
            case CONTRACT:
                driver = new ContractDriver();
                break;
            case FREELANCE:
                driver = new FreelanceDriver();
                break;
            default:
                throw new IllegalArgumentException("Invalid driver type passed : " + type);
        }
        return driver;
    }
}
