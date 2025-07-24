package P2_Creational_Design_Patterns.P1_Simple_Factory_Design_Pattern.Java_Example_2_Document_Exporter.Refactored_Code;

import P2_Creational_Design_Patterns.P1_Simple_Factory_Design_Pattern.Java_Example_2_Document_Exporter.Refactored_Code.factory.ExportFactoryService;
import P2_Creational_Design_Patterns.P1_Simple_Factory_Design_Pattern.Java_Example_2_Document_Exporter.Refactored_Code.services.DocumentExporter;
import P2_Creational_Design_Patterns.P1_Simple_Factory_Design_Pattern.Java_Example_2_Document_Exporter.Refactored_Code.utils.ExportEnum;

public class Main {
    public static void main(String[] args) {
        DocumentExporter pdfExporter = ExportFactoryService.getExporter(ExportEnum.PDF);
        pdfExporter.export("Low Level Design Guide");

        DocumentExporter docxExporter = ExportFactoryService.getExporter(ExportEnum.DOCX);
        docxExporter.export("System Design Notes");

        DocumentExporter htmlExporter = ExportFactoryService.getExporter(ExportEnum.HTML);
        htmlExporter.export("<h1>Design Patterns</h1>");
    }
}
