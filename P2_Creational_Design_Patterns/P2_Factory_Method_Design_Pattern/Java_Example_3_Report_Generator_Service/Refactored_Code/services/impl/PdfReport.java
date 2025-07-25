package P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_3_Report_Generator_Service.Refactored_Code.services.impl;

import P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_3_Report_Generator_Service.Refactored_Code.services.Report;

public class PdfReport implements Report {
    @Override
    public void generate(String content) {
        System.out.println("Generating PDF Report: " + content);
    }
}
