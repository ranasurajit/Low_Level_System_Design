package P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_3_Report_Generator_Service.Violated_Code;

import P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_3_Report_Generator_Service.Violated_Code.services.ReportService;
import P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_3_Report_Generator_Service.Violated_Code.utils.ReportTypeEnum;

public class Main {
    public static void main(String[] args) {
        ReportService service = new ReportService();

        service.generateReport(ReportTypeEnum.PDF, "LLD Notes");
        service.generateReport(ReportTypeEnum.EXCEL, "Design Patterns Summary");
        service.generateReport(ReportTypeEnum.CSV, "System Design Checklist");
    }
}
