package P4_Behavioral_Design_Patterns.P1_Strategy_Design_Pattern.Java_Example_1_Payment_System.Refactored_Code;

import P4_Behavioral_Design_Patterns.P1_Strategy_Design_Pattern.Java_Example_1_Payment_System.Refactored_Code.strategies.impl.CashPaymentStrategy;
import P4_Behavioral_Design_Patterns.P1_Strategy_Design_Pattern.Java_Example_1_Payment_System.Refactored_Code.strategies.impl.CreditCardPaymentStrategy;
import P4_Behavioral_Design_Patterns.P1_Strategy_Design_Pattern.Java_Example_1_Payment_System.Refactored_Code.strategies.impl.PayPalPaymentStrategy;
import P4_Behavioral_Design_Patterns.P1_Strategy_Design_Pattern.Java_Example_1_Payment_System.Refactored_Code.strategies.impl.UPIPaymentStrategy;

public class Main {
    public static void main(String[] args) {
        PaymentService ccPaymentService = new PaymentService(new CreditCardPaymentStrategy());
        ccPaymentService.pay(1000);

        PaymentService upiPaymentService = new PaymentService(new UPIPaymentStrategy());
        upiPaymentService.pay(750);

        PaymentService payPalPaymentService = new PaymentService(new PayPalPaymentStrategy());
        payPalPaymentService.pay(500);

        PaymentService cashPaymentService = new PaymentService(new CashPaymentStrategy());
        cashPaymentService.pay(250);
    }
}
