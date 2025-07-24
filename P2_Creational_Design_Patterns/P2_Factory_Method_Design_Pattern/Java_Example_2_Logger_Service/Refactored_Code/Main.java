package P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_2_Logger_Service.Refactored_Code;

import P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_2_Logger_Service.Refactored_Code.factory.LoggerFactory;
import P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_2_Logger_Service.Refactored_Code.factory.impl.ErrorLoggerFactory;
import P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_2_Logger_Service.Refactored_Code.factory.impl.InfoLoggerFactory;
import P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_2_Logger_Service.Refactored_Code.services.Logger;

public class Main {
    public static void main(String[] args) {
        LoggerFactory errorLoggerFactory = new ErrorLoggerFactory();
        Logger errorLogger = errorLoggerFactory.createLoggerFactory();
        errorLogger.log("This is an error message!");

        LoggerFactory infoLoggerFactory = new InfoLoggerFactory();
        Logger infoLogger = infoLoggerFactory.createLoggerFactory();
        infoLogger.log("This is an info message!");
    }
}
