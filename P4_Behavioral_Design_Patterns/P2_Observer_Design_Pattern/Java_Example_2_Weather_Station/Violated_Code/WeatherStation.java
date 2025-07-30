package P4_Behavioral_Design_Patterns.P2_Observer_Design_Pattern.Java_Example_2_Weather_Station.Violated_Code;

public class WeatherStation {
    private int temperature;
    private int humidity;

    private DisplayUnit displayUnit;
    private DataLogger dataLogger;
    private HeatAlert heatAlert;

    public WeatherStation() {
        this.displayUnit = new DisplayUnit();
        this.dataLogger = new DataLogger();
        this.heatAlert = new HeatAlert(40); // Trigger alert if temp > 40
    }

    public void setMeasurements(int temperature, int humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyComponents();
    }

    private void notifyComponents() {
        displayUnit.show(temperature, humidity);
        dataLogger.log(temperature, humidity);
        heatAlert.check(temperature);
    }
}
