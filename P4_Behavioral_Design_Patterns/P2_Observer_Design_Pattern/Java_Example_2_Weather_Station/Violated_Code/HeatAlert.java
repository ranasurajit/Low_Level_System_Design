package P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_2_Weather_Station.Violated_Code;

public class HeatAlert {
    private int threshold;

    public HeatAlert(int threshold) {
        this.threshold = threshold;
    }

    public void check(int temperature) {
        if (temperature > threshold) {
            System.out.println("[Alert] ⚠️ Heat Alert! Temp crossed " + threshold + "°C: " + temperature);
        }
    }
}
