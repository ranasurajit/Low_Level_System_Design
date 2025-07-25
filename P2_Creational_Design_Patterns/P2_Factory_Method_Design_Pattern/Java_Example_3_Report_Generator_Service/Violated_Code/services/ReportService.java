package P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_3_Report_Generator_Service.Violated_Code.services;

import P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_3_Report_Generator_Service.Violated_Code.services.impl.CsvReport;
import P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_3_Report_Generator_Service.Violated_Code.services.impl.ExcelReport;
import P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_3_Report_Generator_Service.Violated_Code.services.impl.PdfReport;
import P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_3_Report_Generator_Service.Violated_Code.utils.ReportTypeEnum;

public class ReportService {
    public void generateReport(ReportTypeEnum type, String content) {
        Report report;

        switch (type) {
            case PDF:
                report = new PdfReport();
                break;
            case EXCEL:
                report = new ExcelReport();
                break;
            case CSV:
                report = new CsvReport();
                break;
            default:
                throw new IllegalArgumentException("Unsupported report type: " + type);
        }

        report.generate(content);
    }
}
