package P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_2_Logger_Service.Violated_Code;

import P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_2_Logger_Service.Violated_Code.services.Logger;
import P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_2_Logger_Service.Violated_Code.services.impl.ErrorLogger;
import P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_2_Logger_Service.Violated_Code.services.impl.InfoLogger;

public class Main {
    public static void main(String[] args) {
        Logger errLogger = new ErrorLogger();
        errLogger.log("This is an error message!");

        Logger infoLogger = new InfoLogger();
        infoLogger.log("This is an info message!");
    }
}
