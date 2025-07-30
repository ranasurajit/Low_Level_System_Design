package P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_2_Weather_Station.Violated_Code;

public class DataLogger {
    public void log(int temperature, int humidity) {
        System.out.println("[Logger] Recorded data -> Temp: " + temperature + ", Humidity: " + humidity);
    }
}
