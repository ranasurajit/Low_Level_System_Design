package P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_3_Report_Generator_Service.Refactored_Code;

import P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_3_Report_Generator_Service.Refactored_Code.factory.ReportFactory;
import P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_3_Report_Generator_Service.Refactored_Code.factory.ReportFactoryProvider;
import P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_3_Report_Generator_Service.Refactored_Code.utils.ReportTypeEnum;

public class Main {
    public static void main(String[] args) {
        ReportFactory pdfReportFactory = ReportFactoryProvider.getReportFactory(ReportTypeEnum.PDF);
        pdfReportFactory.generateReport("LLD Notes");

        ReportFactory excelReportFactory = ReportFactoryProvider.getReportFactory(ReportTypeEnum.EXCEL);
        excelReportFactory.generateReport("Design Patterns Summary");

        ReportFactory csvReportFactory = ReportFactoryProvider.getReportFactory(ReportTypeEnum.CSV);
        csvReportFactory.generateReport("LLD Notes");
    }
}
