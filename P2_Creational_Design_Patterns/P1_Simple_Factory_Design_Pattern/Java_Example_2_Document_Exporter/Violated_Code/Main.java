package P2_Creational_Design_Patterns.P1_Simple_Factory_Design_Pattern.Java_Example_2_Document_Exporter.Violated_Code;

import P2_Creational_Design_Patterns.P1_Simple_Factory_Design_Pattern.Java_Example_2_Document_Exporter.Violated_Code.services.ExportService;

public class Main {
    public static void main(String[] args) {
        ExportService service = new ExportService();

        service.exportDocument("PDF", "Low Level Design Guide");
        service.exportDocument("DOCX", "System Design Notes");
        service.exportDocument("HTML", "<h1>Design Patterns</h1>");
    }
}
