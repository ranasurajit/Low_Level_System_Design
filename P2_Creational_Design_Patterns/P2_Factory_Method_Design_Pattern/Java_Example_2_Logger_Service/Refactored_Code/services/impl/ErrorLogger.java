package P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_2_Logger_Service.Refactored_Code.services.impl;

import P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_2_Logger_Service.Refactored_Code.services.Logger;

public class ErrorLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("[ERROR] " + message);
    }
}
