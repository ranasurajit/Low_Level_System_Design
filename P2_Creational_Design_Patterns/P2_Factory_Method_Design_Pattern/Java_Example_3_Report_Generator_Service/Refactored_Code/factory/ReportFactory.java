package P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_3_Report_Generator_Service.Refactored_Code.factory;

import P2_Creational_Design_Patterns.P2_Factory_Method_Design_Pattern.Java_Example_3_Report_Generator_Service.Refactored_Code.services.Report;

public abstract class ReportFactory {
    public void generateReport(String content) {
        Report reporter = createReport();
        reporter.generate(content);
    }

    public abstract Report createReport();
}
