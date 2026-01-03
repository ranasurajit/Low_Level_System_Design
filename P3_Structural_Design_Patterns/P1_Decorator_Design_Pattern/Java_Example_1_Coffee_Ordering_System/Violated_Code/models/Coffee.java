package P3_Structural_Design_Patterns.P1_Decorator_Design_Pattern.Java_Example_1_Coffee_Ordering_System.Violated_Code.models;

public class Coffee {
    private boolean milk;
    private boolean sugar;
    private boolean whippedCream;
    private boolean caramel;

    public Coffee(boolean milk, boolean sugar, boolean whippedCream, boolean caramel) {
        this.milk = milk;
        this.sugar = sugar;
        this.whippedCream = whippedCream;
        this.caramel = caramel;
    }

    public String getDescription() {
        String desc = "Coffee";
        if (milk)
            desc += ", Milk";
        if (sugar)
            desc += ", Sugar";
        if (whippedCream)
            desc += ", Whipped Cream";
        if (caramel)
            desc += ", Caramel";
        return desc;
    }

    public double getCost() {
        double cost = 50;
        if (milk)
            cost += 10;
        if (sugar)
            cost += 5;
        if (whippedCream)
            cost += 20;
        if (caramel)
            cost += 25;
        return cost;
    }
}
