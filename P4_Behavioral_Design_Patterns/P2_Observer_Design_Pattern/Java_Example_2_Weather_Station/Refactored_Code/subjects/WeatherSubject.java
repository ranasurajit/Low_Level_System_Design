package P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_2_Weather_Station.Refactored_Code.subjects;

import P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_2_Weather_Station.Refactored_Code.observers.WeatherObserver;

public interface WeatherSubject {
    public void addObserver(WeatherObserver observer);
    public void removeObserver(WeatherObserver observer);
    public void notifyObservers();
}
