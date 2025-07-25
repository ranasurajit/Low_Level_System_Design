package P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_3_Report_Generator_Service.Refactored_Code.factory;

import P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_3_Report_Generator_Service.Refactored_Code.factory.impl.CsvReportFactory;
import P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_3_Report_Generator_Service.Refactored_Code.factory.impl.ExcelReportFactory;
import P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_3_Report_Generator_Service.Refactored_Code.factory.impl.PdfReportFactory;
import P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_3_Report_Generator_Service.Refactored_Code.utils.ReportTypeEnum;

public class ReportFactoryProvider {
    public static ReportFactory getReportFactory(ReportTypeEnum type) {
        ReportFactory factory = null;
        switch (type) {
            case PDF:
                factory = new PdfReportFactory();
                break;
            case CSV:
                factory = new CsvReportFactory();
                break;
            case EXCEL:
                factory = new ExcelReportFactory();
                break;
            default:
                throw new IllegalArgumentException(type + " argument is not yet supported.");
        }
        return factory;
    }
}
