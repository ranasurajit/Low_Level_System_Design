package P2_Creational_Design_Patterns.P1_Simple_Factory_Design_Pattern.Java_Example_3_Payment_Service.Refactored_Code.factories;

import P2_Creational_Design_Patterns.P1_Simple_Factory_Design_Pattern.Java_Example_3_Payment_Service.Refactored_Code.models.enums.PaymentTypeEnum;
import P2_Creational_Design_Patterns.P1_Simple_Factory_Design_Pattern.Java_Example_3_Payment_Service.Refactored_Code.services.IPaymentService;
import P2_Creational_Design_Patterns.P1_Simple_Factory_Design_Pattern.Java_Example_3_Payment_Service.Refactored_Code.services.impl.CreditPaymentService;
import P2_Creational_Design_Patterns.P1_Simple_Factory_Design_Pattern.Java_Example_3_Payment_Service.Refactored_Code.services.impl.PayPalPaymentService;
import P2_Creational_Design_Patterns.P1_Simple_Factory_Design_Pattern.Java_Example_3_Payment_Service.Refactored_Code.services.impl.UPIPaymentService;

public class PaymentFactory {
    public static IPaymentService createPaymentService(PaymentTypeEnum type) {
        switch (type) {
            case CREDIT:
                return new CreditPaymentService();
            case PAYPAL:
                return new PayPalPaymentService();
            case UPI:
                return new UPIPaymentService();
            default:
                throw new IllegalArgumentException("Unknown payment type: " + type);
        }
    }
}
