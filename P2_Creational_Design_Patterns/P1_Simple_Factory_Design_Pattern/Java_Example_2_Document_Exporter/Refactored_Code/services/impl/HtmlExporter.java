package P2_Creational_Design_Patterns.P1_Simple_Factory_Design_Pattern.Java_Example_2_Document_Exporter.Refactored_Code.services.impl;

import P2_Creational_Design_Patterns.P1_Simple_Factory_Design_Pattern.Java_Example_2_Document_Exporter.Refactored_Code.services.DocumentExporter;

public class HtmlExporter implements DocumentExporter {
    @Override
    public void export(String content) {
        System.out.println("Exporting document as HTML: " + content);
    }
}
