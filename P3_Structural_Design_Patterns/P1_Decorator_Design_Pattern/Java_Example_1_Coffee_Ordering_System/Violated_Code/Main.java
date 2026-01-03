package P3_Structural_Design_Patterns.P1_Decorator_Design_Pattern.Java_Example_1_Coffee_Ordering_System.Violated_Code;

import P3_Structural_Design_Patterns.P1_Decorator_Design_Pattern.Java_Example_1_Coffee_Ordering_System.Violated_Code.models.Coffee;

public class Main {
    public static void main(String[] args) {
        Coffee coffee1 = new Coffee(true, false, false, false);
        System.out.println(coffee1.getDescription());
        System.out.println("Cost: ₹" + coffee1.getCost());

        Coffee coffee2 = new Coffee(true, true, true, false);
        System.out.println(coffee2.getDescription());
        System.out.println("Cost: ₹" + coffee2.getCost());

        Coffee coffee3 = new Coffee(true, true, true, true);
        System.out.println(coffee3.getDescription());
        System.out.println("Cost: ₹" + coffee3.getCost());
    }
}
