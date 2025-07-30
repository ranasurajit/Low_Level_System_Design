package P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_2_Weather_Station.Violated_Code;

public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        station.setMeasurements(30, 65); // Normal weather
        station.setMeasurements(42, 70); // Triggers heat alert
    }
}
