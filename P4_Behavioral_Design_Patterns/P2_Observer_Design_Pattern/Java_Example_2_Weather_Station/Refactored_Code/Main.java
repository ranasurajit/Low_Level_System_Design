package P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_2_Weather_Station.Refactored_Code;

import P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_2_Weather_Station.Refactored_Code.observers.impl.DataLogger;
import P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_2_Weather_Station.Refactored_Code.observers.impl.DisplayUnit;
import P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_2_Weather_Station.Refactored_Code.observers.impl.HeatAlert;
import P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_2_Weather_Station.Refactored_Code.subjects.impl.WeatherStation;

public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        station.addObserver(new DataLogger());
        station.addObserver(new DisplayUnit());
        station.addObserver(new HeatAlert(40));

        station.setMeasurements(30, 65); // Normal weather
        station.setMeasurements(42, 70); // Triggers heat alert
    }
}
