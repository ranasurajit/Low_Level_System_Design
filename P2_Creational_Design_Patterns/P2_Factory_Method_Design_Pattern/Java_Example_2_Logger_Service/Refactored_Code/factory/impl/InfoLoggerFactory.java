package P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_2_Logger_Service.Refactored_Code.factory.impl;

import P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_2_Logger_Service.Refactored_Code.factory.LoggerFactory;
import P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_2_Logger_Service.Refactored_Code.services.Logger;
import P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_2_Logger_Service.Refactored_Code.services.impl.InfoLogger;

public class InfoLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLoggerFactory() {
        return new InfoLogger();
    }
}
