package P1_SOLID_Principles.P1_SRP_Single_Responsibility_Principle.Java_Example_1.Refactored_Code;

import P1_SOLID_Principles.P1_SRP_Single_Responsibility_Principle.Java_Example_1.Refactored_Code.employee.Employee;
import P1_SOLID_Principles.P1_SRP_Single_Responsibility_Principle.Java_Example_1.Refactored_Code.entity.EntityValidator;
import P1_SOLID_Principles.P1_SRP_Single_Responsibility_Principle.Java_Example_1.Refactored_Code.persistence.IPersistence;
import P1_SOLID_Principles.P1_SRP_Single_Responsibility_Principle.Java_Example_1.Refactored_Code.persistence.impl.DBPersistence;
import P1_SOLID_Principles.P1_SRP_Single_Responsibility_Principle.Java_Example_1.Refactored_Code.reporter.IReporterGenerator;
import P1_SOLID_Principles.P1_SRP_Single_Responsibility_Principle.Java_Example_1.Refactored_Code.reporter.impl.PDFReportGenerator;

public class Refactored_Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Siri", 22, 1500000);
        EntityValidator validator = new EntityValidator();
        IPersistence persistence = new DBPersistence();
        IReporterGenerator generator = new PDFReportGenerator();

        String employeeDetails = employee.getDetails();
        boolean isValid = validator.isValid(employee.getName(), employee.getAge(), employee.getSalary());
        System.out.println(employeeDetails);
        System.out.println(isValid);
        persistence.save(employee.getName());
        generator.generatePDFReport(employee.getName());
    }
}
