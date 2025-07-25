package P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_3_Report_Generator_Service.Refactored_Code.factory.impl;

import P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_3_Report_Generator_Service.Refactored_Code.factory.ReportFactory;
import P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_3_Report_Generator_Service.Refactored_Code.services.Report;
import P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_3_Report_Generator_Service.Refactored_Code.services.impl.ExcelReport;

public class ExcelReportFactory extends ReportFactory {
    @Override
    public Report createReport() {
        return new ExcelReport();
    }
}
