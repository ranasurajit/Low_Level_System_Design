package P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_2_Weather_Station.Refactored_Code.observers.impl;

import P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_2_Weather_Station.Refactored_Code.observers.WeatherObserver;

public class HeatAlert implements WeatherObserver {
    private int threshold;

    public HeatAlert(int threshold) {
        this.threshold = threshold;
    }

    @Override
    public void update(int temperature, int humidity) {
        if (temperature > threshold) {
            System.out.println("[Alert] ⚠️ Heat Alert! Temp crossed " + threshold + "°C: " + temperature);
        }
    }
}
