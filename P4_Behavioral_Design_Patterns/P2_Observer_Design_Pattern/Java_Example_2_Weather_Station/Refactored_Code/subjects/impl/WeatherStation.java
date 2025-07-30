package P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_2_Weather_Station.Refactored_Code.subjects.impl;

import java.util.HashSet;
import java.util.Set;

import P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_2_Weather_Station.Refactored_Code.observers.WeatherObserver;
import P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_2_Weather_Station.Refactored_Code.subjects.WeatherSubject;

public class WeatherStation implements WeatherSubject {
    private int temperature;
    private int humidity;

    private Set<WeatherObserver> observers = new HashSet<WeatherObserver>();

    public void setMeasurements(int temperature, int humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObservers();
    }

    @Override
    public void addObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (WeatherObserver observer : observers) {
            observer.update(temperature, humidity);
        }
    }
}
