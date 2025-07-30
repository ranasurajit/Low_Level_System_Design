package P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_2_Weather_Station.Refactored_Code.observers.impl;

import P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_2_Weather_Station.Refactored_Code.observers.WeatherObserver;

public class DataLogger implements WeatherObserver {
    @Override
    public void update(int temperature, int humidity) {
        System.out.println("[Logger] Recorded data -> Temp: " + temperature + ", Humidity: " + humidity);
    }
}
