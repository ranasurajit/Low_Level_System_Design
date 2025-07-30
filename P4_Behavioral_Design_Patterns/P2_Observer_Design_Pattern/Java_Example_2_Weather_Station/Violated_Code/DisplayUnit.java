package P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_2_Weather_Station.Violated_Code;

public class DisplayUnit {
    public void show(int temperature, int humidity) {
        System.out.println("[Display] Temp: " + temperature + "°C, Humidity: " + humidity + "%");
    }
}
