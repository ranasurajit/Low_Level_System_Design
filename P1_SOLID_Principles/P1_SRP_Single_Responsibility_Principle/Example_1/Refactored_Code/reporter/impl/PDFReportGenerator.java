package P1_SOLID_Principles.P1_SRP_Single_Responsibility_Principle.Example_1.Refactored_Code.reporter.impl;

import P1_SOLID_Principles.P1_SRP_Single_Responsibility_Principle.Example_1.Refactored_Code.reporter.IReporterGenerator;

public class PDFReportGenerator implements IReporterGenerator{
    public void generatePDFReport(String name) {
        System.out.println("Generating PDF report for " + name);
    }
}
