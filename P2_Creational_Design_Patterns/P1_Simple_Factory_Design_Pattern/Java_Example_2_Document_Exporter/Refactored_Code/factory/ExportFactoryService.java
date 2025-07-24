package P2_Creational_Design_Patterns.P1_Simple_Factory_Design_Pattern.Java_Example_2_Document_Exporter.Refactored_Code.factory;

import P2_Creational_Design_Patterns.P1_Simple_Factory_Design_Pattern.Java_Example_2_Document_Exporter.Refactored_Code.utils.ExportEnum;
import P2_Creational_Design_Patterns.P1_Simple_Factory_Design_Pattern.Java_Example_2_Document_Exporter.Refactored_Code.services.DocumentExporter;
import P2_Creational_Design_Patterns.P1_Simple_Factory_Design_Pattern.Java_Example_2_Document_Exporter.Refactored_Code.services.impl.DocxExporter;
import P2_Creational_Design_Patterns.P1_Simple_Factory_Design_Pattern.Java_Example_2_Document_Exporter.Refactored_Code.services.impl.HtmlExporter;
import P2_Creational_Design_Patterns.P1_Simple_Factory_Design_Pattern.Java_Example_2_Document_Exporter.Refactored_Code.services.impl.PdfExporter;

public class ExportFactoryService {
    public static DocumentExporter getExporter(ExportEnum type) {
        DocumentExporter factory = null;
        switch (type) {
            case PDF:
                factory = new PdfExporter();
                break;
            case DOCX:
                factory = new DocxExporter();
                break;
            case HTML:
                factory = new HtmlExporter();
                break;
            default:
                throw new IllegalArgumentException("Unknown argument passed : " + type);
        }
        return factory;
    }
}
