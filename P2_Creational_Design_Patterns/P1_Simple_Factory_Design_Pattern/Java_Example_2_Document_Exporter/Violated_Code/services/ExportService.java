package P2_Creational_Design_Patterns.P1_Simple_Factory_Design_Pattern.Java_Example_2_Document_Exporter.Violated_Code.services;

import P2_Creational_Design_Patterns.P1_Simple_Factory_Design_Pattern.Java_Example_2_Document_Exporter.Violated_Code.services.impl.DocxExporter;
import P2_Creational_Design_Patterns.P1_Simple_Factory_Design_Pattern.Java_Example_2_Document_Exporter.Violated_Code.services.impl.HtmlExporter;
import P2_Creational_Design_Patterns.P1_Simple_Factory_Design_Pattern.Java_Example_2_Document_Exporter.Violated_Code.services.impl.PdfExporter;

public class ExportService {
    public void exportDocument(String format, String content) {
        DocumentExporter exporter;

        if ("PDF".equalsIgnoreCase(format)) {
            exporter = new PdfExporter();
        } else if ("DOCX".equalsIgnoreCase(format)) {
            exporter = new DocxExporter();
        } else if ("HTML".equalsIgnoreCase(format)) {
            exporter = new HtmlExporter();
        } else {
            throw new IllegalArgumentException("Unsupported format: " + format);
        }

        exporter.export(content);
    }
}
