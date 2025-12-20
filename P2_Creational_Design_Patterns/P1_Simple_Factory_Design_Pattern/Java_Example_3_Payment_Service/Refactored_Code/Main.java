package P2_Creational_Design_Patterns.P1_Simple_Factory_Design_Pattern.Java_Example_3_Payment_Service.Refactored_Code;

import P2_Creational_Design_Patterns.P1_Simple_Factory_Design_Pattern.Java_Example_3_Payment_Service.Refactored_Code.factories.PaymentFactory;
import P2_Creational_Design_Patterns.P1_Simple_Factory_Design_Pattern.Java_Example_3_Payment_Service.Refactored_Code.models.enums.PaymentTypeEnum;
import P2_Creational_Design_Patterns.P1_Simple_Factory_Design_Pattern.Java_Example_3_Payment_Service.Refactored_Code.services.IPaymentService;

public class Main {
    public static void main(String[] args) {
        IPaymentService creditPaymentService = PaymentFactory.createPaymentService(PaymentTypeEnum.CREDIT);
        creditPaymentService.pay(500);
        IPaymentService payPalPaymentService = PaymentFactory.createPaymentService(PaymentTypeEnum.PAYPAL);
        payPalPaymentService.pay(250);
        IPaymentService upiPaymentService = PaymentFactory.createPaymentService(PaymentTypeEnum.UPI);
        upiPaymentService.pay(100);
        // throws exception
        IPaymentService cryptoPaymentService = PaymentFactory.createPaymentService(PaymentTypeEnum.CRYPTO);
        cryptoPaymentService.pay(500);
    }
}
